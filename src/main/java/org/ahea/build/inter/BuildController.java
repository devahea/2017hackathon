package org.ahea.build.inter;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;
import org.ahea.build.service.TypeHandler;

import java.util.List;
import java.util.Map;

public class BuildController implements BuildInterface{

    @Override
    public List<List<ResultData>> build(List<FieldCategory> fieldCategoryList, Integer rowNumber) {

        TypeHandler typeHandler = new TypeHandler();

        return typeHandler.handle(fieldCategoryList, rowNumber);
    }
}
