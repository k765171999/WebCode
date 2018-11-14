<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cart.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<a href="CartServlet?id=0"><h3> Iphone 7</h3></a><br>
	<a href="CartServlet?id=1"><h3> 小米7</h3></a><br>
	<a href="CartServlet?id=2"><h3> Iphone 8</h3></a><br>
	<a href="CartServlet?id=3"><h3> 华为P20</h3></a><br>
	<a href="CartServlet?id=4"><h3> 魅族 7</h3></a><br>
	
  </body>
</html>
