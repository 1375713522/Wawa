<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>userselect.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body background="img/userselect.bmp" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
  	<table border="1" align="center" cellpadding="0" style="text-align:center;font-family:'宋体';color:white; font-size:30px;" cellpadding="0" >
			  <tr>
			  		<td>姓名为：	</td>
			  		<td>${userselect.uname }</td>
			  </tr>
			  <tr>
			  		<td>电话为：</td>
			  		<td>${userselect.utel }</td>
			  </tr>
			  <tr>
			  		<td>email为：</td>
			  		<td>${userselect.uemail }</td>
			  </tr>
			  <tr>
			  		<td>年龄为：</td>
			  		<td>${userselect.uage }</td>
			  </tr>
			  <tr>
			  		<td>性别为：	</td>
			  		<td><c:if test="${userselect.usex ==1}" var="flag" scope="session">男</c:if>
					<c:if test="${not flag}">女</c:if></td>
			  </tr>
			  <tr>
			  	<td colspan="2"><a href="${pageContext.request.contextPath }/userprizeinfo?uid=${userselect.uid}">查看中奖信息</a></td>
			  </tr>
	</table>
			   <a href="${pageContext.request.contextPath }/user">返回用户页</a>
			   		    
  </body>
</html>
