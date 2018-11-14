<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript">
function  ajaxFunction(){
	   var xmlHttp;
	   try{ // Firefox, Opera 8.0+, Safari
	        xmlHttp=new XMLHttpRequest();
	    }
	    catch (e){
		   try{// Internet Explorer
		         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		      }
		    catch (e){
		      try{
		         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		      }
		      catch (e){}
		      }
	    }

		return xmlHttp;
	 }

	//执行get请求
	function get() {
		
		//1. 创建xmlhttprequest 对象
		var request = ajaxFunction();
		
		//2. 发送请求。
		// http://localhost:8080/day16/demo01.jsp
		//http://localhost:8080/day16/DemoServlet01
		
		/*	
			参数一： 请求类型  GET or  POST
			参数二： 请求的路径
			参数三： 是否异步， true  or false
			
		*/
		request.open("GET" ,"DemoServlet01" ,true );
//		request.open("GET" ,"/day16/DemoServlet01?name=aa&age=18" ,true );
		request.send();
	}
	

</script>
<html>
  <head>
  </head>
  
  <body>
  	<h3><a href="" onclick="get()">使用Ajax发送请求</a></h3>
  </body>
</html>
