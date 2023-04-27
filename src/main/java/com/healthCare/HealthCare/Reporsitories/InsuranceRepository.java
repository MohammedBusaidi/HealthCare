package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {
}
