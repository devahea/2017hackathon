package org.ahea.build.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private List<DataFilter> filters = new ArrayList<DataFilter>();
//    private Target target;

    public void addFilter(DataFilter filter) {
        filters.add(filter);
    }

    public boolean execute(Object value) {
        for (DataFilter filter : filters) {
            if(!filter.filter(value)) {
                return false;
            }
        }

        return true;

    }

//    public void setTarget(Target target) {
//        this.target = target;
//    }
}
