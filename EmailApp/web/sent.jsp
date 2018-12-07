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
        <script>
            function openEmail(id)
            {
                window.open("viewmail.jsp?mid="+id,"","height=550,width=450,left=300,top=50")
            }
        </script>
    </head>
    <body>        
        <img src="images/mailbanner.jpg" width="100%"><hr>
        <table width="100%"><tr><td><img src="profilepic.jsp" width="50px" onerror=""></td><td>Welcome <c:out value="${uname}" /></td> <td>Last Login:<c:out value="${lastlogin}" /></td><td><a href="logout.jsp">Logout</a></td></tr></table>
        <div id="d1" style="width:150px;background-color: antiquewhite; float: left">
            
            <a href="compose.jsp">Compose</a><hr>
            <a href="inbox.jsp">Inbox</a><hr>
            <a href="dratfs.jsp">Drafts</a><hr>
            <a href="sent.jsp">Sent</a><hr>
            <a href="trash.jsp">Trash</a><hr>
            <a href="settings.jsp">Settings</a><hr>
            <a href="password.jsp">Change Password</a><hr>            
        </div>
        <div id="d2" style="width:850px;background-color: aliceblue;float: right">
            <sql:query dataSource="${con}" var="rs">
                Select * from emails where frommail=? order by emaildate
                <sql:param value="${ulogin}" />
            </sql:query>
                <table border='1'>
                    <tr>
                        <th>To</th><th>Date</th><th>Subject</th><th>Message</th><th></th>
                    </tr>
                    <c:forEach items="${rs.rows}" var="row">
                        <tr>
                            <td><c:out value="${row.tomail}" /></td>
                            <td><c:out value="${row.emaildate}" /></td>
                            <td><c:out value="${fn:substring(row.subject,0,30)}" /></td>
                            <td><c:out value="${fn:substring(row.message,0,30)}" /></td>                            
                            <td><a href='#' onClick='openEmail(<c:out value="${row.mailid}"/>)'>View Email</a></td>                            
                        </tr>
                    </c:forEach>
                </table>
        </div>
        
        
    </body>
</html>
