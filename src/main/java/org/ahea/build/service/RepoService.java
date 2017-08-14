package org.ahea.build.service;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.repository.FieldDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepoService implements GenetateDataInterface {


    @Autowired
    FieldDataRepository fieldDataRepository;

    @Override
    public String genetateData(FieldCategory fieldCategory) {



        fieldDataRepository.findByFieldCategoryIdAndId("", 0);

        return null;
    }
}
