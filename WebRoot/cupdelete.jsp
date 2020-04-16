<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>cupdelete.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body background="img/useradd.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
  <div id="div" style="text-align:center">
  		<table border="1" align="center" cellpadding="0" style="font-family:'宋体';text-align:center; font-size:30px;">
			   	<tr><td>姓名：</td><td>${cupdelete.user.uname }</td></tr>
			   	<tr><td>电话号：</td><td>${cupdelete.user.utel}</td></tr>
			   	<tr><td>Email：</td><td>${cupdelete.user.uemail}</td></tr>
			    <tr><td>年龄：</td><td>${cupdelete.user.uage}</td></tr>
			   	<tr><td>性别：</td><td>${cupdelete.user.usex}</td></tr>
			   	<tr><td>奖品名称：</td><td>${cupdelete.prize.pname}</td></tr>
			   	<tr><td>奖品等级：</td><td>${cupdelete.prize.pgrade}</td></tr>
			   	<tr><td>奖品数量：</td><td>${cupdelete.prize.pnum}</td></tr>
			   	<tr><td>奖品描述：</td><td>${cupdelete.prize.pdesc}</td></tr>
			   	<tr><td>确认删除？</td><td><a href="${pageContext.request.contextPath }/cupdeleteAction?cid=${cupdelete.cid}">是</a></td></tr>
			   <tr><td colspan="2"><a href="${pageContext.request.contextPath }/cup">否，返回主页</a></td></tr>
			   	</table></div>	    
  </body>
</html>
