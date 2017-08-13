package org.ahea.export;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ExporterTypeTest {

    @Test
    public void jsonClassCheckTest() {

        log.info("json exporter class {}", ExporterType.Json.getValue());

        log.info("xml exporter class {}", ExporterType.Xml.getValue());

        log.info("query exporter class {}", ExporterType.Query.getValue());


    }

}