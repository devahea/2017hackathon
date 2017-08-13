package org.ahea.sample;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SampleRepositoryTest {

    @Autowired
    SampleRepository sampleRepository;

    @Test
    public void createTest() {

        Sample sample = new Sample("test", "data");

        sampleRepository.save(sample);

    }

    @Test
    public void printList() {

        log.info("printList - {} ", sampleRepository.findAll());

    }

}