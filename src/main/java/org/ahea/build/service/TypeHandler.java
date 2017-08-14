package org.ahea.build.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;
import org.ahea.build.filter.*;
import org.ahea.build.util.RandomUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CommonsLog
public class TypeHandler {

    public List<List<ResultData>> handle(List<FieldCategory> fieldCategoryList, Integer rowNumber){
        List<List<ResultData>> result = new ArrayList<>();
        GenetateDataInterface genetateDataInterface;

        for (int i = 0; i < rowNumber; i++){
            List<ResultData> resultDataes = new ArrayList<>();

            for(int fieldIndex = 0 ; fieldIndex < fieldCategoryList.size() ; fieldIndex++){
//            for (FieldCategory fieldCategory : fieldCategoryList) {
                FieldCategory fieldCategory = fieldCategoryList.get(fieldIndex);
                ResultData resultData = new ResultData();

                genetateDataInterface = DataServiceFactory.dateServiceCreate(fieldCategory);
                Object value = genetateDataInterface.genetateData(fieldCategory);

                //filter insert
                FilterManager filterManager = fieldCategory.getFilterManager();

                if( filterManager.filter(value) ){
                    fieldIndex--;
                    continue;
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
