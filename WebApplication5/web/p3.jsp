<%-- 
    Document   : p2
    Created on : Jun 25, 2018, 8:41:08 AM
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
            <input type="text" name="t1"><input type="submit" name="b1" value="Click Here"/>
        </form><br>
        <c:if test="${param.b1 ne nil}">
            <c:forEach begin="1" end="10" var="i">
                <c:out value="${param.t1}" /><br/>
            </c:forEach>
        </c:if>
        <c:if test="${param.b1 ne nil}">
            <c:choose>
                <c:when test="${param.t1 lt 0}">
                    Number is Negative
                </c:when>
                <c:when test="${param.t1 eq 0}">
                    Number is Zero
                </c:when>
                <c:when test="${param.t1 ge 1 and param.t1 le 100}">
                    Between 1 and 100
                </c:when>
                <c:otherwise>
                    Number is greater than 100
                </c:otherwise>    
            </c:choose>
        </c:if>
    </body>
</html>
