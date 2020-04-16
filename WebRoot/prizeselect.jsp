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
  </head>
  
  <body background="img/prizeselect.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
  	<table border="1" align="center" cellpadding="0" style="text-align:center;font-family:'宋体'; font-size:30px;" cellpadding="0" >
			   	<tr>
			   		<td>奖品名为：</td>
			   		<td>${prizeselect.pname }</td>
			   	</tr>
			   	<tr>
			   		<td>奖品等级为：	</td>
			   		<td>${prizeselect.pgrade }</td>
			   	</tr>
			   	<tr>
			   		<td>奖品数量为：</td>
			   		<td>${prizeselect.pnum }</td>
			   	</tr>
			   	<tr>
			   		<td>奖品描述：</td>
			   		<td>${prizeselect.pdesc}</td>
			   	</tr>
			   	<tr>
			   		<td colspan="2"><a href="${pageContext.request.contextPath }/prize">返回奖品页</a></td>
			   	</tr>
	</table> 	
			   		    
  </body>
</html>
