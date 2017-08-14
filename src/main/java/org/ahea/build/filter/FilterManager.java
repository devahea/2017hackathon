package org.ahea.build.filter;

import java.util.List;

public class FilterManager {

    FilterChain filterChain;

    public FilterManager() {
        filterChain = new FilterChain();
//        filterChain.setTarget(target);
    }

    public void setFilter(DataFilter filter) {
        filterChain.addFilter(filter);
    }

    public Boolean filter(Object value){
        return filterChain.execute(value);
    }
}
