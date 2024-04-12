package com.day4.day4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.day4.model.Job;
import com.day4.day4.repository.JobRepo;

@Service
public class JobService {
    @Autowired
    private JobRepo repository;

    public Job saveJob(Job j)
    {
        return repository.save(j);
    }
}
