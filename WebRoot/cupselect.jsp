<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>cupselect.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body background="img/prizeselect.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
  	<table border="1" align="center" cellpadding="0" style="text-align:center;font-family:'宋体'; font-size:30px;" cellpadding="0" >
			   	<tr><td>姓名：</td><td>${cupselect.user.uname }</td></tr>
			   	<tr><td>电话号：</td><td>${cupselect.user.utel}</td></tr>
			   	<tr><td>Email：</td><td>${cupselect.user.uemail}</td></tr>
			    <tr><td>年龄：</td><td>${cupselect.user.uage}</td></tr>
			   	<tr><td>性别：</td><td>${cupselect.user.usex}<td></tr>
			   	<tr><td>奖品名称：</td><td>${cupselect.prize.pname}</td></tr>
			   	<tr><td>奖品等级：</td><td>${cupselect.prize.pgrade}<td></tr>
			   	<tr><td>奖品数量：</td><td>${cupselect.prize.pnum}<td></tr>
			   	<tr><td>奖品描述：</td><td>${cupselect.prize.pdesc}<td></tr>
			   <tr><td colspan="2"><a href="${pageContext.request.contextPath }/cup">返回主页</a></td></tr>
			   
			   <c:if test="${userprizea!=null}" var="flag" scope="session">
			   		<tr><td colspan="2"><a href="${pageContext.request.contextPath }/lottery_draw.jsp">继续抽奖</a></td></tr>
			   
			   </c:if>
		</table>	   		    
  </body>
</html>
