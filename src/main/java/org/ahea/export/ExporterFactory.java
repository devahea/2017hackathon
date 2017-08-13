package org.ahea.export;


import org.ahea.export.json.GsonJsonExporter;

public class ExporterFactory {

    public static Exporter newInstance(int exportType) {

        //todo
        //exportType을 Enum으로 바꾸자
        //exportType에 따라 Exporter객체 생성

        return new GsonJsonExporter();

    }
}
