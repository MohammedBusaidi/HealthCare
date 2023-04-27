package com.healthCare.HealthCare.Controllers;

import com.healthCare.HealthCare.Models.TestResult;
import com.healthCare.HealthCare.Services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "result")
public class ResultController {
    @Autowired
    ResultService resultService;
    @GetMapping(value = "getAll")
    public List<TestResult> getResults() {
        return resultService.getAllResults();
    }
}
