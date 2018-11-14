package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class demo02 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 创建属性表
		Properties properties = new Properties();
		//2. 指定载入数据源
		/**
		 * 此处，如果想获取WEB工程的资源，用普通的FileInputStream 这是不OK的
		 * 因为路径不对了，这里是相对路径，其实是根据jre来确定的，但是我们这是一个web工程，
		 * jre后面会由tomcat管理，所以这里真正的路径是tomcat里面的bin目录
		 * 
		 */
		InputStream is = new FileInputStream("src/config.properties");
		//3. 获取name属性的值
		properties.load(is);
		String name = properties.getProperty("name");
		System.out.println("name = "+name);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
