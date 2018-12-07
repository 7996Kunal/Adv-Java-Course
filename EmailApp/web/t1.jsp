<%-- 
    Document   : t1
    Created on : Jul 1, 2018, 11:50:47 AM
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
                String s=request.getRealPath("");
                out.write(s);
        %>
    </body>
</html>
