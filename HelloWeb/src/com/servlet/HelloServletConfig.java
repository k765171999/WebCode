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
		//servletconfig ���Ի�ȡservlet�����õ�һЩ��Ϣ
		//1. �õ�servlet���ö���ר������������servlet����Ϣ		
		ServletConfig config = getServletConfig();
		String servletName = config.getServletName();
		//2. ���Ի�ȡ�����ĳһ������
		String ad = config.getInitParameter("address");
		System.out.println("servletName="+servletName);
		System.out.println("address="+ad);
		
		//3. ��ȡ���в�������
		Enumeration<String> names = config.getInitParameterNames();
		//���������в�������
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

