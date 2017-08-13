package org.ahea.export;


import org.ahea.export.json.GsonJsonExporter;
import org.ahea.export.xml.Dom4JXmlExporter;

public enum ExporterType {

    Json(GsonJsonExporter.class), Xml(Dom4JXmlExporter.class), Query(Class.class);

    public Class value;

    ExporterType(Class clz) {
        value = clz;
    }

    public Class getValue() {
        return value;
    }

}
