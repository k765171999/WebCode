package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
/*
 * 该servlet 用于演示创建servlet 初始化提前
 * 
 */

public class HelloServlet04 implements Servlet{
	//1. init创建实例时就执行了该方法
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("helloServlet初始化了----");
	}
	//2. 只要有请求就会执行
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service执行了-----");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("关闭了");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
