<%-- 
    Document   : p2
    Created on : Jan 21, 2018, 12:37:42 PM
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
        <form method="post">
            <input type="text" name="t1"><br>
            <input type="submit" value="Click Here" name="b1">
        </form>
        <c:choose>
            <c:when test="${param.t1 ne nil and param.t1 lt 0}">
                Value is -tive
            </c:when>
            <c:when test="${param.t1 ne nil and param.t1 ge 0 and param.t1 lt 10}">
                Value is between 1 and 9
            </c:when>
            <c:when test="${param.t1 ne nil and param.t1 ge 10 and param.t1 lt 100}">
                Value is between 10 and 99
            </c:when>
            <c:otherwise>
                Value is greater than 100
            </c:otherwise>    
        </c:choose>
    </body>
</html>
