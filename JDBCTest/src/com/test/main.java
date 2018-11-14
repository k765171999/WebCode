package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("ss1");
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("zuceshibai!");
			}
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("ss2");
			String url = "jdbc:mysql://localhost:8888/students?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "123456";
			
			Connection conn = DriverManager.getConnection(url, username, password);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/students?useSSL=false&serverTimezone=GMT%2B8", "root", "123456");
			System.out.println("ss3");
			
			Statement st = conn.createStatement();
			
			String sql = "select * from t_user";
			System.out.println("sss");
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("username");
				System.out.println("-----id="+id+"-----name="+name);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
