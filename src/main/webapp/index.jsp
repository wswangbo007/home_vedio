<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>家庭影院</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/user/touristLogin">游客登录</a>
	<br/>
	<h2>管理员登录</h2>
	<form action="<%=request.getContextPath()%>/user/adminLogin" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" value="wangbo" name="user_name" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="user_password" /></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="登录"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>