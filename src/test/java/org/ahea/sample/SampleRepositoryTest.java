package org.ahea.sample;

import lombok.extern.slf4j.Slf4j;
import org.ahea.BootTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@Slf4j
public class SampleRepositoryTest extends BootTest{

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