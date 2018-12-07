<%-- 
    Document   : p9
    Created on : Jun 25, 2018, 9:09:46 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="str" value="Example of String functions of JSTL function library" />
        <c:set var="arr" value="${f:split(str,'i')}" />
        Length of the Array is <c:out value="${f:length(arr)}" /><br>
        <c:forEach var="item" items="${arr}">
            <c:out value="${item}" /><br>
        </c:forEach><br>
        <c:out value="${f:join(arr,',,')}" />    
        <c:out value="${f:replace(str,'i','EYE')}" />    
    </body>
</html>
