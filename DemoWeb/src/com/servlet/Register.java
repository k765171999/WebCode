package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.JDBCUtil;

public class Register extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nicheng = request.getParameter("nicheng");
		
		Connection conn = null;
		PreparedStatement ps = null;
//		ResultSet rs = null;
		try {
			//1. ��ȡ����
			conn = JDBCUtil.getConn();
			
			//2. Ӧ��
			String sql = "insert into stu values(null,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			int result = ps.executeUpdate();
			if(result>0){
				response.getWriter().write("success!");
				
				//����״̬��
				response.setStatus(302);
				
				//��ת
				response.setHeader("Location", "index.html");
				
			}else{
				response.getWriter().write("failed!");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, ps, null);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
