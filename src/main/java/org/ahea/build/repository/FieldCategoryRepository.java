package org.ahea.build.repository;

import org.ahea.build.entity.FieldCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface FieldCategoryRepository extends JpaRepository<FieldCategory,UUID> {
}
