package com.itheima.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.itheima.uitl.JDBCUtil;

public class Test {

	public static void main(String[] args) {
		try {
			Connection conn = JDBCUtil.getConn();
			System.out.println(conn.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
