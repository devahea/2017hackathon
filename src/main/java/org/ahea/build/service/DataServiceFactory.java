package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;

public class DataServiceFactory  {

    public static GenetateDataInterface dateServiceCreate(FieldCategory fieldCategory){
        if("repo".equals(fieldCategory.getCategoryType())){

        } else if("random".equals(fieldCategory.getCategoryType())){
            return new RandomService();
        } else if("select".equals(fieldCategory.getCategoryType())) {
            return new SelectService();
        } else if("date".equals(fieldCategory.getCategoryType())){
            return new DateService();
        } else {
            throw new RuntimeException("file category can not determain");
        }
        return null;
    }
}
