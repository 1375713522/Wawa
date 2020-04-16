<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>userprizeinfo.jsp</title>
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
  				<tr><td>姓名</td><td>电话</td></tr>
  				<tr><td>${userselect.uname }</td><td>${userselect.utel }</td></tr>
			  	
		   </table>
  	<table border="1" align="center" cellpadding="0" style="text-align:center;font-family:'宋体'; font-size:30px;" cellpadding="0" >
  				<tr><td>序号</td><td>奖品名称</td><td>奖品等级</td><td >奖品描述</td>
			   <c:forEach step="1" items="${userprizeinfo}" var="userprizeinfo" varStatus="varStatus" >
			   	<tr>
			   		<td>${varStatus.count }</td>
			   		<td>${userprizeinfo.pname }</td>
			   		<td>${userprizeinfo.pgrade }</td>
			   		<td>${userprizeinfo.pdesc }</td>
			   	</tr>
			   </c:forEach>
		   </table>
		   <a href="${pageContext.request.contextPath }/userselect?uid=${userselect.uid}">返回上一页</a><br/> 
		   <a href="${pageContext.request.contextPath }/user">返回主页</a><br/>   		    
  </body>
</html>
