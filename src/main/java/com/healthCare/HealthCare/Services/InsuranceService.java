package com.healthCare.HealthCare.Services;

import com.healthCare.HealthCare.Models.Insurance;
import com.healthCare.HealthCare.Reporsitories.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceService {
    @Autowired
    InsuranceRepository insuranceRepository;
    public List<Insurance> getAllInsurances() {
        return insuranceRepository.findAll();
    }
}
