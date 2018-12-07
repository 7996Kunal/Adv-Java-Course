<%-- 
    Document   : p1
    Created on : Jan 21, 2018, 12:11:32 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="x" value="15" />
        <h1>Hello JSTL</h1>
        <c:set var="y" value="85.254" />
        <c:set var="z" value="Hello" />
        <c:out value="ABCEFGTHYRW" /><br>
        <c:out value="x" /><br>
        <c:out value="${x}" /><br>
        <c:out value="${y}" /><br>
        <c:out value="${z}" /><br>
        <c:out value="x=${x},y=${y},z=${z}" /><br>
        <c:out value="${x*50}" /><br>
        <c:out value="${m*50}" /><br>
        <c:if test="${x gt 50}">
            Value of x is greater than 50
        </c:if>
        <c:if test="${x le 50}">
            Value of x is less than 50
        </c:if>
            <hr>
            <c:forEach begin="1" end="10" var="i">
                <c:out value="${x}x${i}=${x*i}" /><br>
            </c:forEach>
                <hr>
             <c:forEach begin="1" end="10" var="i" step="2">
                <c:out value="${x}x${i}=${x*i}" /><br>
            </c:forEach>    
    </body>
</html>
