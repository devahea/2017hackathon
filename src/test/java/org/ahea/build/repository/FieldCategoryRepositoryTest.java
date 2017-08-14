package org.ahea.build.repository;


import lombok.extern.apachecommons.CommonsLog;
import org.ahea.BootTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@CommonsLog
public class FieldCategoryRepositoryTest extends BootTest{

    @Autowired
    FieldDataRepository fieldDataRepository;

    @Test
    public void test(){
        log.info(fieldDataRepository.countByFieldCategoryId("1") + "");
    }

}