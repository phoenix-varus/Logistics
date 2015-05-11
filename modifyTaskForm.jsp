<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ModifyTaskForm</title>
</head>

<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">任务单修改</font>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<div align="center">
		<s:iterator id="taskForm" value="#session.taskForm"></s:iterator>
		<s:iterator id="substation" value="#session.substation"></s:iterator>
		<form action="actions/modifyTaskFormAction">
			<table border="0" bgcolor="03A8F6">
				<tr>
					<td>任务号:</td>
					<td width="150"><input name="task_id" type="text"
						readonly="readonly" value=${taskForm.task_id } /></td>
				</tr>
				<tr>
					<td>订单号:</td>
					<td width="150"><input name="order_id" type="text"
						readonly="readonly" value=${taskForm.order_id } /></td>
				</tr>
				<tr>
					<td>处理分站:</td>
					<td width="150"><input name="substation_name" type="text"
						readonly="readonly" value=${substation.substation_name } /></td>
				</tr>
				<tr>
					<td>任务要求完成日期:</td>
					<td width="150"><input name="task_date" type="text"
						readonly="readonly" value=${taskForm.task_date } /></td>
				</tr>
				<s:select align="middle" label="任务类型" name="task_type_id"
					list="#session.taskTypeList" listKey="task_type_id"
					listValue="task_type" />
			</table>
			<br></br> <input type="submit" value="确认修改"></input>
		</form>
	</div>
</body>
</html>