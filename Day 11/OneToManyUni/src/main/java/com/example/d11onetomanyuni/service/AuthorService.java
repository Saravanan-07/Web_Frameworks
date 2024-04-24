package com.example.d11onetomanyuni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d11onetomanyuni.model.Author;
import com.example.d11onetomanyuni.repo.AuthorRepo;

@Service
public class AuthorService {
    @Autowired
    AuthorRepo authorRepo;

    public Author addAuthor(Author author)
    {
        return authorRepo.save(author);

    }
    public List<Author> getAuthor()
    {
        return authorRepo.findAll();
    }
}
