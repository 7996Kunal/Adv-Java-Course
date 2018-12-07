<%-- 
    Document   : p1
    Created on : Jun 24, 2018, 9:39:37 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="x" value="47" />
        <c:set var="y" value="Hello" />
        <c:out value="x"/><br>
        <c:out value="${x}"/><br>
        <c:out value="x=${x}"/><br>
        <c:out value="y=${y}"/><br>
        <c:out value="x=${x}, y=${y}"/><br>
        <c:out value="${x*100}"/><br>
        <c:if test="${x gt 50}">
            Value of X is greater than 50
        </c:if>
          <c:if test="${x le 50}">
            Value of X is less than 50
        </c:if>
            <hr>
            <c:forEach begin="1" end="10" var="i">
                <c:out value="${x}x${i}=${x*i}" /><br> 
            </c:forEach>
                <hr>
            <c:forEach begin="1" end="10" var="i" step="2">
                <c:out value="${i} and ${x}" /><br> 
            </c:forEach>    
    </body>
</html>
