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
	<style type="text/css">
		#div{
			left:20%;
			right:30%;
			position:absolute;
			top:20%;
			font-size:30px;
		}
		.a{
			color:red;
		}
		.b{
			color:green;
		}	
	</style>
	
  </head>
  
  <body background="img/useradd.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
  <div id="div" style="text-align:center">
  				<div class="a">姓名为：</div>
  				<div class="b">${userdelete.uname }</div>
  				<div class="a">电话为：</div>
  				<div class="b">${userdelete.utel }</div>
  				<div class="a">email为：</div>
  				<div class="b"> ${userdelete.uemail }</div>
  				<div class="a">年龄为：</div>
  				<div class="b">${userdelete.uage }</div>
  				<div class="a">性别为：</div>
  				<div class="b">
  					<c:if test="${userdelete.usex ==1}" var="flag" scope="session">男</c:if>
  					<c:if test="${not flag}">女</c:if>
  				</div>
			   	<div>确认删除？</div>
			   	<div><a href="${pageContext.request.contextPath }/userdeleteAction?uid=${userdelete.uid}">是</a></div>
			    <div><a href="${pageContext.request.contextPath }/user">否，返回主页</a></div>
  </div>
			   		    
  </body>
</html>
