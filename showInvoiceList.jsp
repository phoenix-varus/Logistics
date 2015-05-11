<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ShowInvoiceList</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">发票信息列表</font>
	<br></br>
	<div align="center">
		<table width="1000" border="0" bgcolor="03A8F6" height="10">
			<tr bgcolor="yellow">
				<th>发票号</th>
				<th>订单号</th>
				<th>商品号</th>
				<th>处理分站</th>
				<th>配送员</th>
			</tr>
			<s:iterator id="invoiceList" value="#session.invoiceList">
				<tr>
					<td align="center"><a
						href="actions/showInvoice?invoice_id=${invoiceList.invoice_id }">${invoiceList.invoice_id}</a></td>
					<td align="center">${invoiceList.order_id}</td>
					<td align="center">${invoiceList.product_id}</td>
					<td align="center">${invoiceList.substation_id}</td>
					<td align="center">${invoiceList.deliver_id}</td>
				</tr>
			</s:iterator>
			<%
				session.removeAttribute("taskFormList");
			%>
		</table>
	</div>
</body>
</html>