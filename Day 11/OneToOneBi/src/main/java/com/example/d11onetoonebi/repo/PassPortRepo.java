package com.example.d11onetoonebi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d11onetoonebi.model.PassPort;

public interface PassPortRepo extends JpaRepository<PassPort,Long> {
    
}
