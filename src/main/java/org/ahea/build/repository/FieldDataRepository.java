package org.ahea.build.repository;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.FieldData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FieldDataRepository extends JpaRepository<FieldData,Long> {
    FieldData findByFieldCategoryIdAndId(String fieldCategoryId, long id);
}
