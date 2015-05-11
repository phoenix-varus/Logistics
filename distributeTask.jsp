<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%-- <base href="<%=basePath%>"> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DistributeTask</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">任务单分配</font>
	<br></br>
	<br></br><br></br>
	<br></br>
	<div id="div1" align="center">
		<form action="actions/distributeTaskAction">
			<s:iterator id="taskForm" value="#session.taskForm"></s:iterator>
			<s:iterator id="taskType" value="#session.taskType"></s:iterator>
			<s:iterator id="taskState" value="#session.taskState"></s:iterator>
			<s:iterator id="substation" value="#session.substation"></s:iterator>
			<s:iterator id="deliverList" value="#session.deliverList"></s:iterator>
			<table border="0" bgcolor="03A8F6">
				<tr>
					<td width="300">任务单号</td>
					<td width="150"><input type="text" readonly=readonly
						name="task_id" value=${taskForm.task_id } /></td>
				</tr>
				<tr>
					<td width="300">订单号</td>
					<td width="150"><input type="text" readonly=readonly
						name="order_id" value=${taskForm.order_id } /></td>
				</tr>
				<tr>
					<td width="300">完成日期</td>
					<td width="150"><input type="text" readonly=readonly
						name="task_date" value=${taskForm.task_date } /></td>
				</tr>
				<tr>
					<td width="300">任务状态</td>
					<td width="150"><input type="text" readonly=readonly
						name="task_state" value=${taskState.task_state } /></td>
				</tr>
				<tr>
					<td width="300">任务类型</td>
					<td width="150"><input type="text" readonly=readonly
						name="task_type" value=${taskType.task_type } /></td>
				</tr>
				<tr>
					<td width="300">处理分站</td>
					<td width="150"><input type="text" readonly=readonly
						name="substation_name" value=${substation.substation_name } /></td>
				</tr>

				<s:select align="middle" label="配送员" name="deliver_id"
					list="#session.deliverList" listKey="deliver_id"
					listValue="deliver_name" />
			</table>
			<br></br> <input type="submit" value="完成分配"></input>
		</form>
	</div>
</body>
</html>