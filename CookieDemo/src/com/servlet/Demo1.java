package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Cookie的简单使用
		
		//Cookie 发送给客户端，并且保存在客户端上的一份小数据
		
		response.setContentType("text/html;charset=utf-8");
		/**
		 * 方法参数要什么就给什么，对象
		 * 
		 * 创建的集中方法：
		 * 
		 * 1. 直接new 
		 * 2. 单例模式|提供静态方法
		 * 3. 工厂模式构建 stu
		 * StuFactory Stubuild
		 */
		Cookie cookie = new Cookie("aa","bb");
		
		//添加一个cookie
		response.addCookie(cookie);
		
		response.getWriter().write("成功了...");
		
		
		//获取客户端带过来的cookie
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for (Cookie c : cookies) {
				String cookiename = c.getName();
				String cookievalue = c.getValue();
				
				System.out.println(cookiename+"="+cookievalue);
			}
		}
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
