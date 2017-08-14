package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.function.Predicate;

public class NumberFilter implements Filter<Integer> {

    Predicate<Integer> condition;

    public NumberFilter(Predicate<Integer> condition) {
        this.condition = condition;
    }

    @Override
    public Boolean filter(Integer value) {
        return condition.test(value);
    }

}
