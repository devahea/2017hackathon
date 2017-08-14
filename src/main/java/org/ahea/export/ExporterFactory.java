package org.ahea.export;


public class ExporterFactory {

    public static Exporter newInstance(ExporterType exportType) {

        try {
            return (Exporter) exportType.getValue().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(String.format("ExporterFactory exception-->%s",e.getMessage()));
        }
    }
}
