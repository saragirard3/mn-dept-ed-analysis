package com.girard.mndeptedanalysis.repository;

import com.girard.mndeptedanalysis.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

}
