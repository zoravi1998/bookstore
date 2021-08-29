package com.relevel.backend.bookstore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import com.relevel.backend.bookstore.model.Book;
import com.relevel.backend.bookstore.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
    @GetMapping("/ping")
	public String ping() {
		return "Ping is Successful, Proceed with Problem Statements";
	}
    
    @PostMapping("/book")
	public String addBook(@Valid @RequestBody Book book) {
		repository.save(book);
		return "Book added Successfully " + book.getId() + " " + book.getBookName();
	}
    @GetMapping("/book/{bookID}")
    public String deletebook(@PathVariable(value="bookID") int id) {
    	try {
    	repository.deleteById(id);
    	}
    	catch(Exception e) {
    		return "Book Not found for requested ID";
    	}
    	return "Book deleted Successfully";
    }
    
    @GetMapping("/booksearch")
    public List<Book> searchBook(@RequestBody Book book){
    	return repository.findAll();
    }
}
