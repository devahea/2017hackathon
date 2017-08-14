package org.ahea.build.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private List<DataFilter> filters = new ArrayList<DataFilter>();
//    private Target target;

    public void addFilter(DataFilter filter) {
        filters.add(filter);
    }

    public void execute(String value, List<String> conditions) {
        for (DataFilter filter : filters) {
            filter.filter(value, conditions);   // 필터들을 순차적으로 실행
        }
    }

//    public void setTarget(Target target) {
//        this.target = target;
//    }
}
