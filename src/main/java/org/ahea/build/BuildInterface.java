package org.ahea.build;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;

import java.util.List;
import java.util.Map;

public interface BuildInterface {

    public Map<String, List<ResultData>> build(List<FieldCategory> fieldCategoryList, Integer rowNumber);
}
