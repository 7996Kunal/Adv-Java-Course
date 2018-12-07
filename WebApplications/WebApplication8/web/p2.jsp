<%-- 
    Document   : p2
    Created on : Jan 21, 2018, 12:37:42 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <m:set var="x" value="${param.t1}" /><br>
        <m:out value="${param.t1}" /><br>
    <m:if test="${param.b1 eq nil}">
        Enter Some Value and press submit
    </m:if>
    <m:if test="${param.b1 ne nil}">
        <m:forEach begin="1" end="10" var="i">
            <m:out value="${param.t1}x${i}=${param.t1*i}" /><br>
        </m:forEach>
    </m:if>    
    </body>
</html>
