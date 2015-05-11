<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>物流分站配送任务管理系统</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
</head>
<frameset rows="59,*" frameborder="no" border="0" framespacing="0">
	<frame src="top.jsp" noresize="noresize" frameborder="0"
		name="topFrame" marginwidth="0" marginheight="0" scrolling="no">
	<frameset rows="*" cols="195,*" id="frame">
		<frame src="left.jsp" name="leftFrame" noresize="noresize"
			marginwidth="0" marginheight="0" frameborder="0" scrolling="auto">
		<frame src="right.jsp" name="main" marginwidth="0" marginheight="0"
			frameborder="0" scrolling="yes">
	</frameset>
	<noframes>
		<body></body>
	</noframes>
</frameset>
</html>