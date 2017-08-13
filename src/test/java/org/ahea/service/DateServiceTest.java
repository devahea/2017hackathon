package org.ahea.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.service.DateService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mio on 2017. 8. 14..
 */
@CommonsLog
public class DateServiceTest {
    @Test
    public void DateServiceFormatTest(){
        DateService dateService = new DateService();
        FieldCategory fieldCategory = new FieldCategory();
        List<String> conditions = new ArrayList<>();
        conditions.add("yyyy/MM/dd HH:mm:ss");
        fieldCategory.setConditions(conditions);
        log.debug(dateService.genetateData(fieldCategory));
    }
}
