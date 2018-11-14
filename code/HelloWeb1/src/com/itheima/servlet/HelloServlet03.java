package com.itheima.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;


/**
 * 该servlet 用于演示servlet的生命周期调用时机
 */
public class HelloServlet03 implements Servlet{

	
	//1、 
	//在创建该servlet的实例时，就执行该方法。
	//一个servlet只会初始化一次， init方法只会执行一次
	//默认情况下是 ： 初次访问该servlet，才会创建实例。 
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("HelloServlet03 初始化...");
		
	}
	
	
	//2.
	
	/*
	 * 	只要客户端来了一个请求，那么就执行这个方法了。
	 * 该方法可以被执行很多次。 一次请求，对应一次service方法的调用
	 */
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("helloservlet03  service方法调用了");
	}
	
	
	/**
	 * servlet销毁的时候，就会执行该方法
	 * 
	 * 	1. 该项目从tomcat的里面移除。
	 * 	2. 正常关闭tomcat就会执行 shutdown.bat
	 */
	@Override
	public void destroy() {
		System.out.println("helloservlet03  destroy方法调用了");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
