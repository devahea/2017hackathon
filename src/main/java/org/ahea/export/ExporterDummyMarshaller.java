package org.ahea.export;


import org.ahea.build.entity.ResultData;

import java.util.List;
import java.util.Map;

public class ExporterDummyMarshaller {

    private ExporterDummyMarshaller() {

    }

    public static ExporterDummyMarshaller newInstance() {
        return new ExporterDummyMarshaller();
    }

    public List<Map<String, Object>> marshalling(Map<String, List<ResultData>> data) {
        return null;
    }



}
