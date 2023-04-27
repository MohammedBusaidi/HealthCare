package com.healthCare.HealthCare.Controllers;

import com.healthCare.HealthCare.Models.Insurance;
import com.healthCare.HealthCare.Services.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "insurance")
public class InsuranceController {
    @Autowired
    InsuranceService insuranceService;
    @GetMapping(value = "getAll")
    public List<Insurance> getInsurance() {
        return insuranceService.getAllInsurances();
    }
}
