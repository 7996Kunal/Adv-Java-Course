<%-- 
    Document   : p5
    Created on : Jan 23, 2018, 12:05:16 PM
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
        <c:set var="x" value="Example of string functions in JSTL" />
        <c:out value="${x}" /><br>
        <c:out value="${f:toLowerCase(x)}" /><br>
        <c:out value="${f:toUpperCase(x)}" /><br>
        <c:out value="${f:length(x)}" /><br>
        <c:out value="${f:length('Hello')}" /><br>
        <c:out value="${f:indexOf(x,'ion')}" /><br>
        <c:out value="${f:indexOf(x,'JJJ')}" /><br>
        <c:out value="${f:substring(x,5,10)}" /><br>
        <c:out value="${f:substring(x,10,40)}" /><br>
        <c:out value="${f:substring(x,10,f:length(x))}" /><br>
        <c:out value="${f:contains(x,'fun')}" /><br>
        <c:out value="${f:contains(x,'Fun')}" /><br>
        <c:set var="y" value="Value of x>5 and y<10 and a<b>c" />
        <c:out value="${y}" /><br>
        <c:out value="${f:escapeXml(y)}" /><br>
        a&lt;b&gt;c<hr>
        <c:set var="arr" value="${f:split(x,'i')}" />
        Length is <c:out value="${f:length(arr)}" /><br>
        <c:out value="${arr[0]}" /><br>
        <c:out value="${arr[1]}" /><br>
        <c:out value="${arr[2]}" /><br>
        <c:out value="${arr[3]}" /><br>
        <c:out value="${arr[4]}" default="NO VALUE" /><br>
        ----------------------<br>
        <c:forEach var="item" items="${arr}">
            <c:out value="${item}" /><br>
        </c:forEach><br>
        <c:out value="${f:join(arr,',')}" /><br>
        <c:out value="${f:join(arr,'ABC')}" /><br>
    </body>
</html>
