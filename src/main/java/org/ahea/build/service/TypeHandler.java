package org.ahea.build.service;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;
import org.ahea.build.filter.*;
import org.ahea.build.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;


@Slf4j
public class TypeHandler {

    public List<List<ResultData>> handle(List<FieldCategory> fieldCategoryList, Integer rowNumber){
        List<List<ResultData>> result = new ArrayList<>();
        GenerateDataInterface generateDataInterface;

        for (int i = 0; i < rowNumber; i++){
            List<ResultData> resultDataes = new ArrayList<>();

            for(int fieldIndex = 0 ; fieldIndex < fieldCategoryList.size() ; fieldIndex++){
                FieldCategory fieldCategory = fieldCategoryList.get(fieldIndex);
                ResultData resultData = new ResultData();

                generateDataInterface = DataServiceFactory.dateServiceCreate(fieldCategory);
                Object value = generateDataInterface.genetateData(fieldCategory);

                if(fieldCategory.getConditions() != null){
                    //filter insert
                    FilterSelect filterSelect = new FilterSelect();
                    FilterManager filterManager = filterSelect.selectFilter(fieldCategory);

                    if(RandomUtil.isStringDouble(value.toString())){
                        value = Integer.parseInt(value.toString());
                    }
                    if( filterManager.filter(value) ){
                        fieldIndex--;
                        continue;
                    }
                }

                resultData.setName(fieldCategory.getFieldName());
                resultData.setValue(value);

                // list add domain
                resultDataes.add(resultData);
            }
            result.add(resultDataes);
        }

        return result;
    }

}
