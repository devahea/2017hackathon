package org.ahea.build.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;
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
            for (FieldCategory fieldCategory : fieldCategoryList) {
                ResultData resultData = new ResultData();

                genetateDataInterface = DataServiceFactory.dateServiceCreate(fieldCategory);
                Object value = genetateDataInterface.genetateData(fieldCategory);

                if (RandomUtil.isStringDouble(value.toString())
                        && !fieldCategory.getDataType().equals("string")) {
                    value = Double.parseDouble(value.toString());
                } else {
                    resultData = new ResultData<String>();
                }

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
