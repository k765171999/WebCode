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
  <h2>您的购物车商品如下</h2>
	 <%
 			// 1. 先获取map
 			Map<String,Integer> map = (Map<String,Integer>)session.getAttribute("cart");
 			
 			// 2. 遍历map
 			if(map!=null){
 				for(String key: map.keySet()){
 					int value = map.get(key);
 					//<h3><h3>
 	%>
 	<h3>名称：<%=key %> 数量：<%=value %></h3><br>
 	<%
 	
 				}
 			}
 	  %>	
 	  <a href="ClearCartServlet"><h4>清空购物车</h4></a>
  </body>
</html>
