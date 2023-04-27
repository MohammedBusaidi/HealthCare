package com.healthCare.HealthCare.Controllers;

import com.healthCare.HealthCare.Models.Hospital;
import com.healthCare.HealthCare.Services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "hospital")
public class HospitalController {
    @Autowired
    HospitalService hospitalService;
    @GetMapping(value = "getAll")
    public List<Hospital> getHospitals() {
        return hospitalService.getAllHospitals();
    }
}
