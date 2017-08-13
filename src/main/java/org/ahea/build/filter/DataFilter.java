package org.ahea.build.filter;

import java.util.List;

public interface DataFilter<T> {

    public Boolean filter(T value, List<String> conditions);

}
