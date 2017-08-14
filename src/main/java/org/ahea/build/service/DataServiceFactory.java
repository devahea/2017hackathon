package org.ahea.build.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;

@CommonsLog
public class DataServiceFactory  {

    public static GenetateDataInterface dateServiceCreate(FieldCategory fieldCategory){
        try {
            return (GenetateDataInterface) fieldCategory.getCategoryType().getValue().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(String.format("dateServiceCreate error-->%s",e.getMessage()));
        }
    }
}
