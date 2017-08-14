package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;

public class DataServiceFactory  {

    public static GenetateDataInterface dateServiceCreate(FieldCategory fieldCategory){
        try {
            return (GenetateDataInterface) fieldCategory.getCategoryType().getValue().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
