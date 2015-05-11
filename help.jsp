<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Help</title>
</head>
<body>
	<font size="8" face="华文彩云" color="green">帮助中心</font>
	<br></br>
	<table>
		<tr>
			<td><font size="5" face="黑体">标题栏</font></td>
		</tr>
		<tr>
			<td><tbody>
			<tr bgcolor="skyblue">
				<td width="300">登录信息：展示目前登录用户信息。</td>
				<td><img src="images/help/title.png" width="700" height="350"></img></td>
			</tr>
			<tr bgcolor="skyblue">
				<td width="300">帮助中心：提供本系统的操作方法帮助文档。</td>
				<td><img src="images/help/help.png" width="700" height="350"></img></td>
			</tr>
			<tr bgcolor="skyblue">
				<td width="300">退出登录：由此退出系统返回登陆界面。</td>
				<td><img src="images/help/login.png" width="700" height="350"></img></td>
			</tr>
		</tbody></td>
		</tr>

		<tr>
			<td><font size="5" face="黑体">任务单管理</font></td>
		</tr>
		<tr>
			<td>
		<tbody>
			<tr bgcolor="gray">
				<td width="300">任务单添加：系统自动推送要求完成时间最早的订单生成任务单信息，点击添加即可生成新的任务单。</td>
				<td><img src="images/help/addtask.png" width="700" height="350"></img></td>
			</tr>
			<tr bgcolor="gray">
				<td width="300">任务单修改：可以对已经生成的任务单修改任务类型。</td>
				<td><img src="images/help/modifytask.png" width="700"
					height="350"></img></td>
			</tr>
			<tr bgcolor="gray">
				<td width="300">任务单列表查询：可以获得所有任务单信息；点击任务单号可以获得该任务的详细信息，进入操作界面；用户可根据不同的查询条件获得相应的任务单列表。</td>
				<td><img src="images/help/tasklist.png" width="700"
					height="350"></img></td>
			</tr>
			<tr bgcolor="gray">
				<td width="300">任务单详情查询：系统自动推送一个任务单的详细信息；未发送之前的任务都是可以进行配送员修改的，修改只需重新配送即可。</td>
				<td><img src="images/help/task.png" width="700" height="350"></img></td>
			</tr>
			<tr bgcolor="gray">
				<td width="300">过期任务单查询：如果新添加的任务要求完成时间超过目前操作时间，系统会自动将其放入过期任务单列表。</td>
				<td><img src="images/help/nogettasklist.png" width="700"
					height="350"></img></td>
			</tr>
		</tbody>
		</td>
		</tr>
		<tr>
			<td><font size="5" face="黑体">任务分配</font></td>
		</tr>
		<tr>
			<td>
		<tbody>
			<tr bgcolor="skyblue">
				<td width="300">可发送任务单查询：对于已经配送完成的任务，要从本界面的任务单号点击进入，打印配送/回执单，一旦打印，系统不能再次打印该单，也不能对该任务进行修改。</td>
				<td><img src="images/help/haddistributetask.png" width="700"
					height="350"></img></td>
			</tr>
			<tr bgcolor="skyblue">
				<td width="300">未分配任务单查询：系统将所有未分配过的任务罗列，供用户进行分配操作。</td>
				<td><img src="images/help/nodistributetask.png" width="700"
					height="350"></img></td>
			</tr>
			<tr bgcolor="skyblue">
				<td width="300">任务分配：系统推送一个未分配任务供操作。</td>
				<td><img src="images/help/distributetask.png" width="700"
					height="350"></img></td>
			</tr>
		</tbody>
		</td>
		</tr>
		<tr>
			<td><font size="5" face="黑体">回执清单管理</font></td>
		</tr>
		<tr>
			<td>
		<tbody>
			<tr bgcolor="gray">
				<td width="300">回执清单列表查询：系统将所有回执清单信息；用户可以通过不同的查询条件获得满意的查询结果；点击回执列表的任务单号可以获得本回执单的详细信息，并提供操作。</td>
				<td><img src="images/help/reactionlist.png" width="700"
					height="350"></img></td>
			</tr>
			<tr bgcolor="gray">
				<td width="300">回执清单详情查询：系统自动推送一个回执信息，用户可点击添加回执信息，修改方式是重新添加，可以点击任务单信息查询与该回执单关联的任务单的详细信息。</td>
				<td><img src="images/help/reaction.png" width="700"
					height="350"></img></td>
			</tr>
			<tr bgcolor="gray">
				<td width="300">回执单修改：系统自动推送一个回执清单供用户操作</td>
				<td><img src="images/help/addreaction.png" width="700"
					height="350"></img></td>
			</tr>
		</tbody>
		</td>
		</tr>
		<tr>
			<td><font size="5" face="黑体">货物收款管理</font></td>
		</tr>
		<tr>
			<td>
		<tbody>
			<tr bgcolor="skyblue">
				<td width="300">货物收款列表查询：用户添加回执后，系统默认完成配送，自动生成货物收款清单；用户可以限定时间来查询货款收款信息。</td>
				<td><img src="images/help/payment.png" width="700" height="350"></img></td>
			</tr>
		</tbody>
		</td>
		</tr>
		<tr>
			<td><font size="5" face="黑体">发票管理</font></td>
		</tr>
		<tr>
			<td>
		<tbody>
			<tr bgcolor="gray">
				<td width="300">发票列表查询：系统将所有发票信息；点击发票号可查看发票详细信息。</td>
				<td><img src="images/help/invoicelist.png" width="700"
					height="350"></img></td>
			</tr>
			<tr bgcolor="gray">
				<td width="300">发票详情查询：系统自动推送一个发票信息，用户可点击打印发票来生成新的发票。</td>
				<td><img src="images/help/invoice.png" width="700" height="350"></img></td>
			</tr>
		</tbody>
		</td>
		</tr>
	</table>
</body>
</html>