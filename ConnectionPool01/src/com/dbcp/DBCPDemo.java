package com.dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import com.uitl.JDBCUtil;

public class DBCPDemo {
	
	@Test
	public void testDBCP(){
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:8888/students?characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8");
			dataSource.setUsername("root");
			dataSource.setPassword("123456");
			conn = dataSource.getConnection();
			
			String sql = "insert into t_user values (null,'xsadx',108800)";
			ps = conn.prepareStatement(sql);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, ps);
			
		}
	}
}
