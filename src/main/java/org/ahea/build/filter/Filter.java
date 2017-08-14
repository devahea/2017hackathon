package org.ahea.build.filter;

import java.util.List;

public interface Filter<T> {

    public Boolean filter(T value);

}
