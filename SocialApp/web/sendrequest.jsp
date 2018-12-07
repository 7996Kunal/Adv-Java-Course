<%-- 
    Document   : sendrequest
    Created on : Jan 26, 2018, 4:47:01 PM
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
        <c:if test="${param.b1 ne nil}">
            <jsp:useBean class="p1.MyClass" id="ss" />
            <s:update dataSource="${con}">
                Insert into friends values(?,?,?,?,?,'N')
                <s:param value="${ss.id}" />
                <s:param value="${param.t2}" />
                <s:param value="${param.t1}" />
                <s:param value="${ss.date}" />
                <s:param value="${param.t3}" />                
            </s:update>
                <c:set var="msg" value="Request Sent" />
        </c:if>
        <form method="post">
        <table>
            <tr>
                <td>To:</td><td><input type="text" name="t1" value="<c:out value="${param.email}" />" readonly></td>
            </tr>
            <tr>
                <td>From:</td><td><input type="text" name="t2" value="<c:out value="${email}" />" readonly></td>
            </tr>
            <tr>
                <td>Message:</td><td><textarea name="t3"></textarea></td>
            </tr>
            <tr>
                <td></td><td><input type="submit" value="Send Request" name="b1"></td>
            </tr>
            <tr>
                <td></td><td><c:out value="${msg}" /></td>
            </tr>
            <tr>
                <td></td><td><a href='#' onClick='javascript:window.close()'>Close</a></td>
            </tr>
        </table>
            </form>
    </body>
</html>
