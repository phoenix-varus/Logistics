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
<title>ShowInvoice</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">发票信息</font>
	<br></br>
	<br></br>
	<br></br>
	<div id="div1" align="center">
		<s:iterator id="invoice" value="#session.invoice"></s:iterator>
		<s:iterator id="deliver" value="#session.deliver"></s:iterator>
		<table border="0" bgcolor="03A8F6">
			<tbody>
				<tr>
					<td width="300" align="center">发票号</td>
					<td width="150" align="center">${invoice.invoice_id }</td>
				</tr>
				<tr>
					<td width="300" align="center">商品号</td>
					<td width="150" align="center">${invoice.product_id}</td>
				</tr>
				<tr>
					<td width="300" align="center">商品名称</td>
					<td width="150" align="center">${invoice.product_name }</td>
				</tr>
				<tr>
					<td width="300" align="center">商品数量</td>
					<td width="150" align="center">${invoice.product_num }</td>
				</tr>
				<tr>
					<td width="300" align="center">商品总价</td>
					<td width="150" align="center">${invoice.invoice_amount}</td>
				</tr>
				<tr>
					<td width="300" align="center">发票领取日期</td>
					<td width="150" align="center">${invoice.received_date}</td>
				</tr>
				<tr>
					<td width="300" align="center">发票作废日期</td>
					<td width="150" align="center">${invoice.invalid_date}</td>
				</tr>
				<tr>
					<td width="300" align="center">发票领用人</td>
					<td width="150" align="center">${invoice.received_man}</td>
				</tr>
				<tr>
					<td width="300" align="center">发票取缔人</td>
					<td width="150" align="center">${invoice.invalid_man}</td>
				</tr>
				<tr>
					<td width="300" align="center">订单号</td>
					<td width="150" align="center">${invoice.order_id}</td>
				</tr>
				<tr>
					<td width="300" align="center">处理分站</td>
					<td width="150" align="center">${substation.substation_name}</td>
				</tr>
				<tr>
					<td width="300" align="center">配送员</td>
					<td width="150" align="center">${deliver.deliver_name}</td>
				</tr>
				<tr>
					<td width="300" align="center">备注</td>
					<td width="150" align="center">${invoice.remark}</td>
				</tr>
			</tbody>
		</table>
		<div>
			<br></br>
			<table>
				<tr>
					<td align=right>
						<form
							action="actions/printInvoice?invoice_id=${invoice.invoice_id }">
							<input id="invoice_id" type="hidden" name="invoice_id"
								value=${invoice.invoice_id } /> <input type="submit"
								value="打印发票">
						</form>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>