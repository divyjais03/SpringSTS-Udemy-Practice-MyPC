package com.onmobile.GradleJpaCRUD.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onmobile.GradleJpaCRUD.dao.BookDao;
import com.onmobile.GradleJpaCRUD.model.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao dao;
	
	@Override
	public String deleteById(int id) {
		dao.deleteById(id);
		return "Book Deleted Successfully";
	}

	@Override
	public List<Book> getAllBook() {
		
		return dao.findAll();
	}

	@Override
	public Book getBookById(int id) {
		Optional<Book> optional= dao.findById(id);
		return optional.get();
	}

	@Override
	public String BookCreation(Book bk) {
		dao.save(bk);
		return "BookAdded Successfully";
	}

	@Override
	public String updateBook(Book bk) {
		dao.save(bk);
		return "Book Updated Successfully";
	}

}
