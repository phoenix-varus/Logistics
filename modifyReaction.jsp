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
<title>ModifyReaction</title>
</head>
<body background="images/backshow1.jpg">
	<font face="华文彩云" color="green">回执添加</font>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<div id="div1" align="center">
		<s:iterator id="reaction" value="#session.reaction"></s:iterator>
		<s:iterator id="deliver" value="#session.deliver"></s:iterator>
		<form action=" actions/modifyReactionAction">
			<table border="0" bgcolor="03A8F6">
				<tr>
					<td width="300">任务单号</td>
					<td width="150"><input type="text" readonly=readonly
						name="task_id" value=${reaction.task_id } /></td>
				</tr>
				<tr>
					<td width="300">配送员</td>
					<td width="150"><input name="deliver_name" type="text"
						readonly="readonly" value=${deliver.deliver_name } /></td>
				</tr>
				<tr>
					<td width="300">备注</td>
					<td width="150"><input id="remark" name="remark" type="text"
						value=${reaction.remark } /></td>
				</tr>
				<tr>
					<td width="300">客户满意度</td>
					<td width="150"><select name="satisfaction"><option
								value="1">壹</option>
							<option value="2">贰</option>
							<option value="3">叁</option>
							<option value="4">肆</option>
							<option value="5">伍</option></select></td>
				</tr>
			</table>
			<br></br> <input type="submit" value="添加完成">
		</form>
	</div>
</body>
</html>