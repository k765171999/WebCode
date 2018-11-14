package com.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletConfig extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//servletconfig 可以获取servlet在配置的一些信息
		//1. 得到servlet配置对象专门用于在配置servlet的信息		
		ServletConfig config = getServletConfig();
		String servletName = config.getServletName();
		//2. 可以获取具体的某一个参数
		String ad = config.getInitParameter("address");
		System.out.println("servletName="+servletName);
		System.out.println("address="+ad);
		
		//3. 获取所有参数名称
		Enumeration<String> names = config.getInitParameterNames();
		//遍历出所有参数名称
		while (names.hasMoreElements()) {
			String key = (String) names.nextElement();
			String value = config.getInitParameter(key);
			System.out.println("key=="+key+"        value=="+value);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}

