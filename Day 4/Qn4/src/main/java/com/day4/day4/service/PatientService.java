package com.day4.day4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.day4.model.Patient;
import com.day4.day4.repository.PatientRepo;

@Service
public class PatientService {
    @Autowired
    private PatientRepo repository;
    public Patient savePatient(Patient p)
    {
        return repository.save(p);
    }
}