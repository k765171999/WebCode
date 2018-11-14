package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		String usename=request.getParameter("username");
		String password=request.getParameter("password");
		
		if("admin".equals(usename) && "123".equals(password)){
//			response.getWriter().write("登陆成功！");
/**
 * 			response.setStatus(302);
		response.setHeader("Location", "login_success.html");
 */
		//重定向写法
		response.sendRedirect("login_success.html");
		
		//请求转发
		request.getRequestDispatcher("login_success.html").forward(request, response);
		
		}else{
			response.getWriter().write("登录失败！");
			
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
