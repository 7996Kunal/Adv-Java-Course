<%-- 
    Document   : p5
    Created on : Jun 24, 2018, 9:10:46 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="s" class="p1.Student" />
        <jsp:setProperty name="s" property="*" />
        <jsp:getProperty name="s" property="details"/>
        <%
                s.insert();
        %>
        
    </body>
</html>
