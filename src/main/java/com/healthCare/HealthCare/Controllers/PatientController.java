package com.healthCare.HealthCare.Controllers;

import com.healthCare.HealthCare.Models.Patient;
import com.healthCare.HealthCare.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @GetMapping(value = "getAll")
    public List<Patient> getPatients() {
        return patientService.getAllPatients();
    }
}
