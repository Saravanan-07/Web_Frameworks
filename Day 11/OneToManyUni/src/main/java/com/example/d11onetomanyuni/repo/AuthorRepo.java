package com.example.d11onetomanyuni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d11onetomanyuni.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Long> {
    
}
