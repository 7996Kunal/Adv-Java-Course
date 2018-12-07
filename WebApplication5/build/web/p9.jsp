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
        <c:set var="n" value="${f:length(str)}" />
        <c:out value="${f:length(str)}" /><br>
        <c:out value="${f:toLowerCase(str)}" /><br>
        <c:out value="${f:toUpperCase(str)}" /><br>
        <c:out value="${f:contains(str,'hello')}" /><br>
        <c:out value="${f:contains(str,'JSTL')}" /><br>
        <c:out value="${f:substring(str,5,12)}" /><br>
        <c:out value="${f:substring(str,5,60)}" /><br>
        <c:out value="${f:indexOf(str,'JSTL')}" /><br>
        <c:out value="${f:containsIgnoreCase(str,'jstl')}" /><br>
        <c:out value="${f:endsWith(str,'Exam')}" /><br>
        <c:out value="${f:startsWith(str,'Exam')}" /><br>
        <c:out value="${f:escapeXml('x > y and hello < b')}" /><br>
        &lt;a&gt; &copy; &trade; 
    </body>
</html>
