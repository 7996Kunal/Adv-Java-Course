<%-- 
    Document   : s5
    Created on : Jan 17, 2018, 9:02:00 AM
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
                out.write(s);
        %>
    </body>
</html>
