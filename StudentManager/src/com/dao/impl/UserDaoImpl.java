package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UserDao;
import com.util.JDBCUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean login(String username,String password) {
		PreparedStatement ps=null;
		ResultSet rs =null;
		Connection conn =null;
		try {
			conn = JDBCUtil.getConn();
//			System.out.println(conn.isClosed());
			
			String sql = "select *from t_user where username=? and password=?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1,username);
			ps.setString(2,password);
			
			rs = ps.executeQuery();
			
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, ps, rs);
		}
		
		
		
		
		// TODO Auto-generated method stub
		return false;
	}

}
