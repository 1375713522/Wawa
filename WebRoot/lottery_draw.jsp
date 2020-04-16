<%@ page language="java" import="java.util.*,zcip.peak.entity.User" pageEncoding="utf-8"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>lowttery_draw.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.onetwo{
			left:30%;
			right:60%;
			position:absolute;
			top:30%;
			font-size:20px;
		}
		#msg{
			left:60%;
			top:20%;
			position:absolute;
			width:30%;
			font-size:20px;
		}
		
		.table{
			font-size:25px;
			text-align:center;
			font-family:'宋体';
		}
		
	</style>
  </head>
  
  <body background="img/lottery_draw.jpg">
  	<div align="center">
  	<select id="pgrade" name="pgrade" style="width:90px;height:30px;" onchange="selectPname()" >
  		<option>请选择等级</option>
  	</select>
  	<select id="pname" name="pname" style="width:90px;height:30px;" onchange="selectPna()">
  	</select>
  	<br />
  	<br />
  	<br />
  	</div>
  	<div align="center" >
    <input type="button" style="width:90px;height:30px;" onclick="start1()" value="开始抽奖" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" style="width:90px;height:30px;" onclick="stop1()" value="停止抽奖" />
    </div>
    <hr>
	<hr>
	<hr>
	<div class="onetwo">
	<div id="msg1"></div>
    <div id="msg2"></div>
    </div>
    <table id="msg"></table>
    <a href="${pageContext.request.contextPath }/menu.jsp">返回主页</a><br/>
<script>
	var msg1 = document.getElementById("msg1");
  	var msg2 = document.getElementById("msg2");
  	var num =parseInt("${fn:length(usera)}"); 
  	var dt=null;
  	var random =null;
  	var uid=[],uname=[],utel=[];
  	var ustr;
  	var flag1=0;
  	function start1(){
  		if(document.getElementById("pgrade").options[
	document.getElementById("pgrade").selectedIndex].value=="请选择等级"){
  			alert("请选择！");
  			return;
  		}
  		if(flag1==0){
  			flag1=1;
  		}
  		else if(flag1==1){
  			return ;
  		}
  		dt=setInterval(function (){
  			if(num==0){
  				alert("所有待抽奖用户都已经中奖！请重新指定用户");
  				window.location.href="/Wawa/user";
  			}
          	random = Math.floor(Math.random()*num);
          	var string = "${usera}";
          	var sub_string=string.slice(1,string.length-1);
		  	for(var i=0;i<sub_string.length;){
		  		var fuid=sub_string.indexOf("uid=",i);
		  		if(fuid==-1)break;
				var luid=sub_string.indexOf(",",fuid);
				uid.push(sub_string.slice(fuid+4,luid));
			
				var funame=sub_string.indexOf("uname=",i);
				var lname=sub_string.indexOf(",",funame);
				uname.push(sub_string.slice(funame+6,lname));
			
				var futel=sub_string.indexOf("utel=",i);
				var lutel=sub_string.indexOf(",",futel);
				utel.push(sub_string.slice(futel+5,lutel));
			
				i=lutel+1;
		  	}
		  
          	msg1.textContent=uname[random];
          	msg2.textContent=utel[random];
          	ustr=uid[random];   
  		},100);
  	}
      
    function stop1(){
    	if(flag1==1)flag1=0;
    	else if(flag1==0)return ;
    	indexy=pname.selectedIndex;
    	var pstr=pids[indexx-1][indexy];
      	clearInterval(dt);
      	alert("恭喜"+uname[random]+"电话为"+utel[random]+"的用户中奖，奖品等级为"+pgrades[indexx-1]+"奖品名称为"+pnames[indexx-1][indexy]);
      	var str="/Wawa/handleServlet?uid="+ustr+"&pid="+pstr;
      	setTimeout(
      		function()
      			{
      			window.location.href=str;
      			},2000);
    }
    
	var pgrades = new Array();
    var pnames=new Array();
    var pids=new Array();
    var pgrade=document.getElementById("pgrade");
    var pname=document.getElementById("pname");
    var indexx,indexy;

	  
  	function selectPname(){
  		pname.innerHTML="";
      	indexx=pgrade.selectedIndex;
		for(var i=0;i<pnames[indexx-1].length;i++){
      	  var option =document.createElement("option");
          var text =pnames[indexx-1][i];
          option.value=text;
          option.innerHTML=text;
          pname.appendChild(option);
      	}
  	}

    window.onload=function(){
    	var string="${prizea}";
	    var sub_string=string.slice(1,string.length-1);
		for(var i=0;i<sub_string.length;){
			var fpid=sub_string.indexOf("pid=",i);
			if(fpid==-1)break;
			var lpid=sub_string.indexOf(",",fpid);
			var aaa=sub_string.slice(fpid+4,lpid);
				
			var fpname=sub_string.indexOf("pname=",i);
			var lpname=sub_string.indexOf(",",fpname);
			var bbb=sub_string.slice(fpname+6,lpname);
				
			var fpgrade=sub_string.indexOf("pgrade=",i);
			var lpgrade=sub_string.indexOf(",",fpgrade);
			var ccc=sub_string.slice(fpgrade+7,lpgrade);
			var flag=-1;
			
			for(var j=0;j<pgrades.length;j++){
				if(pgrades[j]==ccc){
					flag=j;
					break;
				}
			}
			if(flag==-1){
				pgrades.push(ccc);
				pnames.push(new Array(bbb));
				pids.push(new Array(aaa));
			}else {
				pnames[flag].push(bbb);
				pids[flag].push(aaa);
			}
			i=lpgrade+1;
		}
			  
      	for(var i=0;i<pgrades.length;i++){
          var option =document.createElement("option");
          var text =pgrades[i];
          option.value=text;
          option.innerHTML=text;
          pgrade.appendChild(option);
      	}
      	
      	var userprizea="${userprizea}";
		userprizea=userprizea.slice(1,userprizea.length-1);
		userprizea=userprizea+",";
		var table=document.createElement("table");
		
		table.setAttribute('border', 1);
		table.setAttribute('cellpadding', 0);
		table.setAttribute('align','center');
		table.className = 'table';
		
		var tr11=document.createElement("tr");
		var td11=document.createElement("td");
		td11.value="中奖人姓名";	
		td11.innerHTML="中奖人姓名";
		
		var td22=document.createElement("td");
		td22.value="中奖人电话";	
		td22.innerHTML="中奖人电话";
		
		var td33=document.createElement("td");
		td33.value="中奖等级";	
		td33.innerHTML="中奖等级";
		
		var td44=document.createElement("td");
		td44.value="中奖物品";	
		td44.innerHTML="中奖物品";
		
		var td55=document.createElement("td");
		td55.value="查看详细信息";	
		td55.innerHTML="查看详细信息";
		
		tr11.appendChild(td11);
		tr11.appendChild(td22);
		tr11.appendChild(td33);
		tr11.appendChild(td44);
		tr11.appendChild(td55);
		table.appendChild(tr11);
		
		for(var i=0;i<userprizea.length;){

			var _fcid=userprizea.indexOf("cid=",i);
			if(_fcid==-1)break;
			var _lcid=userprizea.indexOf(",",_fcid);
			var eeee=userprizea.slice(_fcid+4,_lcid);
			
			var _funame=userprizea.indexOf("uname=",i);
			//if(_funame==-1)break;
			var _luname=userprizea.indexOf(",",_funame);
			var aaaa=userprizea.slice(_funame+6,_luname);
			
			var _futel=userprizea.indexOf("utel=",i);
			var _lutel=userprizea.indexOf(",",_futel);
			var bbbb=userprizea.slice(_futel+5,_lutel);
		
			var _fpgrade=userprizea.indexOf("pgrade=",i);
			var _lpgrade=userprizea.indexOf(",",_fpgrade);
			var cccc=userprizea.slice(_fpgrade+7,_lpgrade);
		
			var _fpname=userprizea.indexOf("pname=",i);
			var _lpname=userprizea.indexOf("]",_fpname);
			var dddd=userprizea.slice(_fpname+6,_lpname);
		
			var tr=document.createElement("tr");
			var td1=document.createElement("td");
			td1.value=aaaa;	
			td1.innerHTML=aaaa;
			var td2=document.createElement("td");
			td2.value=bbbb;
			td2.innerHTML=bbbb;
			var td3=document.createElement("td");
			td3.value=cccc;	
			td3.innerHTML=cccc;
			var td4=document.createElement("td");
			td4.value=dddd;	
			td4.innerHTML=dddd;
			
			
			var aa=document.createElement("a");
			var href="cupselect?cid="+eeee;
			aa.setAttribute('href', href);
			aa.value="查看";
			aa.innerHTML="查看";
			var td5=document.createElement("td");
			td5.appendChild(aa);
			//td5.value=aa;
			//td5.innerHTML=aa;
			
			
			tr.appendChild(td1);
			tr.appendChild(td2);
			tr.appendChild(td3);
			tr.appendChild(td4);
			tr.appendChild(td5);
			//msg.appendChild(tr);
			table.appendChild(tr);
			i=_lpname+1;
		}
		msg.appendChild(table);
		
		if(pgrades.length==0){
  				alert("奖品已经抽完，请重新选择奖品");
  				window.location.href="/Wawa/prize";
  		}
      	
      	
    };

  </script>
  </body>
</html>
