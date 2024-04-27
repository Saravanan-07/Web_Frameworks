package com.question_12_2.question_12_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question_12_2.question_12_2.model.Student3;
import com.question_12_2.question_12_2.model.StudentDetails3;
import com.question_12_2.question_12_2.repository.StudentDetailsRepo;



@Service
public class StudentDetailService 
{
    @Autowired
    StudentDetailsRepo SDR;

    @Autowired
    StudentService SS;

    public StudentDetails3 updateDetail(StudentDetails3 S,int id)
    {
        Student3 S1=SS.getById(id);
        S1.setStudentDetail(S);
        SS.postdata(S1);
        return S1.getStudentDetail();
    }

}
