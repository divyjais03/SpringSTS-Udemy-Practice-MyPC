package com.onmobile.GradleJpaCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onmobile.GradleJpaCRUD.model.Book;
import com.onmobile.GradleJpaCRUD.service.BookService;

@RestController
@RequestMapping("/books")
public class MyController {
	
	@Autowired
	BookService service;
	
	
	@PostMapping("/addBook") // http://localhost:8080/books/addBook
	public String createBook(@RequestBody Book bk) {
		return service.BookCreation(bk);
		}
	
	@PutMapping("/updateBook") // http://localhost:8080/books/updateBook
	public String updateBook(@RequestBody Book bk) {
		return service.updateBook(bk);
	}
	
	@DeleteMapping("/deleteBook/{id}") // http://localhost:8080/books/deleteBook/102
	public String deleteBook(@PathVariable("id") int id) {
		return service.deleteById(id);
	}
	
	@GetMapping("/getBook/{id}") // http://localhost:8080/books/getBook/101
	public Book getBook(@PathVariable("id") int id) {
		return service.getBookById(id);
	}

	@GetMapping("/getAll") // http://localhost:8080/books/getAll
	public List<Book> getAllBook() {
		return service.getAllBook();
	}
	
	
	
//	@GetMapping
//	public String hello() {
//		return "Hello there...!";
//	}

}
