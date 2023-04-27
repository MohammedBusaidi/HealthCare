package com.healthCare.HealthCare.Services;

import com.healthCare.HealthCare.Models.Patient;
import com.healthCare.HealthCare.Reporsitories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
