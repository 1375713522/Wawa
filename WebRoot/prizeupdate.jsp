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
			font-size:30px;
		}	
		input{
			width:200px;
			height:40px;
		}	
	</style>
  </head>
  
  <body background="img/userupdate.jpg" style="background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
   <div id="div" style="text-align:center">
  
    <form action="/Wawa/prizeupdateAction" method="post">
    				<div>奖品名称：</div><div><input type="text" name="pname" value="${prizeupdate.pname }"/></div>
    				<div>奖品等级：</div><div><input type="text" name="pgrade" value="${prizeupdate.pgrade }"/></div>
    				<div>奖品数量：</div><div><input type="text" name="pnum" value="${prizeupdate.pnum}"/></div>
    				<div>奖品描述：</div><div><input type="text" name="pdesc" value="${prizeupdate.pdesc }"/></div>
    				<div><input type='hidden'   name="pid" value ="${prizeupdate.pid }"/></div>
    				<div><input type="submit" value="修改" /></div>
    				<div><a href="${pageContext.request.contextPath }/prize">返回主页</a></div>
    				
    </form>
    </div>
    </body>
</html>
