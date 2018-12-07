<%-- 
    Document   : p3
    Created on : Jun 24, 2018, 8:55:14 AM
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
        <jsp:setProperty name="s" property="rollno" value="123" />
        <jsp:setProperty name="s" property="name" value="Ankit Kumar" />
        <jsp:setProperty name="s" property="course" value="MBA" />
        <jsp:getProperty name="s" property="rollno" /><br>
        <jsp:getProperty name="s" property="name" /><br>
        <jsp:getProperty name="s" property="course" /><br>
         <jsp:getProperty name="s" property="details" /><br>
        
    </body>
</html>
