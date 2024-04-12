package com.day4.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4.day4.model.Patient;
import com.day4.day4.repository.PatientRepo;
import com.day4.day4.service.PatientService;

@RestController
public class PatientController {
    @Autowired
    PatienttService p;
    @Autowired
    PatientRepo obj;
    @PostMapping(path = "/api")
    public Patient savedata(@RequestBody Patient me)
    {
            return p.savePatient(me);
    }
    @GetMapping("/api/patient")
    public List<Patient> getPatients()
    {
        return obj.findAll();
    }
    @GetMapping("/api/patient/{patientId}")
    public Optional<Patient> retpatient(@PathVariable int pId)
    {
        
        return obj.findById(pId);
    }
}
