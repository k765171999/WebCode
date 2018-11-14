package com.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.uitl.JDBCUtil2;

public class C3P0Demo {

	
	public static void main(String[] args) {
		Connection conn =null;
		PreparedStatement ps =null;
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		System.out.println(dataSource.hashCode() );
		ComboPooledDataSource dataSource2 = new ComboPooledDataSource();
		System.out.println(dataSource2.hashCode()+"-------");
		try {
			dataSource.setDriverClass( "com.mysql.cj.jdbc.Driver" );
			dataSource.setJdbcUrl( "jdbc:mysql://localhost/students?useUnicode=true&characterEncoding=utf8&useSSL=false" );
			dataSource.setUser("root");                                  
			dataSource.setPassword("123456");  
			
			conn = dataSource.getConnection();
			String sql = "insert into t_user values(null,?,?)";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, "admin");
			ps.setString(2, "5888966");
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil2.release(conn, ps);
		}
	}
		
}
