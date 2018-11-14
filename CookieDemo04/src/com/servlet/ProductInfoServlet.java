package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Util.CookieUtil;

public class ProductInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		
		//获取传过来的ID
		String id = request.getParameter("id");
		
		//拿cookie
		Cookie[] cookies = request.getCookies();
		
		Cookie cookie = CookieUtil.findCookie(cookies, "history");
		
		if(cookie==null){
			//第一次访问
			// 1. 获取id
			// 2. 设置cookie 
			Cookie c = new Cookie("history", id);
			
			// 3.设置存货长度
			c.setMaxAge(60*60*24*7);
			
			// 4. 设置访问这个工程时才带cookie过来
			c.setPath("/CookieDemo04");
			
			response.addCookie(c);
			// 3. 跳转页面
//			response.sendRedirect("product_info.htm");
		}else{
			// 第二次
			// 1. 取出cookie
			String ids = cookie.getValue();
			// 2. 拼接新值 1#2
			cookie.setValue(id+"#"+ids);
			response.addCookie(cookie);
		}
			response.sendRedirect("product_info.htm");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
