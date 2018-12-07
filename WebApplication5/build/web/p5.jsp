<%-- 
    Document   : p5
    Created on : Jun 25, 2018, 8:55:40 AM
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
                String s=request.getParameter("t1");
                out.write(s+"<br>");
        %>
    </body>
</html>
