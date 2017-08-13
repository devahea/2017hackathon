package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.ResultData;

import java.util.List;
import java.util.Random;

public class SelectService {
    String generateData(FieldCategory fieldCategory){
        List<String> conditions = fieldCategory.getConditions();
        Random random = new Random(conditions.size());
        return conditions.get(random.nextInt());
    }


}
