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
<title>PaymentList</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">回执信息列表</font>
	<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
	<div id="div1" align="center">
		<form method="post" action="actions/showReactionList">
			<s:select align="middle" label="任务类型" name="task_type_id"
				list="#session.taskTypeList" listKey="task_type_id"
				listValue="task_type" headerKey="" headerValue="全部" />
			<s:select align="middle" label="任务状态" name="task_state_id"
				list="#session.taskStateList" listKey="task_state_id"
				listValue="task_state" headerKey="" headerValue="全部" />
			<s:select align="middle" label="配送员" name="deliver_id"
				list="#session.deliverList" listKey="deliver_id"
				listValue="deliver_name" headerKey="" headerValue="全部" />
			任务要求完成日期：<input name="task_date" type="text" onClick="WdatePicker()" />
			<input type="submit" value="查询" />
		</form>
		<table width="800" border="0" bgcolor="03A8F6" height="10">
			<tr bgcolor="yellow">
				<th>任务单号</th>
				<th>配送员</th>
				<th>备注</th>
				<th>客户满意度</th>
			</tr>
			<s:iterator id="reactionList" value="#session.reactionList">
				<tr>
					<td align="center"><a
						href="actions/showReaction?task_id=<s:property value="task_id" />"><s:property
								value="task_id" /></a></td>
					<td align="center"><s:property value="deliver_id" /></td>
					<td align="center"><s:property value="remark" /></td>
					<td align="center"><s:property value="satisfaction" /></td>
				</tr>
			</s:iterator>
			<%
				session.removeAttribute("paymentList");
			%>
		</table>
	</div>
</body>
</html>