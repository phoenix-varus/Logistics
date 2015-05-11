<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>物流分站配送任务管理系统</title>
<link href="css/top_css.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#03A8F6">
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="194" height="60" align="center"
				background="images/top_logo.jpg"></td>
			<td align="center"
				style="background: url(images/top_bg.jpg) no-repeat"><table
					cellspacing="0" cellpadding="0" border="0" width="100%" height="33">
				</table>
				<table height="26" border="0" align="left" cellpadding="0"
					cellspacing="0" class="subbg">
					<tbody>
						<tr align="center">
							<td width="71" height="26" align="center" valign="middle"
								background="images/top_tt_bg.gif"><a href="right.jsp"
								target="main" class="STYLE2">登录信息</a></td>
							<td align="center" class="topbar"><span class="STYLE2">
							</span></td>
							<td width="71" align="center" valign="middle"
								background="images/top_tt_bg.gif"><a href="help.jsp"
								target="main" class="STYLE2">帮助中心</a></td>
							<td align="center" class="topbar"><span class="STYLE2">
							</span></td>
							<td width="71" align="center" valign="middle"
								background="images/top_tt_bg.gif"><a href="login.jsp"
								target="_top" class="STYLE2">退出登录</a></td>
						</tr>
					</tbody>
				</table></td>
		</tr>
		<tr height="6">
			<td bgcolor="#1F3A65" background="images/top_bg.jpg"></td>
		</tr>
	</table>
</body>
</html>
