package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.ArrayList;
import java.util.List;

@CommonsLog
public class FilterChain {

    private List<DataFilter> filters = new ArrayList<DataFilter>();
//    private Target target;

    public void addFilter(DataFilter filter) {
        filters.add(filter);
    }

    public boolean execute(Object value) {
        log.debug(filters.size());
        for (DataFilter filter : filters) {
            log.debug("filter null check : " + (filter == null));
            if(!filter.filter(value)) {
                log.debug("====false====");
                return false;
            }
        }

        return true;

    }

//    public void setTarget(Target target) {
//        this.target = target;
//    }
}
