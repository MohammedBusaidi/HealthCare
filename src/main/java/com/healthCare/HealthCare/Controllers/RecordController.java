package com.healthCare.HealthCare.Controllers;

import com.healthCare.HealthCare.Models.MedicalRecord;
import com.healthCare.HealthCare.Services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "records")
public class RecordController {
    @Autowired
    RecordService recordService;
    @GetMapping(value = "getAll")
    public List<MedicalRecord> getRecords() {
        return recordService.getAllRecords();
    }
}
