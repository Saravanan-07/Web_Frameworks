package com.example.d11onetomanyuni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.d11onetomanyuni.model.Author;
import com.example.d11onetomanyuni.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author) {
        
        return authorService.addAuthor(author);
    }

    @GetMapping("/get")
    public List<Author> getMethodName() {
        return authorService.getAuthor();
    }
    
    
}
