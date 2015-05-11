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
<title>NoGetOrderList</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">已过期任务单列表</font>
	<br></br>
	<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
	<div align="center">
		<table width="1000" border="0" height="10" bgcolor="03A8F6">
			<tr bgcolor="yellow">
				<th>任务号</th>
				<th>订单号</th>
				<th>要求完成日期</th>
				<th>客户姓名</th>
				<th>客户电话</th>
				<th>处理分站</th>
				<th>任务状态</th>
			</tr>
			<s:iterator id="orderFormList" value="#session.orderFormList">
				<s:iterator id="taskFormList" value="#session.taskFormList">
					<tr>
						<td align="center"><a
							href="actions/showTaskForm?task_id=<s:property value="task_id"/>"><s:property
									value="task_id" /></a></td>
						<td align="center">${taskFormList.order_id}</td>
						<td align="center">${taskFormList.task_date}</td>
						<td align="center">${orderFormList.customer_name}</td>
						<td align="center">${orderFormList.customer_call}</td>
						<td align="center">${orderFormList.substation_id}</td>
						<td align="center">${taskFormList.task_state_id}</td>
					</tr>
					<%
						session.removeAttribute("taskFormList");
								session.removeAttribute("orderFormList");
					%>
				</s:iterator>
			</s:iterator>

		</table>
	</div>
</body>
</html>