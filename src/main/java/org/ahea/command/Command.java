package org.ahea.command;


import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;
import org.ahea.build.inter.BuildInterface;
import org.ahea.export.Exporter;
import org.ahea.export.ExporterDummyMarshaller;
import org.ahea.export.ExporterFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class Command {

    @Autowired
    BuildInterface buildInterface;

    public String input(Map params) {

        List<FieldCategory> fieldCategoryList = (List<FieldCategory>) params.get("fieldCategoryList");
        Integer dataLength = (Integer) params.get("dataLength");
        Map option = (Map) params.get("option");

        Map<String, List<ResultData>> dummyBuildResult = buildDummy(fieldCategoryList, dataLength);

        return exportDummy(ExporterFactory.newInstance(0), ExporterDummyMarshaller.newInstance().marshalling(dummyBuildResult) , option);

    }

    public Map<String, List<ResultData>> buildDummy(List<FieldCategory> fieldCategoryList, Integer dataLength) {

         return buildInterface.build(fieldCategoryList, dataLength);

    }

    public String exportDummy(Exporter exporter, List<Map<String, Object>> dummyData, Map option) {

        return exporter.export(dummyData, option);

    }

}
