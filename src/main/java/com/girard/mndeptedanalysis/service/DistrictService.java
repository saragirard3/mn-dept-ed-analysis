package com.girard.mndeptedanalysis.service;

import com.girard.mndeptedanalysis.entity.District;
import com.girard.mndeptedanalysis.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DistrictService {
    District getDistrictyById(Integer id);

    List<District> getAllTransactions();
}
