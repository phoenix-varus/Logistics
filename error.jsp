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
<title>ERROR</title>
</head>
<body background="images/backshow1.jpg">
	<font face="�����п�" color="blue" size="18">�Բ������ĵ�¼��Ϣ����</font>
	<br></br>
	<font face="�����п�" color="blue" size="5"><a href="login.jsp">�뷵�����µ�¼</a></font>
</body>
</html>