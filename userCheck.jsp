<?xml version="1.0" encoding="GB18030" ?>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%-- <base href="<%=basePath%>"> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>UserCheck</title>

</head>
<body>
	<br /> ��ǰ��¼�û���
	<s:property value="user.username" />
	<%-- <%
		session.removeAttribute("user.username");
	%> --%>
	<%-- <br />
	<a href="actions/showTaskFormList">�����б�</a>
	<a href="actions/showReactionList">��ִ�б�</a>
	<a href="actions/showPaymentList">��Ʒ�տ��б�</a>
	<s:debug></s:debug>
	<br /> --%>
</body>
</html>