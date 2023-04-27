package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
