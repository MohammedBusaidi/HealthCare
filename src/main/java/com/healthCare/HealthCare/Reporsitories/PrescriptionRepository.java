package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
}
