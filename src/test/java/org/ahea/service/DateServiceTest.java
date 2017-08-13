package org.ahea.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.service.DateService;
import org.junit.Test;

/**
 * Created by mio on 2017. 8. 14..
 */
@CommonsLog
public class DateServiceTest {
    @Test
    public void DateServiceFormatTest(){
        DateService dateService = new DateService("yyyy/MM/dd HH:mm:ss");
        log.debug(dateService.generateDateFormat());
    }
}
