package com.question_12_2.question_12_2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question_12_2.question_12_2.model.Student3;
import com.question_12_2.question_12_2.repository.StudnetRepo;



@Service
public class StudentService 
{
    @Autowired
    StudnetRepo SR;
    
    public Student3 getById(int id)
    {
        return SR.findById(id);
    }

    public Student3 postdata(Student3 S)
    {
        return SR.save(S);
    }

    public List<Student3> LeftOuterJoin()
    {
        return SR.LeftOuterJoin();
    }

    public List<Student3> InnerJoin()
    {
        return SR.InnerJoin();
    }

}
