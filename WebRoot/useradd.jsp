<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>useradd.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#div{
			left:20%;
			right:30%;
			position:absolute;
			top:30%;
		}		
	</style>
	
  </head>
   <body background="img/useradd.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
   <div id="div" style="text-align:center">
	    <form action="/Wawa/useraddAction" method="post" >
	    				<div>姓名：</div>
	    				<div><input type="text" name="uname" value="${userupdate.uname }"/></div>
	    				<div>电话：</div>
	    				<div><input type="text" name="utel" value="${userupdate.utel }"/></div>
	    				<div>email:</div>
	    				<div><input type="text" name="uemail" value="${userupdate.uemail }"/></div>
	    				<div>年龄:</div>
	    				<div><input type="text" name="uage" value="${userupdate.uage }"/></div>
	    				<div>性别：</div>
	    				<div><input type="text" name="usex" value="${userupdate.usex }"/></div>
	    				<div><input type="submit" value="增加" /></div>
	    </form>
    </div>
    <div>
    <a href="${pageContext.request.contextPath }/user">返回用户页</a>
    </div>
    <br>
  </body>
</html>
