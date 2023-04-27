package com.healthCare.HealthCare.Services;

import com.healthCare.HealthCare.Models.MedicalRecord;
import com.healthCare.HealthCare.Reporsitories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {
    @Autowired
    RecordRepository recordRepository;
    public List<MedicalRecord> getAllRecords() {
        return recordRepository.findAll();
    }
}
