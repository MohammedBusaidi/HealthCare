package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.MedicalAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<MedicalAppointment, Integer> {
}
