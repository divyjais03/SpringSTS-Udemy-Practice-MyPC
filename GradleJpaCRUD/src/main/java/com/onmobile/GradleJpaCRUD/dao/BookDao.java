package com.onmobile.GradleJpaCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onmobile.GradleJpaCRUD.model.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

	// if any additional methods needs to be performed then mentioned here, and if 
	//its other than DSL grammar (costum finder method) then need to  write JPQL querry separately. 
}
