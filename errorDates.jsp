<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>ErrorDates</title>
</head>
<body>
	<font face="华文行楷" color="red" size="18">对不起，您日期输入有误！</font>
	<br></br>
	<font face="华文行楷" color="red" size="5"><a
		href="actions/showPaymentList">请返回重新检索</a></font>
</body>
</html>