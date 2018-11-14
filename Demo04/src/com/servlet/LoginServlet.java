package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. ��ȡ����
		response.setContentType("text/html;charset=utf-8");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username="+userName+"==="+"password="+password);
		
		PrintWriter pw = response.getWriter();
		
		if("admin".equals(userName) && "123".equals(password)){
//			System.out.println("��½�ɹ���");
//			pw.write("login success...");
			// 1. �ɹ������ۼ�
			
			//��ȡ��ǰ��ֵ
			Object obj = getServletContext().getAttribute("count");
			int total = 0;
			
			if (obj != null){
				total = Integer.parseInt(String.valueOf(obj));
			}
			System.out.println(""+total);
			getServletContext().setAttribute("count",total+1 );
			
			
			
			//2. ��ת���ɹ��Ľ���
			//��״̬�룬���¶�λ          ״̬��
			response.setStatus(302);
			//��λ��ת��λ������һ��ҳ��
			response.setHeader("Location","login_success.html");
		}else{
//			System.out.println("��½ʧ�ܣ�");
			pw.write("ch成功...");
		}
		//2. У������
		
		//3. 
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
