package org.ahea.build.repository;


import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FieldCategoryRepositoryTest {

    @Autowired
    FieldDataRepository fieldDataRepository;

    @Test
    public void test(){
        log.info(fieldDataRepository.findByFieldCategoryIdAndId("1",20).toString());
    }

}