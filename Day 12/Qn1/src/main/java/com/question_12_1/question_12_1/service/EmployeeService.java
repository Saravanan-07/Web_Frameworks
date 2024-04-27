package com.question_12_1.question_12_1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question_12_1.question_12_1.model.Employee;
import com.question_12_1.question_12_1.repository.EmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo er;

    @PersistenceContext
    private EntityManager entityManager;

    public Employee postEmployee(Employee emp)
    {
        return er.save(emp);
    }

    public List<Employee> innerJoinExample() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
        Root<Employee> employeeRoot = query.from(Employee.class);
        employeeRoot.join("address");
        query.select(employeeRoot);
        return entityManager.createQuery(query).getResultList();
    }

    public List<Employee> leftOuterJoinExample() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
        Root<Employee> employeeRoot = query.from(Employee.class);
        employeeRoot.join("address", jakarta.persistence.criteria.JoinType.LEFT);
        query.select(employeeRoot);
        return entityManager.createQuery(query).getResultList();
    }


}
