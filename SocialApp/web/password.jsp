<%-- 
    Document   : members
    Created on : Jan 24, 2018, 1:03:04 PM
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
        <c:if test="${name eq nil}">
            <c:redirect url="index.jsp" />
        </c:if>
        <jsp:include page="header.jsp"/>
        
        <jsp:include page="footer.jsp"/>
    </body>
</html>
