package com.question1.question_5_p_1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question1.question_5_p_1.model.Student;
import com.question1.question_5_p_1.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    public StudentService studentService;

    @PutMapping(path="/student")
    public Student savStudent(@RequestBody Student s)
    {
        return studentService.postDetails(s);
    }

    @GetMapping("/student")
    public List<Student> getInfo()
    {
        return studentService.getAllDetails();
    }

    @GetMapping("/student/{studentId}")
    public Optional<Student> getinfoEach(@PathVariable("studentId") int id)
    {
        return studentService.getDetail(id);
    }

    @PutMapping("/student/{studentId}")
    public Student updateStudent(@PathVariable("studentId") int id,@RequestBody Student s)
    {
        return studentService.putDetails(id, s);
    }

    @DeleteMapping("/student/{studentId}")
    public void deleteStudent(@PathVariable("studentId")int id,@RequestBody Student s)
    {
        studentService.delete(id);
    }
}
