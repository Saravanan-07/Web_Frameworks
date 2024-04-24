package com.example.d11onetooneuni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.d11onetooneuni.model.Employee;
import com.example.d11onetooneuni.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/get")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    
    
}
