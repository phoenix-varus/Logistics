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
<script type="text/javascript" language="JavaScript">
	function check() {
		var date1 = form1.task_date1.value;
		var date2 = form1.task_date2.value;
		if (date1 > date2)
			alert("输入日期有误！");
	}
</script>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PaymentList</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">商品收款清单</font>
	<div align="center">
		<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
		<form name="form1">
			<table>
				<tr>
					<td>开始日期： <input name="task_date1" type="text"
						onClick="WdatePicker()" /></td>
					<td>截止日期： <input name="task_date2" type="text"
						onClick="WdatePicker()" /></td>
					<td><input type="submit" value="查询" onClick="check()" /></td>
				</tr>
			</table>
		</form>
	</div>
	<form method="post" action="actions/showTaskFormList"></form>
	<div id="div1" align="center">
		<table width="800" border="0" bgcolor="03A8F6" height="10">
			<tr bgcolor="yellow">
				<th>商品号</th>
				<th>商品名称</th>
				<th>商品送货数量</th>
				<th>收款金额</th>
				<th>退款金额</th>
				<th>订单号</th>
			</tr>
			<s:iterator id="productFormList" value="#session.productFormList">
				<tr>
					<td align="center">${productFormList.product_id }</td>
					<td align="center">${productFormList.product_name }</td>
					<td align="center">${productFormList.product_num }</td>
					<td align="center">${productFormList.collection }</td>
					<td align="center">${productFormList.refund }</td>
					<td align="center">${productFormList.order_id }</td>
				</tr>
			</s:iterator>
			<%
				session.removeAttribute("paymentList");
			%>
		</table>
	</div>
</body>
</html>