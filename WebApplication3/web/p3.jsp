<%-- 
    Document   : p3
    Created on : Jun 23, 2018, 9:21:19 AM
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
        <%
                String id=session.getId();
                out.write(id);
        %>
    </body>
</html>
