<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增视频</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery/jquery-1.12.0.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/common/CommonJs.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/vedio_type/vedioType.js"></script>
</head>
<body>
	<table>
		<tr id="hiddenTr">
			<td>视频类型</td>
			<td><input type="text" name="vedioName"/></td>
		</tr>
	</table>
	<h1>新增视频类型</h1>
	<input type="button" value="添加选项" id="addTrToTable"/>
	<table id="addVedioTable">
		<tr>
			<td>视频类型</td>
			<td><input type="text" name="vedioName"/></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><input type="button" id="addVedioBtn" value="添加"/></td>
		</tr>
	</table>
</body>
</html>