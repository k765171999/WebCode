package com.dao;

import java.sql.SQLException;

public interface UserDao{
	/**
	 * 这是用于检验是否登陆成功的Dao
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	boolean cheakLogin(String username , String password) throws SQLException;
	/**
	 * 这是用于注册的Dao
	 * @param username
	 * @param password
	 * @param usercode 设备码，独一无二
	 * @throws SQLException
	 */
	boolean doRegester(String username , String password ,String usercode) throws SQLException;
	/**
	 * 用于检测用户名是否存在
	 * @param username
	 * @return 返回为true 表示有了，返回false 表示没有
	 * @throws SQLException
	 */
	boolean checkUserName(String username) throws SQLException;

}
