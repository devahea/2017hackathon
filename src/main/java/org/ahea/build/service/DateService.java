package org.ahea.build.service;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateService implements GenerateDataInterface {
    @Override
    public String genetateData(FieldCategory fieldCategory) {
        String format = fieldCategory.getRegularExpression();
        if(format == null){
            format = "yyyy/MM/dd HH:mm:ss";
        }
        Random RANDOM = new SecureRandom();
        Date date = new Date(Math.abs(System.currentTimeMillis()- RANDOM.nextInt()));
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }
}
