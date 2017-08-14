package org.ahea.build;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.filter.CharacterFilter;
import org.ahea.build.filter.DateFilter;
import org.ahea.build.filter.FilterManager;
import org.ahea.build.filter.NumberFilter;
import org.junit.Test;

public class FilterTest {

    @Test
    public void filterTest(){
        FilterManager filterManager = new FilterManager();
        filterManager.setFilter(new CharacterFilter(o -> o.startsWith("최")));
//                filterManager.setFilter(new CharacterFilter(o -> o.contains("최")));
        filterManager.setFilter(new DateFilter(s -> s.contains("최")));
//        filterManager.setFilter(new NumberFilter());
//
        filterManager.filter("1234");
    }
}
