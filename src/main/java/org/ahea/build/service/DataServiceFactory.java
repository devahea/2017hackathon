package org.ahea.build.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@CommonsLog
@Component
public class DataServiceFactory  {


    public static ApplicationContext context;

    @Autowired
    public void setApplicationContext(ApplicationContext myContext)  {
        context = myContext;
    }

    public static GenetateDataInterface dateServiceCreate(FieldCategory fieldCategory){

        GenetateDataInterface result = null;

        try {

            Class generateDataInterfaceClaz = fieldCategory.getCategoryType().getValue();

            try {
                Object generateDataInterfaceBeanObject = context.getBean(generateDataInterfaceClaz);
                result = (GenetateDataInterface) generateDataInterfaceBeanObject;
            } catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
                result = (GenetateDataInterface) generateDataInterfaceClaz.newInstance();
            }

            return result;

        }
        catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(String.format("dateServiceCreate error-->%s",e.getMessage()));
        }
    }
}
