package org.ahea.build.repository;

import org.ahea.build.entity.FieldCategory;
import org.ahea.build.entity.FieldData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FieldDataRepository extends JpaRepository<FieldData,Long> {
    FieldData findByFieldCategoryIdAndRowNum(String fieldCategoryId, long rowNum);

    Integer countByFieldCategoryId(String fieldCategoryId);
}
