<%-- 
    Document   : updatestatus
    Created on : Jan 26, 2018, 5:15:51 PM
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
        <s:update dataSource="${con}">
            Update friends set status=? where rid=?
            <s:param value="${param.status}" />
            <s:param value="${param.rid}" />
        </s:update>
            <c:redirect url="myfriends.jsp" />
    </body>
</html>
