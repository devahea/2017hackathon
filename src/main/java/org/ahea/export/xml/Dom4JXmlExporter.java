package org.ahea.export.xml;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Dom4JXmlExporter implements XmlExporter{


    @Override
    public String export(Map<String, Object> data, Map option) {

        String rootElement = (String) option.get("rootElement");
        String recordElement = (String) option.get("recordElement");


        Document document = DocumentHelper.createDocument();
        Element root = document.addElement( rootElement );

        Element element = root.addElement( recordElement );

        data.keySet().forEach(s -> element.addElement(s).addText((String) data.get(s)));

        return document.asXML();

    }

    @Override
    public String export(List<Map<String, Object>> datas, Map option) {

        String rootElement = (String) option.get("rootElement");
        String recordElement = (String) option.get("recordElement");


        Document document = DocumentHelper.createDocument();
        Element root = document.addElement( rootElement );


        datas.forEach(data -> {
            Element element = root.addElement( recordElement );
            data.keySet().stream().forEach(s -> element.addElement(s).addText(data.get(s).toString()));
        } );

        return document.asXML();

    }

}
