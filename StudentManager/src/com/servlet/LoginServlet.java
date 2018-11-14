package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StuDao;
import com.dao.UserDao;
import com.dao.impl.StuDaoImpl;
import com.dao.impl.UserDaoImpl;
import com.domain.Student;
import com.util.JDBCUtil;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		// 1. 获取传过来的信息
		String username = request.getParameter("username");
		String password= request.getParameter("password");

		//new UserDaoImpl().login(); //测试
		
		UserDao dao = new UserDaoImpl();
		
		boolean isSuccess = dao.login(username, password);
		
		if(isSuccess){
			response.getWriter().write("登陆成功！");
			//1. 查询所有
			StuDao studao = new StuDaoImpl();
			List<Student> list = studao.findAll();
			
			//2. 存到作用于
			request.getSession().setAttribute("list", list);
			
			response.sendRedirect("stu_list.jsp");
		}else{
			response.getWriter().write("登陆失败！");
			
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
