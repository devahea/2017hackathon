package org.ahea.export;


import org.ahea.export.json.GsonJsonExporter;

public class ExporterFactory {

    public static Exporter newInstance(ExporterType exportType) {

        try {
            return (Exporter) exportType.getValue().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
