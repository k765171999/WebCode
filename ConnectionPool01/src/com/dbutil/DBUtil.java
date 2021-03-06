package com.dbutil;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import com.domain.Account;
import com.domain.t_user;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {
	@Test
	public void testInsert() throws SQLException, InstantiationException, IllegalAccessException{
		QueryRunner queryRunner = new QueryRunner(new ComboPooledDataSource());
	
		t_user tuser = queryRunner.query("select * from t_uer where id = ?", 
					new BeanHandler<t_user>(t_user.class), 5);
		System.out.println(tuser.toString());
	}
}
