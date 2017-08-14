package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@CommonsLog
public class FilterManager {

    FilterChain filterChain;

    public FilterManager() {
        filterChain = new FilterChain();
    }

    public void setFilter(DataFilter filter) {
        log.debug(filter);
        filterChain.addFilter(filter);
    }

    public Boolean filter(Object value){
        return filterChain.execute(value);
    }
}
