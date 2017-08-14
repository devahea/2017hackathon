package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.repository.FieldDataRepository;
import org.ahea.build.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepoService implements GenetateDataInterface {

    @Autowired
    FieldDataRepository fieldDataRepository;

    @Override
    public String genetateData(FieldCategory fieldCategory) {

        Integer count = fieldDataRepository.countByFieldCategoryId(fieldCategory.getDataType());
        return fieldDataRepository.findByFieldCategoryIdAndId(
                fieldCategory.getDataType(),
                Long.parseLong(RandomUtil.getRandomNumberString(count))).getData();

    }
}
