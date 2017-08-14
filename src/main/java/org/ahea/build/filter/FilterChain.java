package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.ArrayList;
import java.util.List;

@CommonsLog
public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public boolean execute(Object value) {
        int index = 0;
        for (Filter filter : filters) {
            if( !filter.filter(value) ) {
                return true;
            }
        }
        return false;

    }
}
