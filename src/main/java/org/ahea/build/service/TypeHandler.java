package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.inter.BuildInterface;

import java.util.List;


public class TypeHandler {

    BuildInterface handle(List<FieldCategory> fieldCategoryList, Integer rowNumber){
        for (FieldCategory fieldCategory : fieldCategoryList) {
            if(fieldCategory.getType().startsWith("repo")){

            } else if("randem".equals(fieldCategory.getType())){

            } else if("select".equals(fieldCategory.getType())) {

            } else if("date".equals(fieldCategory.getType())){

            }
        }

        return null;
    }

}
