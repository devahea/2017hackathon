package org.ahea.export.sql;

import com.healthmarketscience.sqlbuilder.InsertQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class SqlBuilderSqlExporter implements SqlExporter {

    @Override
    public String export(Map<String, Object> data, Map option) {
        List<Map<String, Object>> datas = new ArrayList<>();
        datas.add(data);
        return this.export(datas, option);
    }

    @Override
    public String export(List<Map<String, Object>> datas, Map option) {
        String tempTable = "temp_member";
        return this.parseSql(datas, tempTable);
    }

    public String parseSql(List<Map<String, Object>> datas, String tableStr) {
        StringBuilder stringBuilder = new StringBuilder();
        String sqls = null;

        for(Map<String, Object> data : datas){
            InsertQuery insertQuery = new InsertQuery(tableStr);
            for(String key : data.keySet()){
                insertQuery.addCustomColumn(key, data.get(key));
            }
            stringBuilder.append(insertQuery.validate().toString());
            stringBuilder.append(";\n");
        }
        sqls = stringBuilder.toString();

        return this.removeLastNewLine(sqls);
    }

    private String removeLastNewLine(String s){
        return s.substring(0, s.length()-1 );
    }
}
