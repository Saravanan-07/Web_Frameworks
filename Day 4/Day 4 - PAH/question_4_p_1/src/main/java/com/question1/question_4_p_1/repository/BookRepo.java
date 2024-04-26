package com.question1.question_4_p_1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question1.question_4_p_1.model.Book;

@Repository
/**
 * BookRepo
 */
public interface BookRepo extends JpaRepository<Book, Integer> {

}