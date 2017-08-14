package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.service.CategoryType;

@CommonsLog
public class FilterSelect {

    public FilterManager selectFilter(FieldCategory fieldCategory){

        FilterManager filterManager = new FilterManager();
        for(String condition : fieldCategory.getConditions()){
            CategoryType type = fieldCategory.getCategoryType();

            Filter filter = null;
            if(type.equals(CategoryType.Repo)){
                filterManager.setFilter( addRepoFilter(condition) );
            }else if(type.equals(CategoryType.Random)){
                filterManager.setFilter( addRandomFilter(condition) );
            }else if(type.equals(CategoryType.Select)){
//                filterManager.setFilter( addSelectFilter() );
            }else if(type.equals(CategoryType.Date)){
//                filterManager.setFilter( addDateFilter() );
            }else {
                throw new RuntimeException("category type error");
            }
        }

        return filterManager;
    }

    private Filter addRepoFilter(String condition){

        String sign = condition.split(",")[0];
        String comparison = condition.split(",")[1];

        Filter filter = null;

        if(sign.equals("first")){
            filter = new CharacterFilter(o -> o.startsWith(comparison));
        }else if(sign.equals("middle")){
            filter = new CharacterFilter(o -> o.contains(comparison));
        }else if(sign.equals("last")){
            filter = new CharacterFilter(o -> o.endsWith(comparison));
        }else {
            throw new RuntimeException("sign error");
        }

        return filter;
    }

    private Filter addRandomFilter(String condition){

        String sign = condition.split(",")[0];
        Integer comparison = Integer.parseInt(condition.split(",")[1]);

        Filter filter = null;
        if(sign.equals("<")){
            filter = new NumberFilter(o -> o < comparison);
        }else if(sign.equals("<=")){
            filter = new NumberFilter(o -> o < comparison);
        }else if(sign.equals(">")){
            filter = new NumberFilter(o -> o > comparison);
        }else if(sign.equals(">=")){
            filter = new NumberFilter(o -> o >= comparison);
        }else if(sign.equals("==")){
            filter = new NumberFilter(o -> o == comparison);
        }else if(sign.equals("!=")){
            filter = new NumberFilter(o -> o != comparison);
        }else {
            throw new RuntimeException("sign error");
        }

        return filter;
    }

//    private Filter addSelectFilter(){
//
//    }
//
//    private Filter addDateFilter(){
//
//    }

}
