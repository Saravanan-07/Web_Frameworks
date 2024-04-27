package com.question_12_2.question_12_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question_12_2.question_12_2.model.Student3;
import com.question_12_2.question_12_2.service.StudentService;



@RestController
public class StudentController 
{
    @Autowired
    StudentService SS;

    @PostMapping("/student")
    public ResponseEntity<Student3> postdata(@RequestBody Student3 S)
    {
        try{
            return new ResponseEntity<>(SS.postdata(S),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/student-inner-join")
    public ResponseEntity<List<Student3>> InnerJoin()
    {
        try{
            return new ResponseEntity<>(SS.InnerJoin(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/student-left-outer-join")
    public ResponseEntity<List<Student3>> LeftOuterJoin()
    {
        try{
            return new ResponseEntity<>(SS.LeftOuterJoin(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

}
