package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.ArrayList;
import java.util.List;

@CommonsLog
public class NumberFilter implements DataFilter<String>{

    @Override
    public Boolean filter(String valu) {
        log.debug("NumberFilter filter");
//        int checkIndex = 0;
//        for(String condition : conditionList){
//            String sign = condition.split(",")[0];
//            Integer comparison = Integer.parseInt(condition.split(",")[1]);
//
//            if( check(sign, comparison, value) ){
//                checkIndex++;
//            }
//        }
//
//        if(conditionList.size() == checkIndex){
//            return false;
//        }

        return true;
    }

    private Boolean check(String sign, Integer comparison, Integer value){

        Boolean result = false;
        if(sign.equals("<")){
            result = value < comparison;
        }else if(sign.equals("<=")){
            result = value <= comparison;
        }else if(sign.equals(">")){
            result = value > comparison;
        }else if(sign.equals(">=")){
            result = value >= comparison;
        }else if(sign.equals("==")){
            result = value == comparison;
        }else if(sign.equals("!=")){
            result = value != comparison;
        }else {
            throw new RuntimeException("sign error");
        }
        return result;
    }

}
