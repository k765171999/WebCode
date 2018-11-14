package com.dao;

public interface UserDao {
	void findAll();

	
	void login(String username,String password);
}
