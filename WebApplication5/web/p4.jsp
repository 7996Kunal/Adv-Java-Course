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
            <c:if test="${param.t1 eq 'abc'}">
                <c:redirect url="p5.jsp" />
            </c:if>
            <c:if test="${param.t1 eq 'xyz'}">
                <jsp:forward page="p5.jsp" />
            </c:if>
        </c:if>
        
    </body>
</html>
