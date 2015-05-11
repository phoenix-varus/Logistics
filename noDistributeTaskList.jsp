<%@ page language="java" pageEncoding="UTF-8"%>
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
<title>TaskListView</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">任务单信息列表</font>
	<br></br>
	<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
	<div align="center">
		<table width="1000" border="0" height="10" bgcolor="03A8F6">
			<tr bgcolor="yellow">
				<th>任务号</th>
				<th>订单号</th>
				<th>完成日期</th>
				<th>任务状态</th>
				<th>任务类型</th>
				<th>处理分站</th>
				<th>配送员</th>
			</tr>
			<s:iterator id="taskFormList" value="#session.taskFormList">
				<tr>
					<td align="center"><a
						href="actions/showTaskForm?task_id=<s:property value="task_id"/>"><s:property
								value="task_id" /></a></td>
					<td align="center">${taskFormList.order_id}</td>
					<td align="center">${taskFormList.task_date}</td>
					<td align="center">${taskFormList.task_state_id}</td>
					<td align="center">${taskFormList.task_type_id}</td>
					<td align="center">${taskFormList.substation_id}</td>
					<td align="center">${taskFormList.deliver_id}</td>
				</tr>
			</s:iterator>
			<%
				session.removeAttribute("taskFormList");
			%>
		</table>
	</div>

</body>
</html>