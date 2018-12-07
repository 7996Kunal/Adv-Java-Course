<%-- 
    Document   : index
    Created on : Jun 30, 2018, 9:24:54 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body>
        <jsp:useBean id="dd" class="p1.MyClass"/>
        <sql:update dataSource="${con}">
            Insert into Members(userlogin,upass,email,name,mobile,lastlogin,dob,securityquestion,answer) values(?,?,?,?,?,?,?,?,?)
            <sql:param value="${param.t1}" />
            <sql:param value="${param.t2}" />
            <sql:param value="${param.t4}" />
            <sql:param value="${param.t5}" />
            <sql:param value="${param.t6}" />
            <sql:param value="${dd.date}" />
            <sql:param value="${param.t7}" />
            <sql:param value="${param.t8}" />
            <sql:param value="${param.t9}" />
        </sql:update>
        <img src="images/mailbanner.jpg" width="100%"><hr>
        <div style="width:100%; height: 400px">
            <center>
                <img src="images/thanks.jpg"><br>
                <a href="index.jsp">Login</a>
            </center>
        </div>
        <hr>
    <center>All Rights Reserved</center>
    <center><address>Copyright 2018</address></center>
    </body>
</html>
