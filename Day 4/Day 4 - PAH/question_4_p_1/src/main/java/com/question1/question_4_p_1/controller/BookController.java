package com.question1.question_4_p_1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.question1.question_4_p_1.model.Book;
import com.question1.question_4_p_1.service.BookService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class BookController {
     @Autowired
     public BookService bookService;

     List<Book> list;

     @PostMapping("/api/book")
     public ResponseEntity<Book> postMethodName(@RequestBody Book entity) {

          Book inst = bookService.SaveEntity(entity);

          return new ResponseEntity<Book>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/book")
     public ResponseEntity<List<Book>> getMethodName() {

          List<Book> show = bookService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Book>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Book>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/book/{bookId}")
     public Optional<Book> getMethodName(@PathVariable int bookId) {

          return bookService.getBookById(bookId);

     }

}
