package com.healthCare.HealthCare.Controllers;

import com.healthCare.HealthCare.Models.Doctor;
import com.healthCare.HealthCare.Services.DoctorService;
import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @GetMapping(value = "getAll")
    public List<Doctor> getDoctors() {
        return doctorService.getAllDoctors();
    }
}
