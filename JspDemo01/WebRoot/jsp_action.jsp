<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jsp_action.jsp' starting page</title>
    
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
  	
   	<!-- 包含指定的页面，动态的包含，只是把运行接过拿过来 -->
   	<%-- <jsp:include page="other02.jsp"></jsp:include> --%>
	
	<%-- 
	<jsp:forward page="other02.jsp"></jsp:forward>
	等同于以下代码 
	--%>
	<jsp:forward page="other02.jsp">
		<jsp:param value="shengzhen" name="address"/>
	</jsp:forward>
	<%
	
		//求求转发
		//request.getRequestDispatcher("other02.jsp").forward(request, response);
		
	 %>
	
	
	
	这是jsp_action页面 <br>
  </body>
</html>
