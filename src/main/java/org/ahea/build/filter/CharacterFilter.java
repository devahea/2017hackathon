package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.List;
import java.util.function.Predicate;

@CommonsLog
public class CharacterFilter implements DataFilter<String> {

    Predicate<String> condition;

    public CharacterFilter(Predicate<String> condition) {

        this.condition = condition;

    }

    @Override
    public Boolean filter(String value) {
        log.debug("CharacterFilter filter");

        return condition.test(value);

    }

}
