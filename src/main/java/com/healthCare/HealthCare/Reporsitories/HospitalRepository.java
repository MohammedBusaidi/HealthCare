package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
