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
                if(fieldCategory.getType().startsWith("repo")){

                } else if("random".equals(fieldCategory.getType())){

                } else if("select".equals(fieldCategory.getType())) {

                } else if("date".equals(fieldCategory.getType())){

                }
            }
            result.put(Integer.toString(i),resultDataes);
        }

        return result;
    }

}
