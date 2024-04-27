package com.question_12_1.question_12_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question_12_1.question_12_1.model.Employee;
import com.question_12_1.question_12_1.repository.EmployeeRepo;
import com.question_12_1.question_12_1.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepo er;
    EmployeeService es;

    @PostMapping("/employee")
    public Employee insertEmployee(@RequestBody Employee emp)
    {
        return es.postEmployee(emp);
    }

    @GetMapping("/employees-inner-join")
    public List<Employee> getInner ()
    {
        return es.innerJoinExample();
    }
    @GetMapping("/employees-left-outer-join")
    public List<Employee> getOuter ()
    {
        return es.leftOuterJoinExample();
    }
}
