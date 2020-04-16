<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>user.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body background="img/login.png">
  			<c:set var="deleteUserError" scope="session" value="${deleteUserError}"/>
  			<c:if test="${deleteUserError !=null}">此用户已经中奖，没有发放奖品，不能删除信息</c:if>
  			<c:remove  var="deleteUserError"  scope="session"  />
  			<a href="${pageContext.request.contextPath }/useradd.jsp">增加</a>
  			<table border="1" align="center" cellpadding="0" style="font-family:'宋体'; font-size:30px;">
  				<tr><td>序号</td><td>姓名</td><td align="center">电话</td>
			   <c:forEach step="1" items="${users}" var="user" varStatus="varStatus" >
			   	<tr>
			   		<td>${varStatus.count }</td>
			   		<td>${user.uname }</td>
			   		<td>${user.utel }</td>
			   		<td><a href="${pageContext.request.contextPath }/userselect?uid=${user.uid}">查看</a></td>
			   		<td><a href="${pageContext.request.contextPath }/userupdate?uid=${user.uid}">修改</a></td>
			   		<td><a href="${pageContext.request.contextPath }/userdelete?uid=${user.uid}">删除</a></td>
			   	</tr>
			   </c:forEach>
		   </table>
		   <a href="${pageContext.request.contextPath }/menu.jsp">返回主页</a><br/>
  </body>
</html>
