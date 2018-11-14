package com.dbcp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import com.uitl.JDBCUtil;

public class DBCPDemo02 {

	@SuppressWarnings("static-access")
	@Test
	public void testDBCP(){
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			BasicDataSourceFactory fatory = new BasicDataSourceFactory();
			Properties properties = new Properties();
			InputStream is = new FileInputStream("src//dbcpconfig.properties");
			properties.load(is);
			DataSource dataSource = fatory.createDataSource(properties);
			
			conn = dataSource.getConnection();
			
			String sql = "insert into t_user values (null,'xxsssx',10090)";
			ps = conn.prepareStatement(sql);
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, ps);
			
		}
	}
}
