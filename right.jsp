<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>物流分站配送任务管理系统</title>
</head>
<script language="javascript" type="text/Javascript">
	setInterval(
			"timer.innerHTML=new Date().toLocaleString()+'&nbsp;&nbsp;星期'+'日一二三四五六'.charAt(new Date().getDay());",
			1);
</script>
<body onload="startTime()" background="images/backshow1.jpg">
	<s:iterator id="user" value="#session.user"></s:iterator>
	<font face="华文彩云" size="5" color="blue">欢迎${user.username }登录！</font>
	<br></br>
	<table>
		<tr>
			<td><font face="华文行楷" size="5">当前登录用户：</font><font color="blue">${user.username }</font></td>
		</tr>
		<tr>
			<td><font face="华文行楷" size="5">当前系统时间：</font><font color="blue"><a
					id="timer"></a></font></td>
		</tr>
	</table>
</body>
</html>