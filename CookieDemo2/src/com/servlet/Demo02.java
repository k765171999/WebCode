package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo02 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		
		//客户端发送过来的cookie
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for (Cookie cookie2 : cookies) {
				System.out.println(cookie2.getName()+"="+cookie2.getValue());
			}
		}
		
		//1. 先写cookie 可以多个
		Cookie cookie = new Cookie("name","zhangshan");
		response.addCookie(cookie);
		Cookie cookie2 = new Cookie("age","18");
		response.addCookie(cookie2);
		
		//2. 这个cookie的有效期。默认情况关闭浏览器就没了--->没设置有效期
		//expiry 有效     正值：在这个数值之后删除    负值：关闭失效
		//参数以秒计算
		
		cookie.setMaxAge(60*60*24*7);
		
		
		
		
		response.getWriter().write("成功...");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
