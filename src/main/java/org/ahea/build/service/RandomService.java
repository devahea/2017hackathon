package org.ahea.build.service;

import nl.flotsam.xeger.Xeger;
import org.ahea.build.entity.FieldCategory;

public class RandomService implements GenetateDataInterface {
    @Override
    public String genetateData(FieldCategory fieldCategory) {
        Xeger generator = new Xeger(fieldCategory.getRegularExpression());
        return generator.generate();
    }
}
