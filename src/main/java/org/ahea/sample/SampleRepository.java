package org.ahea.sample;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SampleRepository extends JpaRepository<Sample, Long>, SampleRepositoryCustom {



}
