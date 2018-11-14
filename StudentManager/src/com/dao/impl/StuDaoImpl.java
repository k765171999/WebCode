package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.StuDao;
import com.domain.Student;
import com.util.JDBCUtil;

public class StuDaoImpl implements StuDao {

	@Override
	public List<Student> findAll() {

			List<Student> list = new ArrayList<Student>();
			PreparedStatement ps=null;
			ResultSet rs =null;
			Connection conn =null;
		try {
			conn = JDBCUtil.getConn();
			
			String sql = "select * from t_stu";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			// 数据多了，用对象装，对象多了，用集合装
			
			while(rs.next()){
				Student stu = new Student();
				
				stu.setId(rs.getInt("id"));
				stu.setAge(rs.getInt("age"));
				stu.setName(rs.getString("name"));
				stu.setGender(rs.getString("gender"));
				stu.setAddress(rs.getString("address"));
				
				list.add(stu);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, ps, rs);
		}
		return list;
	}

}
