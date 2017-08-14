package org.ahea.command;


import org.ahea.Constant.Constant;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;
import org.ahea.build.inter.BuildController;
import org.ahea.build.inter.BuildInterface;
import org.ahea.export.Exporter;
import org.ahea.export.ExporterDummyMarshaller;
import org.ahea.export.ExporterFactory;
import org.ahea.export.ExporterType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class Command {

    public String input(Map params) {

        List<FieldCategory> fieldCategoryList = (List<FieldCategory>) params.get(Constant.KEY_FIELD_CATEGORY_LIST);
        Integer dataLength = (Integer) params.get(Constant.KEY_DATA_LENGHT);
        Map option = (Map) params.get(Constant.KEY_OPTION);

        List<List<ResultData>> dummyBuildResult = buildDummy(fieldCategoryList, dataLength);

        return exportDummy(ExporterFactory.newInstance(ExporterType.Json), ExporterDummyMarshaller.newInstance().marshalling(dummyBuildResult) , option);

    }

    public List<List<ResultData>> buildDummy(List<FieldCategory> fieldCategoryList, Integer dataLength) {
        BuildInterface buildInterface = new BuildController();
         return buildInterface.build(fieldCategoryList, dataLength);

    }

    public String exportDummy(Exporter exporter, List<Map<String, Object>> dummyData, Map option) {

        return exporter.export(dummyData, option);

    }

}
