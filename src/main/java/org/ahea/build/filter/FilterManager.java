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

    public void filter(Object value, List<String> conditionList){
        filterChain.execute(value, conditionList);
    }
}
