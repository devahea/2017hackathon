package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.ArrayList;
import java.util.List;

@CommonsLog
public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>();
//    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public boolean execute(Object value) {
        for (Filter filter : filters) {
            if(!filter.filter(value)) {
                return true;
            }
        }

        return false;

    }

//    public void setTarget(Target target) {
//        this.target = target;
//    }
}
