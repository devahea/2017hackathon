package org.ahea.export;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GsonJsonExporterTest {

    //Gson gson = new Gson();

    Exporter gsonJsonExporter = new Exporter() {
        @Override
        public String export(Map<String, Object> data) {
            return null;
        }

        @Override
        public String export(List<Map<String, Object>> datas) {
            return null;
        }
    };

    @Test
    public void singleParamExport() throws Exception {

    }

    @Test
    public void MultiParamExport() throws Exception {

    }

}