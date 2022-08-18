package com.onmobile.dao;

import org.springframework.data.repository.CrudRepository;

import com.onmobile.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
