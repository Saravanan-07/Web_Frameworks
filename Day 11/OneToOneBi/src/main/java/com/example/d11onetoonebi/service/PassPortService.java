package com.example.d11onetoonebi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d11onetoonebi.model.PassPort;
import com.example.d11onetoonebi.repo.PassPortRepo;

@Service
public class PassPortService {
    @Autowired
    PassPortRepo passPortRepo;

    public PassPort addPassPort(PassPort passPort)
    {
        return passPortRepo.save(passPort);
    }

    public List<PassPort> getPassPorts()
    {
        return passPortRepo.findAll();
    }
}
