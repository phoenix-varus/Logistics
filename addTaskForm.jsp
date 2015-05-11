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
<title>AddTaskForm</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">任务单添加</font>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<div align="center">
		<s:iterator id="orderForm" value="#session.orderForm"></s:iterator>
		<s:iterator id="taskType" value="#session.taskType"></s:iterator>
		<form action="actions/addTaskFormAction">
			<table border="0" bgcolor="03A8F6">
				<tr>
					<td>任务号:</td>
					<td width="150"><input name="task_id" type="text"
						readonly="readonly" value="T${orderForm.order_id }"></td>
				</tr>
				<tr>
					<td>订单号:</td>
					<td width="150"><input name="order_id" type="text"
						readonly="readonly" value=${orderForm.order_id } /></td>
				</tr>
				<s:select align="middle" label="分站选择" name="substation_id"
					list="#session.substationList" listKey="substation_id"
					listValue="substation_name" />
				<tr>
					<td>任务要求完成日期:</td>
					<td width="150"><input name="task_date" type="text"
						readonly="readonly" value=${orderForm.task_date } /></td>
				</tr>
				<tr>
					<td>任务类型号:</td>
					<td width="150"><input name="task_type_id" type="text"
						readonly="readonly" value=${taskType.task_type_id } /></td>
				</tr>
				<tr>
					<td>任务类型:</td>
					<td width="150"><input name="task_type" type="text"
						readonly="readonly" value=${taskType.task_type } /></td>
				</tr>
			</table>
			<br></br> <input type="submit" value="确认添加"></input>
		</form>
	</div>
</body>
</html>