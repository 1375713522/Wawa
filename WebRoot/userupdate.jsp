<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>userupdate.jsp</title>
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
			top:30%;
		}		
	</style>
  </head>
  
  <body background="img/userupdate.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
   <div id="div" style="text-align:center">
	    <form action="/Wawa/userupdateAction" method="post">
	    				<div>姓名：</div>
	    				<div><input type="text" name="uname" value="${userupdate.uname }"/></div>
	    				<div>电话：</div>
	    				<div><input type="text" name="utel" value="${userupdate.utel }"/></div>
	    				<div>email：</div>
	    				<div><input type="text" name="uemail" value="${userupdate.uemail }"/></div>
	    				<div>年龄：</div>
	    				<div><input type="text" name="uage" value="${userupdate.uage }"/></div>
	    				<div>性别：</div>
	    				<div><input type="text" name="usex" value="${userupdate.usex }"/></div>
	    				<input type='hidden'   name="uid" value ="${userupdate.uid }"/>
	    				<div><input type="submit" value="修改" /></div>
	    </form>
    </div>
    <div>
    <a href="${pageContext.request.contextPath }/user">返回用户页</a>
    </div>
  </body>
</html>
