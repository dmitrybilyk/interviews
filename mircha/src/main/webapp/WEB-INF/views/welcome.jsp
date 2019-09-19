<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Welcome page</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet">
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet">
</head>
<body>
<nav style="background: teal;" class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#"><h4 class="meniItem">Mircha</h4></a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="<c:url value="/interests" />"><h4 class="meniItem">Welcome</h4></a></li>
			<li><a href="<c:url value="/photos" />"><h4 class="meniItem">Photos</h4></a></li>
			<li class="active"><a href="<c:url value="/newUser" />"><h4 class="meniItem">New User</h4></a></li>
		</ul>
	</div>
</nav>
	<div class="success">
		Greeting : ${greeting}
		This is a welcome page.
	</div>
</body>
</html>