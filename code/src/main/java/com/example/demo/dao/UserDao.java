package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	public User findByEmail(String email);
}