package org.ahea.build.service;

import nl.flotsam.xeger.Xeger;
import org.ahea.build.entity.FieldCategory;

public class RandomService implements GenetateDataInterface {
    @Override
    public String genetateData(FieldCategory fieldCategory) {
        String regex = fieldCategory.getRegularExpression();
        Xeger generator = new Xeger(regex);
        return generator.generate();
    }
}
