<%-- 
    Document   : temp
    Created on : Jan 26, 2018, 5:23:18 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean class="java.util.Date" id="d"/>
        <c:out value="${d.year}" /><br>
        <c:out value="${d.month}" /><br>
        <c:out value="${d.date}" /><br>
        <c:out value="${d.day}" /><br>
        <c:out value="${d.hours}" /><br>
        <c:out value="${d.minutes}" /><br>
        <c:out value="${d.seconds}" /><br>
        <c:set property="month" value="7" target="${d}" />       
        <hr>
        <c:out value="${d.month}" /><br>
        <jsp:useBean id="s" class="p1.Student" />
        <c:set property="rollno" target="${s}" value="1054" />
        <c:set property="name" target="${s}" value="Abhinav" />
        <c:out value="${s.rollno}" /><br>
        <c:out value="${s.name}" /><br>
        <c:out value="${s.details}" /><br>
    </body>
</html>
