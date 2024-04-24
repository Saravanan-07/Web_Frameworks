package com.example.d11onetooneuni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d11onetooneuni.model.Employee;
import com.example.d11onetooneuni.repo.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public Employee addEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }
    
    public List<Employee> getEmployees()
    {
        return employeeRepo.findAll();
    }
}
