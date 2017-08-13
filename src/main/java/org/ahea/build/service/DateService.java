package org.ahea.build.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@CommonsLog
public class DateService implements GenetateDataInterface {
    @Override
    public String genetateData(FieldCategory fieldCategory) {
        String format = fieldCategory.getConditions().get(0);
        if(format == null){
            throw new RuntimeException("Date format have to define");
        }
        Random RANDOM = new SecureRandom();
        Date date = new Date(Math.abs(System.currentTimeMillis()- RANDOM.nextInt()));
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }
}
