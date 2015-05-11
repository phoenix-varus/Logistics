<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TaskForm</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">任务单信息</font>
	<br></br>
	<br></br>
	<br></br>
	<div id="div1" align="center">
		<s:iterator id="taskForm" value="#session.taskForm"></s:iterator>
		<s:iterator id="taskType" value="#session.taskType"></s:iterator>
		<s:iterator id="taskState" value="#session.taskState"></s:iterator>
		<s:iterator id="substation" value="#session.substation"></s:iterator>
		<s:iterator id="deliver" value="#session.deliver"></s:iterator>
		<table border="0" bgcolor="03A8F6">
			<tbody>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">任务单号</font></td>
					<td width="150" align="center">${taskForm.task_id}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">订单号</font></td>
					<td width="150" align="center">${taskForm.order_id}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">完成日期</font></td>
					<td width="150" align="center">${taskForm.task_date}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">任务状态</font></td>
					<td width="150" align="center">${taskState.task_state}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">任务类型</font></td>
					<td width="150" align="center">${taskType.task_type}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">处理分站</font></td>
					<td width="150" align="center">${substation.substation_name}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">配送员</font></td>
					<td width="150" align="center">${deliver.deliver_name}</td>
				</tr>
			</tbody>
		</table>
		<div>
			<br></br>

			<table>
				<tr>
					<td align=right>
						<form action="actions/distributeTask?task_id=${taskForm.task_id}">
							<input id="task_id" type="hidden" name="task_id"
								value=${taskForm.task_id } /> <input id="deliver" type="submit"
								value="分配任务">
						</form>
					</td>
					<td align=left><form
							action="actions/modifyTaskForm?task_id=${taskForm.task_id}">
							<input id="deliver" type="submit" value="修改任务单"><input
								id="task_id" type="hidden" name="task_id"
								value=${taskForm.task_id } />
						</form></td>
					<td align=right>
						<form action="actions/deleteTaskForm?task_id=${taskForm.task_id}">
							<input id="task_id" type="hidden" name="task_id"
								value=${taskForm.task_id } /> <input id="deliver" type="submit"
								value="删除任务">
						</form>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>