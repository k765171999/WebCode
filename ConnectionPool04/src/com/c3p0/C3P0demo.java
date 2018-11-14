package com.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.uitl.JDBCUtil;

public class C3P0demo {
	
	@Test
	public void testC3P0(){
		System.out.println("x");
		
		System.out.println("y");
		
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			System.out.println("1");
			dataSource.setDriverClass( "com.mysql.cj.jdbc.Driver" );
			dataSource.setJdbcUrl( "jdbc:mysql://localhost/students?useUnicode=true&characterEncoding=utf8&useSSL=false" );
			dataSource.setUser("root");                                  
			dataSource.setPassword("123456");
			conn = dataSource.getConnection();
			
			String sql = "insert into t_user values (null,?,?)";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, "admins");
			ps.setString(2, "ssss7777");
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, ps);
			
		}
	}
}
