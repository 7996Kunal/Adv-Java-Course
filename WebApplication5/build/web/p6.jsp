<%-- 
    Document   : p6
    Created on : Jun 25, 2018, 8:57:15 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <a:catch var="e">
            <a:out value="${param.t1*100}" />
        </a:catch>
        <a:if test="${e ne nil}">
            Enter Numbers Only
        </a:if>
        
    </body>
</html>
