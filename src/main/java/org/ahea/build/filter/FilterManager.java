package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class FilterManager {

    FilterChain filterChain;

    public FilterManager() {
        filterChain = new FilterChain();
    }

    public void setFilter(Filter filter) {
        log.debug(filter);
        filterChain.addFilter(filter);
    }

    public Boolean filter(Object value){
        return filterChain.execute(value);
    }
}
