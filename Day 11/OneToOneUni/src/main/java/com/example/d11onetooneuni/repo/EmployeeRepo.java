package com.example.d11onetooneuni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d11onetooneuni.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    
}
