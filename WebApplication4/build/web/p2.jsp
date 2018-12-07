<%-- 
    Document   : p2
    Created on : Jun 24, 2018, 8:49:50 AM
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
                //String s=p1.MyClass.getDateTime();
                String s=p1.MyClass.getPassword();
                out.write(s);
        %>
    </body>
</html>
