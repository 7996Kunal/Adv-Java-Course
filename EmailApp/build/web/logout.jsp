<%-- 
    Document   : logout
    Created on : Jul 3, 2018, 9:39:28 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:remove var="ulogin" />
        <c:remove var="uname" />
        <c:remove var="lastlogin" />
        <c:remove var="con" />
        <c:redirect url="index.jsp" />
    </body>
</html>
