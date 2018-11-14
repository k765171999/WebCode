package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class demo03 extends HttpServlet {

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ServletContext context = getServletContext();
//		//��ȡ����·��
//		String path = context.getRealPath("file/config.properties");
////		System.out.println("path="+path);
//		Properties properties = new Properties();
//		InputStream is = new FileInputStream(path);
//		properties.load(is);
//		
//		String name = properties.getProperty("name");
//		System.out.println("name ="+name);
//		test02();
//		
		test03();
	}
	//����classloader��ȡ�����µ���Դ���������
	private void test03() {
		try {
			Properties properties = new Properties();
			/**
			 * ���˭
			 * classloader���˭
			 */
			InputStream is = this.getClass().getClassLoader().getResourceAsStream("file/config.properties");
			
//			InputStream is = context.getResourceAsStream("file/config.properties");
			properties.load(is);
			String name = properties.getProperty("name");
			System.out.println("name22=" + name);
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void test02(){
		try {
			ServletContext context = getServletContext();
			//��ȡ����·��
//			String path = context.getRealPath("file/config.properties");
			
			//		System.out.println("path="+path);
			Properties properties = new Properties();
			InputStream is = context.getResourceAsStream("file/config.properties");
			properties.load(is);
			String name = properties.getProperty("name");
			System.out.println("name22=" + name);
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
