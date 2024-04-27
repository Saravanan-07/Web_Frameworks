package com.question_12_2.question_12_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question_12_2.question_12_2.model.StudentDetails3;
import com.question_12_2.question_12_2.service.StudentDetailService;


@RestController
public class StudentDetailsController 
{

    @Autowired
    StudentDetailService SDS;

    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<StudentDetails3> updateStudDetail(@RequestBody StudentDetails3 S,@PathVariable int id)
    {
        try{
            return new ResponseEntity<>(SDS.updateDetail(S, id),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
