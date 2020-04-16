<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>login.jsp</title>
    
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
  					<c:if test="${findpasswordError !=null}" var="flag" scope="session">找回失败</c:if>
  					<c:remove  var="findpasswordError"  scope="session"  />
	<div id="box1"  style="text-align:center">
	    <form action="/Wawa/login" method="post" onsubmit="return checkForm();">
	    	<div>用户名：</div>
	    	<div id="one">包括字母，数字，_的5位字符</div>
	    	<div>
	    		<input type="text" name="ausername" maxlength="5" id="ausername"/>
	    	</div>
	    	<div>密码： </div> 
	    	<div id="two">包括字母，数字，_的5-10位字符</div>
	    	<div>
	        	<input type="text" name="apassword" maxlength="16" onfocus="return checkausername()" id="apassword"/>
	        </div>
	        <div>
	    		<input type="submit" value="登陆" />
	    	</div>
	    </form>
	    <a href="${pageContext.request.contextPath }/register.jsp">注册</a><br/>
	    <a href="${pageContext.request.contextPath }/findpassword.jsp">找回密码</a><br/>
	 </div>
	 <div id="box2">娃娃抽奖系统</div>
	 <script>
	 	function checkForm(){
	 		var apassword=document.getElementById("apassword");
	 		var value=apassword.value;
	 		
	 		var two=document.getElementById("two");
	 		if(value==""){
	 			two.value="密码不能为空！";
	 			two.innerHTML="密码不能为空！"
	 			apassword.focus();
	 			return false;
	 		}
	 		if(!(value.length>=5&&value.length<=10)){
	 			two.value="密码长度不对！";
	 			two.innerHTML="密码长度不对！";
	 			apassword.value="";
	 			apassword.innerHTML="";
	 			apassword.focus();
	 			return false;
	 		}
	 		
	 		for(var i=0;i<value.length;i++){
	 			if(!(value[i]>='0'&&value[i]<='9'||value[i]>='a'&&value[i]<='z'||value>='A'&&value<='Z'||value[i]=='_')){
	 				two.value="密码格式不对！";
	 				two.innerHTML="密码格式不对！";
	 				apassword.value="";
	 				apassword.innerHTML="";
	 				apassword.focus();
	 				return false;
	 			}	
	 		}
	 		two.value="";
	 		two.innerHTML="";
	 		return true;
	 	
	 	}
	 	
	 	function checkausername(){
	 		var ausername=document.getElementById("ausername");
	 		var value=ausername.value;
	 		
	 		var one=document.getElementById("one");
	 		if(value==""){
	 			one.value="用户名不能为空！";
	 			one.innerHTML="用户名不能为空！"
	 			ausername.focus();
	 			return false;
	 		}
	 		if(value.length!=5){
	 			one.value="用户名长度不对！";
	 			one.innerHTML="用户名长度不对！";
	 			ausername.value="";
	 			ausername.innerHTML="";
	 			ausername.focus();
	 			return false;
	 		}
	 		
	 		for(var i=0;i<value.length;i++){
	 			if(!(value[i]>='0'&&value[i]<='9'||value[i]>='a'&&value[i]<='z'||value>='A'&&value<='Z'||value[i]=='_')){
	 				one.value="用户名格式不对！";
	 				one.innerHTML="用户名格式不对！";
	 				ausername.value="";
	 				ausername.innerHTML="";
	 				ausername.focus();
	 				return false;
	 			}	
	 		}
	 		one.value="";
	 		one.innerHTML="";
	 		return true;
	 	}
	 </script>
  </body>
</html>
