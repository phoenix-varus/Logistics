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
<title>PrintDistributeForm</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">打印回执/配送单</font>
	<br></br>
	<br></br>
	<br></br>
	<div id="div1" align="center">
		<s:iterator id="taskForm" value="#session.taskForm"></s:iterator>
		<s:iterator id="orderForm" value="#session.orderForm"></s:iterator>
		<s:iterator id="taskType" value="#session.taskType"></s:iterator>
		<s:iterator id="substation" value="#session.substation"></s:iterator>
		<s:iterator id="deliver" value="#session.deliver"></s:iterator>
		<table border="0" bgcolor="03A8F6">
			<tbody>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">订单号</font></td>
					<td width="150" align="center">${taskForm.order_id}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">任务单号</font></td>
					<td width="150" align="center">${taskForm.task_id}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">货物名</font></td>
					<td width="150" align="center">${orderForm.product_name}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">客户姓名</font></td>
					<td width="150" align="center">${orderForm.customer_name}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">客户地址</font></td>
					<td width="150" align="center">${orderForm.customer_address}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">客户电话</font></td>
					<td width="150" align="center">${orderForm.customer_call}</td>
				</tr>
				<tr>
					<td width="300" align="center"><font face="楷体" size="4">完成日期</font></td>
					<td width="150" align="center">${taskForm.task_date}</td>
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
				<tr>
					<td width="300" align="center">--------------------</td>
					<td width="150" align="center">--------------------</td>
				</tr>
				<tr bgcolor="white">
					<td width="300" align="center"><font face="楷体" size="4">备注</font></td>
					<td width="200" align="center">__________________</td>
				</tr>
				<tr bgcolor="white">
					<td width="300" align="center"><font face="楷体" size="4">满意度</font></td>
					<td width="200" align="center"><font size="2">__（1-5分，5分为非常满意）</font></td>
				</tr>
			</tbody>
		</table>
		<div>
			<br></br>

			<table>
				<tr>
					<td align=left><form
							action="actions/printDistributeFormAction?task_id=${taskForm.task_id}">
							<input id="deliver" type="submit" value="打印配送/回执单"><input
								id="task_id" type="hidden" name="task_id"
								value=${taskForm.task_id } />
						</form></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>