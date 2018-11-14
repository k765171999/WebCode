<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  	<br>这是学生列表页面<br>
  		<table border="1" width="700" align="center">
  			<tr>
  				<td>编号</td>
  				<td>姓名</td>
  				<td>年龄</td>
  				<td>性别</td>
  				<td>住址</td>
  			</tr>
  		
	  		<c:forEach var="stu" items="${list}">
	  			<tr>
	  				<td>${stu.id }</td>
	  				<td>${stu.name }</td>
	  				<td>${stu.age }</td>
	  				<td>${stu.gender }</td>
	  				<td>${stu.address }</td>
	  			</tr>
	  		</c:forEach>
  		</table>
  </body>
</html>
