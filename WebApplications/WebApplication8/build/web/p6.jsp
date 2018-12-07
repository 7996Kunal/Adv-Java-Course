<%-- 
    Document   : p6
    Created on : Jan 23, 2018, 12:27:33 PM
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
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/BankAppDB" user="root" password="" var="con" />
        <s:update dataSource="${con}">
            Create Table Products(pid int,name varchar(20),price int)
        </s:update>
        <s:update dataSource="${con}">
            Insert into products values(11,'Computer',28500)
        </s:update>    
        <s:update dataSource="${con}">
            Insert into products values(12,'Keyboard',500)
        </s:update>    
        <s:update dataSource="${con}">
            Insert into products values(13,'Mouse',150)
        </s:update>        
            Done
    </body>
</html>
