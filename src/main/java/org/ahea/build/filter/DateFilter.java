package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.function.Predicate;

//@CommonsLog
public class DateFilter implements Filter<String> {

    private Predicate<String> condition;

    public DateFilter(Predicate<String> condition) {
        this.condition = condition;
    }

    @Override
    public Boolean filter(String value) {
//        log.debug("DateFilter filter");

        return condition.test(value);


    }
}
