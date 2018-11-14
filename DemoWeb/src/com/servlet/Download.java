  package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Download extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String filename = request.getParameter("filename");
		filename = new String(filename.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println("filename="+filename);
		
		String path = getServletContext().getRealPath("download/"+filename);
		response.setHeader("Content-Disposition", "attachment; filename="+filename);
//		response.sendRedirect("login_success.html");
		
		//3. 转化成输入流
		InputStream is = new FileInputStream(path);
		OutputStream os = response.getOutputStream();
		
		int len = 0 ;
		byte[]buffer = new byte[1024];
		while( (len = is.read(buffer)) != -1){
			os.write(buffer, 0, len);
		}
		
		os.close();
		is.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
			
	}

}
