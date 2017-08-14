package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@CommonsLog
public class NumberFilter implements DataFilter<Integer>{

    Predicate<Integer> condition;

    public NumberFilter(Predicate<Integer> condition) {

        this.condition = condition;

    }

    @Override
    public Boolean filter(Integer value) {
        log.debug("NumberFilter filter");
        return condition.test(value);
    }

}
