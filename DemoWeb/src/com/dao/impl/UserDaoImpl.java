package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.UserDao;
import com.util.JDBCUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public void findAll() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			 conn = JDBCUtil.getConn();
			 st = conn.createStatement();
			 String sql = "select * from t_user";
			 rs = st.executeQuery(sql);
			 
			 while(rs.next()){
				 String username = rs.getString("username");
				 String password = rs.getString("password");
				 int id = rs.getInt("id");
				 System.out.println(" "+username+" "+password);
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, st, rs);
		}
		
	}

	@Override
	public void login(String username, String password) {
		// –°–Õ≤È—Ø
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			 conn = JDBCUtil.getConn();
//			 String sql = "select * from t_user where username = ? and password = ?";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, username);
//			ps.setString(2, password);
//			 rs = ps.executeQuery();
			 st = conn.createStatement();
			 String sql = "select * from t_user where username = '"+username+"' and password='"+password+"'";
			 rs = st.executeQuery(sql);
			 
			 if(rs.next()){
				 System.out.println("sucessfully login!");
			 }else{
				 System.out.println("fault login!");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, st, rs);
		}
		
		
	}


	
}
