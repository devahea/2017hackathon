package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TypeHandler {

    Map<String, List<ResultData>> handle(List<FieldCategory> fieldCategoryList, Integer rowNumber){
        Map<String, List<ResultData>> result = new HashMap<>();

        for (int i = 0; i < rowNumber; i++){
            List<ResultData> resultDataes = new ArrayList<>();
            for (FieldCategory fieldCategory : fieldCategoryList) {
                ResultData resultData = new ResultData();
                GenetateDataInterface genetateDataInterface;
                String value = "";
                if(fieldCategory.getCategoryType().startsWith("repo")){

                } else if("random".equals(fieldCategory.getCategoryType())){
                    genetateDataInterface = new RandomService();
                    value = genetateDataInterface.genetateData(fieldCategory);
                } else if("select".equals(fieldCategory.getCategoryType())) {
                    genetateDataInterface = new SelectService();
                    value = genetateDataInterface.genetateData(fieldCategory);
                } else if("date".equals(fieldCategory.getCategoryType())){
                    genetateDataInterface = new DateService();
                    value = genetateDataInterface.genetateData(fieldCategory);
                }

                resultData.setName(fieldCategory.getFieldName());
                resultData.setValue(value);
                resultData.setType(fieldCategory.getDataType());

                //filter insert

                // list add domain
                resultDataes.add(resultData);
            }
            result.put(Integer.toString(i),resultDataes);
        }

        return result;
    }

}
