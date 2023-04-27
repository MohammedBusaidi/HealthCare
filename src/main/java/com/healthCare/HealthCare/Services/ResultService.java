package com.healthCare.HealthCare.Services;

import com.healthCare.HealthCare.Models.TestResult;
import com.healthCare.HealthCare.Reporsitories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    @Autowired
    ResultRepository resultRepository;
    public List<TestResult> getAllResults() {
        return resultRepository.findAll();
    }
}
