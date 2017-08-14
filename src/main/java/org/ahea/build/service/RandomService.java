package org.ahea.build.service;

import nl.flotsam.xeger.Xeger;
import org.ahea.build.entity.FieldCategory;

public class RandomService implements GenerateDataInterface {
    @Override
    public String genetateData(FieldCategory fieldCategory) {
        String regex = fieldCategory.getRegularExpression();
        if(regex == null || regex.equals("")){
            regex = "[0-9]{1}";
        }
        Xeger generator = new Xeger(regex);
        return generator.generate();
    }
}
