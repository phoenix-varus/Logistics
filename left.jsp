<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>物流分站配送任务管理系统</title>
<link href="css/left_css.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="16ACFF">
	<table width="98%" border="0" cellpadding="0" cellspacing="0"
		background="images/tablemde.jpg">
		<tr>
			<td height="5" background="images/tableline_top.jpg"
				bgcolor="#16ACFF"></td>
		</tr>
		<tr>
			<td><table width="97%" border=0 align=right cellPadding=0
					cellSpacing=0 class=lefttable>
					<tbody>
						<tr>
							<td height="25"
								style="background: url(images/left_tt.gif) no-repeat">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="20"></td>
										<td class=STYLE1 style="CURSOR: hand" height=25>任务单管理</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td><table id=submenu1 cellSpacing=0 cellPadding=0
									width="100%" border=0>
									<tbody>
										<tr>
											<td><img src="images/closed.gif"></td>
											<td height=23><a href="actions/addTaskForm" target=main>任务单添加</a></td>
										</tr>
										<tr>
											<td><img src="images/closed.gif"></td>
											<td height=23><a href="actions/modifyTaskForm"
												target=main>任务单修改</a></td>
										</tr>
										<tr>
											<td width="2%"><img src="images/closed.gif"></td>
											<td height=23><a href="actions/showTaskFormList"
												target=main>任务单列表查询</a></td>
										</tr>
										<tr>
											<td><img src="images/closed.gif"></td>
											<td height=23><a href="actions/showTaskForm" target=main>任务单详情查询</a></td>
										</tr>
										<tr>
											<td><img src="images/closed.gif"></td>
											<td height=23><a href="actions/noGetOrderList"
												target=main>过期任务单查询</a></td>
										</tr>
									</tbody>
								</table></td>
						</tr>
					</tbody>
				</table></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_bottom.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_top.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td><table class="lefttable" cellspacing="0" cellpadding="0"
					width="97%" align="right" border="0">
					<tbody>
						<tr>
							<td height="25"
								style="background: url(images/left_tt.gif) no-repeat">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="20"></td>
										<td class=STYLE1 style="CURSOR: hand" height=25>任务分配</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td><table id=submenu1 cellSpacing=0 cellPadding=0
									width="100%" border=0>
									<tbody>
										<tr>
											<td width="2%"><img src="images/closed.gif"></td>
											<td height=23><a
												href="actions/hadDistributeTaskList?task_state_id=1"
												target=main>可发送任务单查询</a></td>
										</tr>
										<tr>
											<td width="2%"><img src="images/closed.gif"></td>
											<td height=23><a
												href="actions/noDistributeTaskList?task_state_id=0"
												target=main>未分配任务单查询</a></td>
										</tr>
										<tr>
											<td><img src="images/closed.gif"></td>
											<td height=23><a href="actions/distributeTask"
												target=main>任务分配</a></td>
										</tr>
									</tbody>
								</table></td>
						</tr>
					</tbody>
				</table></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_bottom.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_top.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td><table class=lefttable cellSpacing=0 cellPadding=0
					width="97%" align=right border=0>
					<tbody>
						<tr>
							<td height="25"
								style="background: url(images/left_tt.gif) no-repeat"><table
									width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="20"></td>
										<td class=STYLE1 style="CURSOR: hand" height=25>回执清单管理</td>
									</tr>
								</table></td>
						</tr>
						<tr>
							<td><table id=submenu4 cellSpacing=0 cellPadding=0
									width="100%" border=0>
									<tbody>
										<tr>
											<td width="2%"><img src="images/closed.gif"></td>
											<td height=23><a href="actions/showReactionList"
												target=main>回执单列表查询</a></td>
										</tr>
										<tr>
											<td width="2%"><img src="images/closed.gif"></td>
											<td height=23><a href="actions/showReaction" target=main>回执单详情查询</a></td>
										</tr>
										<tr>
											<td width="2%"><img src="images/closed.gif"></td>
											<td height=23><a href="actions/modifyReaction"
												target=main>回执单修改</a></td>
										</tr>
									</tbody>
								</table></td>
						</tr>
					</tbody>
				</table></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_bottom.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_top.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td><table class=lefttable cellSpacing=0 cellPadding=0
					width="97%" align=right border=0>
					<tbody>
						<tr>
							<td height="25"
								style="background: url(images/left_tt.gif) no-repeat"><table
									width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="20"></td>
										<td class=STYLE1 style="CURSOR: hand" height=25>货物收款查询</td>

									</tr>
								</table></td>
						</tr>
						<tr>
							<td><table id=submenu5 cellSpacing=0 cellPadding=0
									width="100%" border=0>
									<tbody>
										<tr>
											<td width="2%"><img src="images/closed.gif"></td>
											<td height=23><a href="actions/showPaymentList"
												target=main>货物收款列表查询</a></td>
										</tr>

									</tbody>
								</table></td>
						</tr>
					</tbody>
				</table></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_bottom.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_top.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td><table class=lefttable cellSpacing=0 cellPadding=0
					width="97%" align=right border=0>
					<tbody>
						<tr>
							<td height="25"
								style="background: url(images/left_tt.gif) no-repeat"><table
									width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="20"></td>
										<td class=STYLE1 style="CURSOR: hand" height=25>发票管理</td>

									</tr>
								</table></td>
						</tr>
						<tr>
							<td><table id=submenu5 cellSpacing=0 cellPadding=0
									width="100%" border=0>
									<tbody>
										<tr>
											<td width="2%"><img src="images/closed.gif"></td>
											<td height=23><a href="actions/showInvoiceList"
												target=main>发票列表查询</a></td>
										</tr>
										<tr>
											<td><img src="images/closed.gif"></td>
											<td height=23><a href="actions/showInvoice" target=main>发票详情查询</a></td>
										</tr>
									</tbody>
								</table></td>
						</tr>
					</tbody>
				</table></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_bottom.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td height="5" background="images/tableline_top.jpg"
				bgcolor="#9BC2ED"></td>
		</tr>
		<tr>
			<td height="8">

				<table class=lefttable cellSpacing=1 cellPadding=1 width="97%"
					align=right border=0>
					<tbody>
						<tr>
							<td height="25"
								style="background: url(images/left_tt.gif) no-repeat"><table
									width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="20"></td>
										<td class=STYLE1 height=25>系统信息</td>
									</tr>
								</table></td>
						</tr>
						<tr>
							<td height=70><span class="STYLE2"> <img
									src="images/closed.gif">设计制作：闫俊峰<br> <img
									src="images/closed.gif">技术支持：<a
									href="http://user.qzone.qq.com/997882763" target="_blank">闫俊峰</a><br>
									<img src="images/closed.gif">系统版本：1.0
							</span></td>
						</tr>
					</tbody>
				</table>
		<tr>
			<td height="5" background="images/tableline_bottom.jpg"></td>
		</tr>
	</table>
</body>
</html>
