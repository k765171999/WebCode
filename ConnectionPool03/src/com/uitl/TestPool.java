package com.uitl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class TestPool {
	
	@Test
	public void testPool(){
		MyDataSource datasource = new MyDataSource();
		PreparedStatement ps = null;
		
		Connection conn = null;
		try {
			conn = datasource.getConnection();
			
			String sql = "insert into t_user values(null,'kakaxi',76517199559)";
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
