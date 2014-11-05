<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
       <a href="${pageContext.request.contextPath}/AnnotatedServlet">To Annotated servlet</a>
       <a href="${pageContext.request.contextPath}/RequestDispatcherAnnotatedServlet">To Dispatcher Annotated servlet</a>
       <a href="${pageContext.request.contextPath}/SessionTrackingAnnotatedServlet">Init Student</a>
       <a href="${pageContext.request.contextPath}/CustomRuntimeExceptionServlet">Throw custom exception</a>
       <a href="${pageContext.request.contextPath}/LongRunningServlet">Long running servlet</a>
       <a href="${pageContext.request.contextPath}/AsyncLongRunningServlet">Async Long running servlet</a>
       <a href="${pageContext.request.contextPath}/RedirectToUploadFilePageServlet">To upload page</a>
       <a href="${pageContext.request.contextPath}/TestServletContextServlet">ContextTest</a>
       <a href="${pageContext.request.contextPath}/employee">go to pagination test</a>

       <%--Spring mvc--%>
       <a href="${pageContext.request.contextPath}/mvc/welcome">Go to welcome controller</a>


  "${pageContext.request.contextPath}/mvc/testMVC"
  <c:out value="${returnedParam}"/>
  <c:out value="${servletContext.returnedParam}"/>

       <c:if test="${student ne null}">
           <c:out value="${student}"/>
       </c:if>
       <c:if test="${student eq null}">
           <c:out value="student is null"/>
       </c:if>

  </body>
</html>
