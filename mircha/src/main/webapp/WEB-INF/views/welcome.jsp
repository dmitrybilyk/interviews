<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Welcome page</title>
	<link rel="stylesheet" type="text/css" href="static/css/app.css"/>
	<link rel="stylesheet" type="text/css" href="static/css/bootstrap.css"/>
</head>
<body>
<nav style="background: teal;" class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="active navbar-brand" href="#"><h4 class="meniItem">Mircha</h4></a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="/login"><h4 class="meniItem">Welcome</h4></a></li>
			<li><a href="/photos"><h4 class="meniItem">Photos</h4></a></li>
			<li><a href="/interests"><h4 class="meniItem">Interests</h4></a></li>
		</ul>
	</div>
</nav>
	<div class="success">
		This is a Mircha's website! Please, <a href="/login">login</a> to see more
	</div>
</body>
</html>