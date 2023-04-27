package com.healthCare.HealthCare.Services;

import com.healthCare.HealthCare.Models.Doctor;
import com.healthCare.HealthCare.Reporsitories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    public List<Doctor> getAllDoctors (){
        return doctorRepository.findAll();
    }
}
