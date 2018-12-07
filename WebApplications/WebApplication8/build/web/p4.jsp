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
        <c:if test="${param.t1 ne nil}">
            <c:catch var="e">
                <c:out value="${param.t1*100}" />
            </c:catch>
            <c:if test="${e ne nil}">
                Enter Numbers Only
            </c:if>
                <c:if test="${param.t1 eq 100}">
                    <c:redirect url="p1.jsp" />
                </c:if>
        </c:if>
    </body>
</html>
