package org.ahea.sample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import javax.persistence.EntityManager;

public class SampleRepositoryImpl extends QueryDslRepositorySupport implements SampleRepositoryCustom{

    private QSample sample = QSample.sample;;

    @Autowired
    private EntityManager entityManager;

    public SampleRepositoryImpl() {
        super(Sample.class);
    }

}
