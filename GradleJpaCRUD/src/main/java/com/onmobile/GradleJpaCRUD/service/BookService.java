package com.onmobile.GradleJpaCRUD.service;

import java.util.List;

import com.onmobile.GradleJpaCRUD.model.Book;

public interface BookService {
	
	String deleteById(int id);

	List<Book> getAllBook();

	Book getBookById(int id);

	String BookCreation(Book bk);

	String updateBook(Book bk);

}
