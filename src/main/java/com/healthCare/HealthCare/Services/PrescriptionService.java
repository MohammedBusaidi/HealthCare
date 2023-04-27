package com.healthCare.HealthCare.Services;

import com.healthCare.HealthCare.Models.Prescription;
import com.healthCare.HealthCare.Reporsitories.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {
    @Autowired
    PrescriptionRepository prescriptionRepository;
    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }
}
