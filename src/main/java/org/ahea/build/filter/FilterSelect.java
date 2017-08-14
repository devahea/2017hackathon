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

            DataFilter dataFilter = null;
            if(type.equals(CategoryType.Repo)){
                filterManager = addRepoFilter(condition);
            }else if(type.equals(CategoryType.Random)){
                filterManager = addRandomFilter(condition);
            }else if(type.equals(CategoryType.Select)){
                filterManager = addSelectFilter();
            }else if(type.equals(CategoryType.Date)){
                filterManager = addDateFilter();
            }else {
                throw new RuntimeException("category type error");
            }
        }

        return filterManager;
    }

    private FilterManager addRepoFilter(String condition){

        String sign = condition.split(",")[0];
        String comparison = condition.split(",")[1];

        FilterManager filterManager = new FilterManager();

        if(sign.equals("first")){
            filterManager.setFilter(new CharacterFilter(o -> o.startsWith(comparison)));
        }else if(sign.equals("middle")){
            filterManager.setFilter(new CharacterFilter(o -> o.contains(comparison)));
        }else if(sign.equals("last")){
            filterManager.setFilter(new CharacterFilter(o -> o.endsWith(comparison)));
        }else {
            throw new RuntimeException("sign error");
        }

        return null;
    }

    private FilterManager addRandomFilter(String condition){

        String sign = condition.split(",")[0];
        Integer comparison = Integer.parseInt(condition.split(",")[1]);

        FilterManager filterManager = new FilterManager();

        if(sign.equals("<")){
            filterManager.setFilter(new NumberFilter(o -> o < comparison));
        }else if(sign.equals("<=")){
            filterManager.setFilter(new NumberFilter(o -> o <= comparison));
        }else if(sign.equals(">")){
            filterManager.setFilter(new NumberFilter(o -> o > comparison));
        }else if(sign.equals(">=")){
            filterManager.setFilter(new NumberFilter(o -> o >= comparison));
        }else if(sign.equals("==")){
            filterManager.setFilter(new NumberFilter(o -> o == comparison));
        }else if(sign.equals("!=")){
            filterManager.setFilter(new NumberFilter(o -> o != comparison));
        }else {
            throw new RuntimeException("sign error");
        }

        return filterManager;
    }

    private FilterManager addSelectFilter(){
        FilterManager filterManager = new FilterManager();
        return filterManager;
    }

    private FilterManager addDateFilter(){
        FilterManager filterManager = new FilterManager();
        return filterManager;
    }

}
