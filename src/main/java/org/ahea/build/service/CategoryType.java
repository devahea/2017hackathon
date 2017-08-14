package org.ahea.build.service;

import java.lang.Class;

public enum CategoryType {
    Random(RandomService.class),Select(SelectService.class),Date(DateService.class),Repo(RepoService.class);

    public Class value;

    CategoryType(Class value) {
        this.value = value;
    }

    public Class getValue() {
        return value;
    }
}
