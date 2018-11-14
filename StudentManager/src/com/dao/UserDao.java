package com.dao;

/**
 * 用于登陆的dao
 * @author Administrator
 *
 * @return true:成功 false:失败
 */
public interface UserDao {
	/**
	 * 
	 * @param username
	 * @param password
	 * @return true:successful false: failed
	 */
	boolean login(String username,String password);
}
