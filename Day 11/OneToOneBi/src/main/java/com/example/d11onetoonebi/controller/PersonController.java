package com.example.d11onetoonebi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.d11onetoonebi.model.Person;
import com.example.d11onetoonebi.service.PersonService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/addperson")
    public Person addPerson(@RequestBody Person person) {
        
        return personService.addPerson(person);
    }
    @GetMapping("/getperson")
    public List<Person> getPerson() {
        return personService.getPerson();
    }
    
    
}
