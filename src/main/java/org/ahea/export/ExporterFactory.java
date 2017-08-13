package org.ahea.export;


import org.ahea.export.json.GsonJsonExporter;

public class ExporterFactory {

    public static Exporter newInstance(int exportType) {

        return new GsonJsonExporter();

    }
}
