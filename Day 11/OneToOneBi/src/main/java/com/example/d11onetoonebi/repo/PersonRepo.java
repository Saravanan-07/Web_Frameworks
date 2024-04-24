package com.example.d11onetoonebi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d11onetoonebi.model.Person;

public interface PersonRepo extends JpaRepository<Person,Long>{
    
}
