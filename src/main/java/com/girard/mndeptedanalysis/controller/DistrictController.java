package com.girard.mndeptedanalysis.controller;

import com.girard.mndeptedanalysis.entity.District;
import com.girard.mndeptedanalysis.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class DistrictController {
    DistrictService districtService;

//    @GetMapping("/districts")
//    public String districts(){
//        List<District> districts = districtService.findAll();
//
//    }

}
