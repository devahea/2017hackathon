package org.ahea.build.entity;

import lombok.Data;

@Data
public class ResultData<T> {

    String name;
    T value;
}
