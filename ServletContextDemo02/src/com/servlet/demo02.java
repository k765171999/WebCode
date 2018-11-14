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
		//1. �������Ա�
		Properties properties = new Properties();
		//2. ָ����������Դ
		/**
		 * �˴���������ȡWEB���̵���Դ������ͨ��FileInputStream ���ǲ�OK��
		 * ��Ϊ·�������ˣ����������·������ʵ�Ǹ���jre��ȷ���ģ�������������һ��web���̣�
		 * jre�������tomcat������������������·����tomcat�����binĿ¼
		 * 
		 */
		InputStream is = new FileInputStream("src/config.properties");
		//3. ��ȡname���Ե�ֵ
		properties.load(is);
		String name = properties.getProperty("name");
		System.out.println("name = "+name);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
