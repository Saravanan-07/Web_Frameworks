package com.question1.question_5_p_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question1.question_5_p_1.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
