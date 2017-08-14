package org.ahea.export.xml;

import lombok.extern.slf4j.Slf4j;
import org.ahea.BootTest;
import org.ahea.export.Exporter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class Dom4JXmlExporterTest extends BootTest{


    Exporter exporter = new Dom4JXmlExporter();

    @Test
    public void singleParamExport() throws Exception {

        Map<String, Object> data = new HashMap<>();
        data.put("이름", "김민수");
        data.put("성별", 25);
        data.put("성별", "남");

        Map<String, Object> option = new HashMap();
        option.put("rootElement", "dataSet");
        option.put("recordElement","record");

        log.info("Dom4j print test {}", exporter.export(data, option));

    }

    @Test
    public void multiParamExport() throws Exception {

        //Given
        List<Map<String, Object>> datas = new ArrayList<>();
        String[] names = {"김민수", "김민순", "김민주"};
        String[] genders = {"M", "W", "M"};
        int[] ages = {25, 28, 35};

        for (int i = 0; i<names.length; i++){
            Map<String, Object> data = new HashMap<>();
            data.put("이름", names[i]);
            data.put("성별", genders[i]);
            data.put("나이", ages[i]);
            datas.add(data);
        }

        Map<String, Object> option = new HashMap();
        option.put("rootElement", "dataSet");
        option.put("recordElement","record");

        log.info("Dom4j print test {}", exporter.export(datas, option));

    }

}