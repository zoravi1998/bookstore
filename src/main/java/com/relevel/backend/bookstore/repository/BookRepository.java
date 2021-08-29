package com.relevel.backend.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.relevel.backend.bookstore.model.Book;


public interface BookRepository extends JpaRepository<Book,Integer>{


}

