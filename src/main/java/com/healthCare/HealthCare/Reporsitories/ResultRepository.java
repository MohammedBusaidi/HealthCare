package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<TestResult, Integer> {
}
