package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo01 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取一个枚举集合
		//1. 获取所有头信息
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String name = (String)headerNames.nextElement();
			String value = request.getHeader(name);
			System.out.println(name+"="+value);
		}
		
		//2. 获取客户端提交上来的数据
		String name = request.getParameter("name");
		System.out.println("name="+name);
		
		//获取所有参数，得到一个枚举集合
		//Enumeration<String> names = request.getParameterNames();
		
		Map<String, String[]> map = request.getParameterMap();
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = (String)iterator.next();
			String value = map.get(key)[0];
			
			System.out.println(key+"==="+value);
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
