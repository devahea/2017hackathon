package org.ahea.export.json;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.ahea.export.Exporter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GsonJsonExporterTest {

    private Gson gson = new Gson();

    @Autowired
    Exporter gsonJsonExporter;

    @Test
    public void singleParamDefaultOptionExport() throws Exception {

        //Given
        Map<String, Object> data = new HashMap<>();
        data.put("이름", "김민수");
        data.put("성별", 25);
        data.put("성별", "남");

        //When
        String testResult = gsonJsonExporter.export(data, null);
        String rightResult = gson.toJson(data);

        //Then
        assertThat(testResult, is(rightResult));

        log.info("testResult ::: {}", testResult);
    }

    @Test
    public void MultiParamDefaultOptionExport() throws Exception {

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

        //When
        String testResult = gsonJsonExporter.export(datas, null);
        String rightResult = gson.toJson(datas);

        //then
        assertThat(testResult, is(rightResult));
        log.info("testResult ::: {}", testResult);
    }

}