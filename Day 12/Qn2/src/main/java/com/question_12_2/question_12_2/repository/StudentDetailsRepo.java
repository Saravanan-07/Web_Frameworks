package com.question_12_2.question_12_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question_12_2.question_12_2.model.StudentDetails3;


@Repository
public interface StudentDetailsRepo extends JpaRepository<StudentDetails3,Integer> {

}
