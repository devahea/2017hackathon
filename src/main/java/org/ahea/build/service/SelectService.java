package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;

import java.util.List;
import java.util.Random;

public class SelectService implements GenerateDataInterface {
    @Override
    public String genetateData(FieldCategory fieldCategory) {
        List<String> conditions = fieldCategory.getConditions();
        Random random = new Random();
        return conditions.get(random.nextInt(conditions.size()));
    }
}
