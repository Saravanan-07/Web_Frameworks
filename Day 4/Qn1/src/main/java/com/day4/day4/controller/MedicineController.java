package com.day4.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4.day4.model.Medicine;
import com.day4.day4.repository.MedicineRepo;
import com.day4.day4.service.MedicineService;

@RestController
public class MedicineController {
    @Autowired
    MedicineService m;
    @Autowired
    MedicineRepo med;
    @PostMapping(path = "/api")
    public Medicine savedata(@RequestBody Medicine me)
    {
            return m.saveMedicine(me);
    }
    @GetMapping("/api/medicines")
    public List<Medicine> getMedicine()
    {
        return med.findAll();
    }
    @GetMapping("/api/medicine/{medicineid}")
    public Optional<Medicine> retmed(@PathVariable int medicineid)
    {
        
        return med.findById(medicineid);
    }
}
