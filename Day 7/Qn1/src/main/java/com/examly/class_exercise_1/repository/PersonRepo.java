package com.examly.class_exercise_1.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

     List<Person> findByAge(int byAge);
     @Modifying
     @Transactional
     @Query("Update Student set lastname=:lastname where firstname=:firstname")
     Integer updatelastname(String firstname,String lastname);
}