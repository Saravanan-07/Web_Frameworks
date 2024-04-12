package com.day4.day4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.day4.model.Medicine;
import com.day4.day4.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepo repository;

    public Medicine saveMedicine(Medicine m)
    {
        return repository.save(m);
    }
}