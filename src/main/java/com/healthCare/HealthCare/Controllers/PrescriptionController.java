package com.healthCare.HealthCare.Controllers;

import com.healthCare.HealthCare.Models.Prescription;
import com.healthCare.HealthCare.Services.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "prescription")
public class PrescriptionController {
    @Autowired
    PrescriptionService prescriptionService;
    @GetMapping(value = "getAll")
    public List<Prescription> getPrescriptions() {
        return prescriptionService.getAllPrescriptions();
    }
}
