<%--
  Created by IntelliJ IDEA.
  User: dmitry
  Date: 3/16/14
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
       <a href="${pageContext.request.contextPath}/TestForwardRedirectServlet?param=redirect">Redirect</a>
       <a href="${pageContext.request.contextPath}/TestForwardRedirectServlet?param=forward">Forward</a>
  </body>
</html>
