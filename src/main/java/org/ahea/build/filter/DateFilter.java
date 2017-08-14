package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@CommonsLog
public class DateFilter implements DataFilter<String> {

    @Override
    public Boolean filter(String value, List<String> conditions) {
        log.debug("DateFilter filter");
        return null;
    }
}
