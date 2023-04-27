package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.MedicalAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<MedicalAppointment, Integer> {
}
