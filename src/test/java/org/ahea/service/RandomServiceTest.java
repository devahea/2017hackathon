package org.ahea.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.service.RandomService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@CommonsLog
public class RandomServiceTest {

    @Test
    public void randomServiceTest(){
        RandomService randomService = new RandomService();
        FieldCategory fieldCategory = new FieldCategory();
        fieldCategory.setRegularExpression("(01[01]{1})-([0-9]{4})-([0-9]{4})");
        log.debug(randomService.genetateData(fieldCategory));
    }
}
