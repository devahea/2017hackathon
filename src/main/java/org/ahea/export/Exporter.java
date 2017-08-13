package org.ahea.export;

import java.util.List;
import java.util.Map;

public interface Exporter {
    String export(Map<String, Object>);
    String export(List<Map<String, Object>>);
}
