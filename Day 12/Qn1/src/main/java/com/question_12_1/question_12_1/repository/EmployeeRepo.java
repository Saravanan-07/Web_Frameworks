package com.question_12_1.question_12_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question_12_1.question_12_1.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
