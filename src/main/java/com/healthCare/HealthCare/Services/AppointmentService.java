package com.healthCare.HealthCare.Services;

import com.healthCare.HealthCare.Models.MedicalAppointment;
import com.healthCare.HealthCare.Reporsitories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;
    public List<MedicalAppointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
