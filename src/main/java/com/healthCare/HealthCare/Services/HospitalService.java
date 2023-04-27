package com.healthCare.HealthCare.Services;

import com.healthCare.HealthCare.Models.Hospital;
import com.healthCare.HealthCare.Reporsitories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    @Autowired
    HospitalRepository hospitalRepository;
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }
}
