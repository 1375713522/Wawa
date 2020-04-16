<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

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
	table {
			color:green;
		}	
	</style>
	
  </head>
  
  <body background="img/useradd.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
  <div id="div" style="text-align:center">
  <table border="1" align="center" cellpadding="0" style="font-family:'宋体';text-align:center; font-size:30px;">
			   	<tr><td>奖品名称：</td><td>${prizedelete.pname }</td></tr>
			   	<tr><td>奖品等级：</td><td>${prizedelete.pgrade }</td></tr>
			   	<tr><td>奖品数量：</td><td>${prizedelete.pnum }</td></tr>
			   	<tr><td>奖品描述：</td><td>${prizedelete.pdesc}</td></tr>
			   	<tr ><td>确认删除？</td><td colspan="2"><a href="${pageContext.request.contextPath }/prizedeleteAction?pid=${prizedelete.pid}">是</a></td></tr>
			   <tr><td colspan="2"><a href="${pageContext.request.contextPath }/prize">否，返回主页</a></td></tr>
</table>
  </div>
			   		    
  </body>
</html>
