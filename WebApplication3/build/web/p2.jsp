<%-- 
    Document   : p2
    Created on : Jun 23, 2018, 9:12:30 AM
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
        <h1>Heading 1</h1>
        <%
        int x=10;
        for(int i=1;i<=10;i++)
        {
            out.write(x+"<br>");
        }
        %>
        <h2>Heading 2</h2>
    </body>
</html>
