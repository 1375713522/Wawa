<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>prize.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body background="img/prize.jpg">
  			<c:set var="deletePrizeError" scope="session" value="${deletePrizeError}"/>
  			<c:if test="${deletePrizeError !=null}">此奖品未发放完成，不能删除信息</c:if>
  			<c:remove  var="deletePrizeError"  scope="session"  />
  			<a href="${pageContext.request.contextPath }/prizeadd.jsp">增加</a>
  			<table align="center" border="1" style="text-align:center;font-family:'宋体'; font-size:30px;" cellpadding="0">
  				<tr><td>序号</td><td>姓名</td><td>等级</td><td>数量</td><td>描述</td>
			   <c:forEach step="1" items="${prizes}" var="prize" varStatus="varStatus" >
			   	<tr>
			   		<td>${varStatus.count }</td>
			   		<td>${prize.pname }</td>
			   		<td>${prize.pgrade }</td>
			   		<td>${prize.pnum }</td>
			   		<td>${prize.pdesc }</td>
			   		<td><a href="${pageContext.request.contextPath }/prizeselect?pid=${prize.pid}">查看</a></td>
			   		<td><a href="${pageContext.request.contextPath }/prizeupdate?pid=${prize.pid}">修改</a></td>
			   		<td><a href="${pageContext.request.contextPath }/prizedelete?pid=${prize.pid}">删除</a></td>
			   	</tr>
			   </c:forEach>
		   </table>
		   <a href="${pageContext.request.contextPath }/menu.jsp">返回主页</a><br/>
  </body>
</html>
