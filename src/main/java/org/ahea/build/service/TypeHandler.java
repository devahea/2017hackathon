package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;
import org.ahea.build.inter.BuildInterface;

import java.util.List;
import java.util.Map;


public class TypeHandler {

    Map<String, List<ResultData>> handle(List<FieldCategory> fieldCategoryList, Integer rowNumber){
        for (int i = 0; i < rowNumber; i++){
            for (FieldCategory fieldCategory : fieldCategoryList) {
                if(fieldCategory.getType().startsWith("repo")){

                } else if("random".equals(fieldCategory.getType())){

                } else if("select".equals(fieldCategory.getType())) {

                } else if("date".equals(fieldCategory.getType())){

                }
            }
        }

        return null;
    }

}
