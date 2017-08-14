package org.ahea.export;

import lombok.extern.slf4j.Slf4j;
import org.ahea.BootTest;
import org.ahea.export.json.GsonJsonExporter;
import org.ahea.export.sql.SqlBuilderSqlExporter;
import org.ahea.export.xml.Dom4JXmlExporter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@Slf4j
public class ExporterTypeTest extends BootTest{

    @Test
    public void jsonClassCheckTest() {
        Assert.assertEquals(ExporterType.Json.getValue(), GsonJsonExporter.class);
    }
    @Test
    public void xmlClassCheckTest() {
        Assert.assertEquals(ExporterType.Xml.getValue(), Dom4JXmlExporter.class);
    }
    @Test
    public void queryClassCheckTest() {
        Assert.assertEquals(ExporterType.Query.getValue(), SqlBuilderSqlExporter.class);
    }
}