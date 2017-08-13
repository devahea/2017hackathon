package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TypeHandler {

    public List<List<ResultData>> handle(List<FieldCategory> fieldCategoryList, Integer rowNumber){
        List<List<ResultData>> result = new ArrayList<>();
        GenetateDataInterface genetateDataInterface;

        for (int i = 0; i < rowNumber; i++){
            List<ResultData> resultDataes = new ArrayList<>();
            for (FieldCategory fieldCategory : fieldCategoryList) {
                ResultData resultData = new ResultData();

                genetateDataInterface = DataServiceFactory.dateServiceCreate(fieldCategory);
                String value = genetateDataInterface.genetateData(fieldCategory);

                resultData.setName(fieldCategory.getFieldName());
                resultData.setValue(value);

                //filter insert

                // list add domain
                resultDataes.add(resultData);
            }
            result.add(resultDataes);
        }

        return result;
    }

}
