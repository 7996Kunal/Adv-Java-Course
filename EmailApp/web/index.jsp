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
        <sql:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/EmailApp" user="root" password="" scope="session" var="con" />    
        <c:if test="${param.b1 ne nil}">
            <sql:query dataSource="${con}" var="rs">
                Select * from Members where userlogin=? and upass=?
                <sql:param value="${param.t1}"/>
                <sql:param value="${param.t2}"/>
            </sql:query>
                <jsp:useBean id="dd" class="p1.MyClass" />
                <c:if test="${fn:length(rs.rows) eq 1}">
                    <c:set var="ulogin" value="${rs.rows[0].userlogin}" scope="session" />
                    <c:set var="uname" value="${rs.rows[0].name}" scope="session" />
                    <c:set var="lastlogin" value="${rs.rows[0].lastlogin}" scope="session" />
                    <sql:update dataSource="${con}">
                        Update members set lastlogin=? where userlogin=?
                        <sql:param value="${dd.date}" />
                        <sql:param value="${param.t1}" />
                    </sql:update>
                    <c:redirect url="members.jsp"/>
                </c:if>    
        </c:if>
        <img src="images/mailbanner.jpg" width="100%"><hr>
        <table>
            <tr>
                <td><img src="images/m6.jpg"></td><td><img src="images/m8.jpg"></td><td>
                    <form method="post">
                    <table>
                        <tr>
                            <td>Login:</td><td><input type="text" name="t1" id="t1"></td><td></td>
                        </tr>
                        <tr>
                            <td>Password:</td><td><input type="password" id="t2" name="t2"></td><td></td>
                        </tr>
                        <tr>
                            <td></td><td><input type="submit" id="b1" name="b1" value="Login"> <a href="registration.jsp">Registration</a></td><td></td>
                        </tr>
                    </table></form>
                </td><td><img src="images/m9.jpg"></td>
            </tr>
        </table><hr>
    <center>All Rights Reserved</center>
    <center><address>Copyright 2018</address></center>
    </body>
</html>
