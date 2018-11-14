package com.test;

import org.junit.Test;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;

public class TestUserDaoImpl {
	@Test
	public void testFindAll(){
		UserDao dao = new UserDaoImpl();
		dao.findAll();
	}
	@Test
	public void testLogin(){
		UserDao dao = new UserDaoImpl();
		dao.login("admin", "1008'or'1=1");
	}
}
