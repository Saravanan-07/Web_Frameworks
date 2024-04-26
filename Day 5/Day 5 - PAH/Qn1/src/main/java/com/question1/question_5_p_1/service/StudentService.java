package com.question1.question_5_p_1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question1.question_5_p_1.model.Student;
import com.question1.question_5_p_1.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo sRepo;

    public Student postDetails(Student std)
    {
        return sRepo.save(std);
    }

    public List<Student> getAllDetails()
    {
        return sRepo.findAll();
    }

    public Optional<Student> getDetail(int id)
    {
        return sRepo.findById(id);
    }

    public Student putDetails(int id,Student std)
    {
        return sRepo.save(std);
    }

    public void delete(int id)
    {
        sRepo.deleteById(id);
    }

}
