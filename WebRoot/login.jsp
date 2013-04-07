<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<style>
		 .dv_1{
		  margin-left:auto;
		  margin-right:auto;
		  width:80%;
		  border:#000000 solid 1px;
		  height:600px;
		 }
		 
		 .dv_2{
		 margin-top:200px; 
		 margin-left:auto;
		 margin-right:auto;
		 width:300px;
		 height:150px;
		 border:#FF0000 solid 1px;
		 text-align:center;
		 vertical-align:middle;
		 
		 }

		body{text-align:center}
		
		</style> 

  </head>
	<body>
		<div class="dv_1">
		  <div class="dv_2">
		  <form action="servlet/LoginServlet" method="post" style=" margin-top:30px;">
		  	<span>账号</span><input type="text" name="acct" /></br>
			<span>密码</span><input type="text" name="pass" style="margin-top:3px;" /></br>
			<input type="submit" value="提交" style="margin-top:10px"/>
		</form>	
		  </div>
		
		</div>
	</body>
</html>
