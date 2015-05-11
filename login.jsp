<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//Dtd HTML 4.0 transitional//EN">
<html>
<head>
<title>Login</title>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<style type=text/css>
</style>
</head>
<body background="images/backshow.jpg">
	<div id=div1>
		<table id=login height="100%" cellSpacing=0 cellPadding=0 width=800
			align=center>
			<tbody>
				<tr height="50">
					<td></td>
				</tr>
				<tr align="center">
					<td><font size="56" face="华文行楷" color="FDC109">物流分站配送任务管理系统</font></td>
				</tr>
				<tr id="main">
					<td>
						<form action="actions/index" method="post">
							<table height="100%" cellSpacing=0 cellPadding=0 width="100%">
								<tbody align="right">
									<tr>
									</tr>
									<tr height=350>
										<td width=380>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr height=40>
										<td rowSpan=4>&nbsp;</td>
										<td width=120>&nbsp;</td>
										<td>用户名：</td>
										<td><input class=textbox id=username name=username>
										</td>

									</tr>
									<tr height=40>
										<td width=120>&nbsp;</td>
										<td>密 码：</td>
										<td><input class=textbox id=password type=password
											name=password></td>

									</tr>
									<tr height=40>
										<td></td>
										<td width=120>&nbsp;</td>
										<td align=right><input id=login type=submit value=" 登 录 "
											name=login></td>

									</tr>

								</tbody>
							</table>
						</form>
					</td>
				</tr>
				<tr id=root height=38>
					<td>&nbsp;</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
