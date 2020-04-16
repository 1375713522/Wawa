<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>menu.jsp</title>
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
		.b{
			font-size:25px;
			color:green;
		}
	</style>
  </head>
  
  <body background="img/login.png">
    <div id="box1"  style="text-align:center">
    <a href="${pageContext.request.contextPath }/user" class="b">人员管理</a><br/>
    
    <a href="${pageContext.request.contextPath }/prize" class="b">奖品管理</a><br/>
    
    <a href="${pageContext.request.contextPath }/cup" class="b">中奖信息</a><br/>
    
    <a href="${pageContext.request.contextPath }/lotteryDraw" class="b">进行抽奖</a><br/>
  	
  	</div>
  	<div id="box2">娃娃抽奖系统</div>
  </body>
</html>
