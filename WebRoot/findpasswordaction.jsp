<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>findpasswordaction.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#box1{
			left:30%;
			right:30%;
			position:absolute;
			top:30%;
		}
		#box2{
			left:90%;
			top:20%;
			position:absolute;
			width:1%;
			font-size:50px;
		}
	</style>
  </head>
  <body background="img/login.png">
  			<c:if test="${ amailError!=null}" var="flag" scope="session">
  					邮箱有误！
  					<a href="${pageContext.request.contextPath }/login.jsp">登陆</a><br/>
  			</c:if>
  			<c:if test="${not flag}">
  					<div id="box1"  style="text-align:center">
	    				<form action="/Wawa/findpasswordaction" method="post">	
	    					<div>新密码</div>
	    					<div>
	    						<input type="text" name="apassword" />
	    					</div>  
	    					<div>验证码</div>
	    					<div>
	    						<input type="text" name="str" />
	    					</div>  	
	        				<div>
	    						<input type="submit" value="确定" />
	    					</div>
	    				</form>
	    				<a href="${pageContext.request.contextPath }/register.jsp">注册</a><br/>
	    				<a href="${pageContext.request.contextPath }/login.jsp">登陆</a><br/>
	 				</div>
  			</c:if>
	 		<div id="box2">娃娃抽奖系统</div>
  </body>
</html>
