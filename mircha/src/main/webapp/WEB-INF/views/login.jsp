<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login page</title>
		<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet">
		<link href="<c:url value='/static/css/app.css' />" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
	</head>

	<body>
		<div id="mainWrapper">
			<div class="login-container">
				<div class="login-card">
					<div class="login-form">
						<c:url var="loginUrl" value="/loginUser" />
						<c:url var="toRegistration" value="/newUser" />
						<form:form action="${loginUrl}" modelAttribute="user" method="post" class="form-horizontal">
							<c:if test="${param.error != null}">
								<div class="alert alert-danger">
									<p>Invalid username and password.</p>
								</div>
							</c:if>
							<c:if test="${param.logout != null}">
								<div class="alert alert-success">
									<p>You have been logged out successfully.</p>
								</div>
							</c:if>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="ssoId"><i class="fa fa-user"></i></label>
								<%--<form:input type="text" path="ssoId" id="ssoId" class="form-control input-sm"/>--%>
								<form:input path="ssoId" type="text" class="form-control" id="ssoId" name="ssoId" placeholder="Enter Username" required="true"></form:input>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label> 
								<form:input path="password" type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required="true"></form:input>
							</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
								
							<div class="form-actions">
								<input type="submit"
									class="btn btn-block btn-primary btn-default" value="Log in">
							</div>

							<a class="form-actions" href="${toRegistration}">Registration</a>
						</form:form>
					</div>
				</div>
			</div>
		</div>

	</body>
</html>