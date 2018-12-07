<%-- 
    Document   : DB
    Created on : Jun 30, 2018, 8:42:17 AM
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
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1" user="root" password="" var="con" />
        <s:update dataSource="${con}">
            Create Database EmailApp
        </s:update>
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/EmailApp" user="root" password="" var="con" />    
        <s:update dataSource="${con}">
            Create Table Members(userlogin varchar(20),upass varchar(20),email varchar(30),name varchar(30),mobile varchar(10),lastlogin date,dob date,securityquestion varchar(40),answer varchar(20),profilepic mediumblob)
        </s:update>
        <s:update dataSource="${con}">
            Create Table Emails(mailid int primary key,frommail varchar(20),tomail varchar(100),ccmail varchar(100),bccmail varchar(100),emaildate datetime,subject varchar(100),message varchar(300),status varchar(1))
        </s:update>
        <s:update dataSource="${con}">
            Create Table Attachments(attachid int primary key,mailid int,filename varchar(30),filetype varchar(40),filedata mediumblob)
        </s:update>
            Done
    </body>
</html>
