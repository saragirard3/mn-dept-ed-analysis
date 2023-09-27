package com.girard.mndeptedanalysis.service;

import com.girard.mndeptedanalysis.entity.District;
import com.girard.mndeptedanalysis.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService{

    @Autowired
    DistrictRepository districtRepository;

    @Override
    public District findById(Integer id){
        District district = districtRepository.getReferenceById(id);
        return district;
    }

    @Override
    public List<District> findAll(){
        List<District> districts = districtRepository.findAll();
        return districts;
    }
}
