package org.ahea.export.json;

import com.google.gson.Gson;
import lombok.extern.apachecommons.CommonsLog;
import org.ahea.export.Exporter;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
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

@CommonsLog
public class GsonJsonExporterTest {

    private Gson gson = new Gson();
    Exporter gsonJsonExporter;
    Map<String, Object> sampleData;
    Map<String, Object> sampleData2;
    List<Map<String, Object>> arrayListData;

    @Before
    public void setup(){
        sampleData = new HashMap<>();
        gsonJsonExporter = new GsonJsonExporter();

        sampleData.put("이름", "김민수");
        sampleData.put("성별", 25);
        sampleData.put("성별", "남");

        sampleData2 = new HashMap<>();
        sampleData2.put("이름", "최경운");
        sampleData2.put("성별", 20);
        sampleData2.put("성별", "남");

        arrayListData = new ArrayList<>();
        String[] names = {"김민수", "김민순", "김민주"};
        String[] genders = {"M", "W", "M"};
        int[] ages = {25, 28, 35};
        for (int i = 0; i<names.length; i++){
            Map<String, Object> data = new HashMap<>();
            data.put("이름", names[i]);
            data.put("성별", genders[i]);
            data.put("나이", ages[i]);
            arrayListData.add(data);
        }
    }
    @Test
    public void singleParamDefaultOptionExport() throws Exception {
        //When
        String testResult = gsonJsonExporter.export(sampleData, null);

        String rightResult = gson.toJson(sampleData);
        //Then
        assertThat(testResult, is(rightResult));
    }

    @Test
    public void singleParamDefaultOptionExportError() throws Exception {
        //When
        String testResult = gsonJsonExporter.export(sampleData, null);

        String rightResult = gson.toJson(sampleData2);
        //Then
        assertNotEquals(testResult, is(rightResult));
    }

    @Test
    public void MultiParamDefaultOptionExport() throws Exception {
        //When
        String testResult = gsonJsonExporter.export(arrayListData, null);
        String rightResult = gson.toJson(arrayListData);

        //then
        assertThat(testResult, is(rightResult));

    }

}