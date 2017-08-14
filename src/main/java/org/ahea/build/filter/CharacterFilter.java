package org.ahea.build.filter;

import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@CommonsLog
public class CharacterFilter implements DataFilter<String> {

    @Override
    public Boolean filter(String value, List<String> conditions) {
        log.debug("CharacterFilter filter");
        return null;
    }

}
