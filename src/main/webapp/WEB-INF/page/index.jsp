<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>

<html lang="zh-CN">

	<head>
		<meta charset="utf-8">

		<meta http-equiv="X-UA-Compatible" content="IE=edge">

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title>Bootstrap 模板</title>

		<!-- Bootstrap -->
		<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet">

	</head>

	<body>
			<h4 >基本增删改查</h4>
			<td><a href="${pageContext.request.contextPath}/user/list">查询</a></td>
			<td><a href="${pageContext.request.contextPath}/add">添加</a></td>

	
	</body>
</html>