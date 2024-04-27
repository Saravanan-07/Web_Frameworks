package com.question_12_1.question_12_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    int id;
    String city;
    String street;
    @OneToOne(mappedBy = "address")
    Employee employee;
    public Address(int id, String city, String street, Employee employee) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.employee = employee;
    }
    public Address() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
