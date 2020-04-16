<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>prizeadd.jsp</title>
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
  
  <body background="img/useradd.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
   <div id="div" style="text-align:center">
    <form action="/Wawa/prizeaddAction" method="post">
    				<div>奖品名：</div>
    				<div><input type="text" name="pname"/></div>
    				<div>等级：</div>
    				<div><input type="text" name="pgrade"/></div>
    				<div>数量：</div>
    				<div><input type="text" name="pnum"/></div>
    				<div>描述：</div>
    				<div><input type="text" name="pdesc" /></div>
    				<div><input type="submit" value="增加" /></div>
   	 </form>
    
    </div>
    <a href="${pageContext.request.contextPath }/prize">返回主页</a><br />
  </body>
</html>
