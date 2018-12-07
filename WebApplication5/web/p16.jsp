<%-- 
    Document   : p16
    Created on : Jun 26, 2018, 9:28:15 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:out value="${pageContext.request.serverName}" /><br>
        <c:set var="ck" value="${pageContext.request.cookies}" /><br>
        Length of the Cookies :<c:out value="${f:length(ck)}" /><br>
        <c:forEach items="${ck}" var="c">
            <c:out value="${c.name}" /><br>
            <c:out value="${c.value}" /><br>
        </c:forEach>
    </body>
</html>
