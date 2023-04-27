package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
}
