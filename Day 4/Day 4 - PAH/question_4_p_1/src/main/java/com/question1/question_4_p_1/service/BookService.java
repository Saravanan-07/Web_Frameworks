package com.question1.question_4_p_1.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question1.question_4_p_1.model.Book;
import com.question1.question_4_p_1.repository.BookRepo;


@Service
public class BookService {
     @Autowired
     private BookRepo bookRepo;

     public Book SaveEntity(Book entity) {
          return bookRepo.save(entity);
     }

     public List<Book> getDetails() {
          return bookRepo.findAll();
     }

     public Optional<Book> getBookById(int bookId) {
          
          return bookRepo.findById(bookId);
     }

}
