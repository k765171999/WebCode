package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
/*
 * ��servlet ������ʾ��������
 * 
 */

public class HelloServlet03 implements Servlet{
	//1. init����ʵ��ʱ��ִ���˸÷���
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("helloServlet��ʼ����----");
	}
	//2. ֻҪ������ͻ�ִ��
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("serviceִ����-----");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("�ر���");
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
