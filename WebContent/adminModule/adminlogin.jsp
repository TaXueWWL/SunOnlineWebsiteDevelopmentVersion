<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	response.setHeader("Pragma","No-cache");
	response.setHeader("Cache-Control","no-cache");
	response.setDateHeader("Expires", 0);
%>
<meta charset="utf-8">
<title>太阳在线后台登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="assets/css/reset.css">
<link rel="stylesheet" href="assets/css/supersized.css">
<link rel="stylesheet" href="assets/css/style.css">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

</head>

<body>


	<div class="page-container">
		<h1>管 理 员 登 录</h1>
		<form action="VerifyAdminLoginServlet" method="post">
			<!-- 回显用户名 -->
			<input type="text" name="username" class="username"
				placeholder="请输入用户名"
				value=<%=request.getAttribute("admin_name") != null ? request.getAttribute("admin_name") : ""%>>
			<!-- 错误提示回显 -->
			<p id="nametip">
				
			</p>
			<input type="password" name="password" class="password"
				placeholder="请输入密码">

			<p id="passtip">
				<%=request.getAttribute("errorMsg") != null ? request.getAttribute("errorMsg") : ""%>
			</p>
			<button type="submit">登 录</button>
			<div class="error">
				<span>！</span>
			</div>
		</form>
		<div class="connect"></div>
	</div>
	<br />
	<div align="center">
		<font color="orange">2016太阳在线 All rights Reserved</font>
	</div>

	<!-- Javascript -->
	<script src="assets/js/jquery-1.8.2.min.js"></script>
	<script src="assets/js/supersized.3.2.7.min.js"></script>
	<script src="assets/js/supersized-init.js"></script>
	<script src="assets/js/validate.js"></script>

</body>

</html>