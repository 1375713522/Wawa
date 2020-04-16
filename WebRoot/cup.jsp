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
  
  <body background="img/cup.jpg">
  			<form action="seach" method="post"  id="form1">
  				<input type="text" name="seach" value="请输入搜索的用户名" id="seach"/>
  				<input type="button" value="确定" onclick="check()"/>
  			</form>
  			<table border="1" align="center" cellpadding="0" style="text-align:center;font-family:'宋体'; font-size:30px;" cellpadding="0" >
  				<tr><td>序号</td><td>姓名</td><td>电话</td><td>邮箱</td><td>年龄</td><td>性别</td><td>中奖物品</td><td>中奖等级</td>
			   <c:forEach step="1" items="${cupall}" var="cup" varStatus="varStatus" >
			   	<tr>
			   		<td>${varStatus.count }</td>
			   		<td>${cup.user.uname }</td>
			   		<td>${cup.user.utel }</td>
			   		<td>${cup.user.uemail }</td>
			   		<td>${cup.user.uage }</td>
			   		<td>${cup.user.usex }</td>
			   		<td>${cup.prize.pname }</td>
			   		<td>${cup.prize.pgrade }</td>
			   		<td><a href="${pageContext.request.contextPath }/cupdelete?cid=${cup.cid}">已发放，删除</a></td>
			   		<td><a href="${pageContext.request.contextPath }/cupselect?cid=${cup.cid}">查看详细记录</a></td>
			   	</tr>
			   </c:forEach>
		   </table>
		   <a href="${pageContext.request.contextPath }/menu.jsp">返回主页</a><br/>
		   <script>
		   		function check(){
		   			var seach=document.getElementById("seach");
		   			var form1=document.getElementById("form1");
		   			if(seach=="")form1.action="/Wawa/cup";
		   			else form1.action="/Wawa/seach";
		   			form1.submit();
		   		}
		   </script>
  </body>
</html>
