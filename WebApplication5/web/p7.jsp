<%-- 
    Document   : p7
    Created on : Jun 25, 2018, 9:03:20 AM
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
        <c:set var="x" value="Hello 1" scope="page" /><br>
        <c:set var="y" value="Hello 2" scope="request" /><br>
        <c:set var="z" value="Hello 3" scope="session" /><br>
        <jsp:forward page="p8.jsp" />
    </body>
</html>
