package com.healthCare.HealthCare.Controllers;

import com.healthCare.HealthCare.Models.MedicalAppointment;
import com.healthCare.HealthCare.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
    @GetMapping(value = "getAll")
    public List<MedicalAppointment> getAppointments() {
        return appointmentService.getAllAppointments();
    }
}
