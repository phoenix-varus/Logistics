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
	<font face="华文彩云" color="green">回执信息</font>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<div id="div1" align="center">
		<s:iterator id="reaction" value="#session.reaction"></s:iterator>
		<s:iterator id="deliver" value="#session.deliver"></s:iterator>
		<table border="0" bgcolor="03A8F6">
			<tbody>
				<tr>
					<td width="300" align="center">任务单号</td>
					<td width="150" align="center">${reaction.task_id }</td>
				</tr>
				<tr>
					<td width="300" align="center">配送员</td>
					<td width="150" align="center">${deliver.deliver_name}</td>
				</tr>
				<tr>
					<td width="300" align="center">备注</td>
					<td width="150" align="center">${reaction.remark }</td>
				</tr>
				<tr>
					<td width="300" align="center">客户满意度</td>
					<td width="150" align="center">${reaction.satisfaction}</td>
				</tr>
			</tbody>
		</table>
		<div>
			<br></br>
			<s:iterator id="reaction" value="#session.reaction"></s:iterator>
			<table>
				<tr>
					<td align=left><form
							action="noModifyTask.jsp?task_id=${reaction.task_id }">
							<input type="submit" value="任务单信息" />
						</form></td>
					<td align=right>
						<form action="actions/modifyReaction?task_id=${reaction.task_id }">
							<input id="task_id" type="hidden" name="task_id"
								value=${reaction.task_id } /> <input type="submit" value="添加回执">
						</form>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>