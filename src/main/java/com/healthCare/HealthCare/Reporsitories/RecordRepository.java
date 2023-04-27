package com.healthCare.HealthCare.Reporsitories;

import com.healthCare.HealthCare.Models.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<MedicalRecord, Integer> {
}
