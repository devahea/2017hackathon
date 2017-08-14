package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

@CommonsLog
public class DateFilter implements DataFilter<String> {

    private Predicate<String> condition;

    public DateFilter(Predicate<String> condition) {
        this.condition = condition;
    }

    @Override
    public Boolean filter(String value, List<String> conditions) {
        log.debug("DateFilter filter");

        return condition.test(value);


    }
}
