package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.uitl.JDBCUtil;

public class Register extends HttpServlet {

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nicheng = request.getParameter("nicheng");
		
		PrintWriter pw = response.getWriter();
		
		Connection conn = null;
		PreparedStatement ps = null;
//		ResultSet rs = null;
		try {
			//1. 获取连接
			conn = JDBCUtil.getConn();
			
			//2. 应用
			String sql = "insert into stu values(null,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			int result = ps.executeUpdate();
			if(result>0){
				pw.write("success!");
				
			}else{
				pw.write("failed!");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, ps);
		}
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
