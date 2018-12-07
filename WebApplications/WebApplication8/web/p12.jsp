<%-- 
    Document   : p12
    Created on : Jan 23, 2018, 1:13:41 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:out value="${pageContext.request.serverName}" /><br>
        <c:out value="${pageContext.request.serverPort}" /><br>
        <c:out value="${pageContext.session.id}" /><br>
        <c:set var="ck" value="${pageContext.request.cookies}" />
        Total Cookies :<c:out value="${f:length(ck)}" /><br>
        <c:forEach items="${ck}" var="c">
            <c:out value="${c.name}:${c.value}" /><br>
        </c:forEach>
            
            <c:remove var="DFDF"/>    
    </body>
</html>
