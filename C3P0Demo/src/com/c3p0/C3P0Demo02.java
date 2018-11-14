package com.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.uitl.JDBCUtil2;

public class C3P0Demo02 {

	@Test
	public void testC3P0(){
		Connection conn =null;
		PreparedStatement ps =null;
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		try {
			
			
			conn = dataSource.getConnection();
			String sql = "insert into t_user values(null,?,?)";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, "xadssmin");
			ps.setString(2, "588ww8966");
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil2.release(conn, ps);
		}
	}
}
