package org.ahea.export.json;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class GsonJsonExporter implements JsonExporter {

    private Gson gson = new Gson();

    @Override
    public String export(Map<String, Object> data, Map option) {
        // TODO: 유틸?
        List<Map<String, Object>> datas = new ArrayList<>();
        datas.add(data);

        return this.export(datas, option);
    }

    @Override
    public String export(List<Map<String, Object>> datas, Map option) {
        List<Map<String, Object>> dataAppliedOption = this.applyOption(datas);
        return this.parseJson(dataAppliedOption);
    }

    // TODO: 제일 상위?
    private List<Map<String, Object>> applyOption(List<Map<String, Object>> datas){
        // TODO: 옵션 적용
        return datas;
    }

    @Override
    public String parseJson(List<Map<String, Object>> datas){
        Object finalData = null;

        // TODO: 유틸?
        if(datas.size() == 1){
            finalData = datas.get(0);
        }else{
            finalData = datas;
        }

        return gson.toJson(finalData);
    }
}