package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContext02 extends HttpServlet {



	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. ��ȡ����
		ServletContext context = getServletContext();
		String address = context.getInitParameter("address");
		System.out.println("����02�õ�������address="+address);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
