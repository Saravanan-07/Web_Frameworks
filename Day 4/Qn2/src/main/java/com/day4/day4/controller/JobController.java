package com.day4.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4.day4.model.Job;
import com.day4.day4.repository.JobRepo;
import com.day4.day4.service.JobService;

@RestController
public class JobController {
    @Autowired
    JobService j;
    @Autowired
    JobRepo job;
    @PostMapping(path = "/api/job")
    public Job savejob(@RequestBody Job job) {
        return j.saveJob(job);
    }
    @GetMapping("/api/job")
    public List<Job> getJob()
    {
        return job.findAll();
    }
    @GetMapping("/api/job/{jobId}")
    public Optional<Job> retjob(@PathVariable int jobId)
    {
        
        return job.findById(jobId);
    }
}
