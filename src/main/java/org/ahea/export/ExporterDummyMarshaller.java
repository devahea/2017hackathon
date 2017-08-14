package org.ahea.export;


import org.ahea.build.entity.ResultData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExporterDummyMarshaller {

    private ExporterDummyMarshaller() {
    }

    public static ExporterDummyMarshaller newInstance() {
        return new ExporterDummyMarshaller();
    }

    public List<Map<String, Object>> marshalling(List<List<ResultData>> data) {

        List<Map<String, Object>> result = new ArrayList<>();

        data.forEach((resultDatas) -> {

            Map fieldData = new HashMap();

            resultDatas.forEach(resultData -> {
                
                fieldData.put(resultData.getName(),resultData.getValue());

            });

            result.add(fieldData);

        });

        return result;
    }



}
