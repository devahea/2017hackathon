package org.ahea.build.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;
import org.ahea.build.filter.*;
import org.ahea.build.util.RandomUtil;

import javax.xml.crypto.Data;
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

//                DataFilter filter ;
//                if (RandomUtil.isStringDouble(value.toString())
//                        && !fieldCategory.getDataType().equals("string")) {
//                    value = Double.parseDouble(value.toString());
//                    filter = new NumberFilter();
//                } else {
//                    resultData = new ResultData<String>();
//                    if(genetateDataInterface instanceof DateService){
//                        filter = new DateFilter();
//                    }else {
//                        filter = new CharacterFilter();
//                    }
//                }

                //filter insert
//                FilterManager filterManager = new FilterManager();
//                filterManager.setFilter(new CharacterFilter(o -> o.startsWith("최")));
//                filterManager.setFilter(new CharacterFilter(o -> o.contains("최")));
//                filterManager.setFilter(new DateFilter(s -> s.contains("최")));
//                filterManager.setFilter(new NumberFilter());
//
//                filterManager.filter(value, fieldCategory.getConditions());
////                if( filter.filter(value, fieldCategory.getConditions()) ){
////                    fieldIndex--;
////                    continue;
////                }

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
