package org.ahea.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.service.SelectService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@CommonsLog
public class SelectServiceTest {

    @Test
    public void selectServiceTest(){
        SelectService selectService = new SelectService();
        FieldCategory fieldCategory = new FieldCategory();
        List<String> conditions = new ArrayList<String>();
        conditions.add("남자");
        conditions.add("여자");
        conditions.add("남성");
        conditions.add("여성");
        conditions.add("1");
        conditions.add("2");
        conditions.add("3");
        fieldCategory.setConditions(conditions);
        log.debug(selectService.genetateData(fieldCategory));
    }
}
