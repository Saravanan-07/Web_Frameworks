package com.example.d11onetomanyuni.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d11onetomanyuni.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Long>{
    
}
