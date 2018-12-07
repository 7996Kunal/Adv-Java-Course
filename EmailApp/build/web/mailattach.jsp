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
        <div id="d2" style="width:800px;background-color: aliceblue;float: right">
            <c:if test="${param.b1 ne nil and param.b1 eq 'Send Mail'}">
                <sql:query dataSource="${con}" var="rs">
                    Select count(*)+1 as mailid from emails
                </sql:query>
                <c:set var="mailid" value="${rs.rows[0].mailid}" />   
                <jsp:useBean id="dt" class="p1.MyClass"/>                
                <sql:update dataSource="${con}">
                        Insert into emails values(?,?,?,?,?,?,?,?,?)
                        <sql:param value="${mailid}" />
                        <sql:param value="${ulogin}" />
                        <sql:param value="${param.t1}" />
                        <sql:param value="${param.t2}" />
                        <sql:param value="${param.t3}" />
                        <sql:param value="${dt.dateTime}" />
                        <sql:param value="${param.t4}" />
                        <sql:param value="${param.t5}" />
                        <sql:param value="N" />
                </sql:update>
                        <form method="post" action="attach.jsp" enctype="multipart/form-data">
                            <table>
                                <tr>
                                    <td></td><td><input type="hidden" name="t0" value="<c:out value="${mailid}" />"></td>
                                </tr>
                                <tr>
                                    <td>File 1:</td><td><input type="file" name="t1"></td>
                                </tr>
                                <tr>
                                    <td>File 2:</td><td><input type="file" name="t2"></td>
                                </tr>
                                <tr>
                                    <td>File 3:</td><td><input type="file" name="t3"></td>
                                </tr>
                                <tr>
                                    <td></td><td><input type="submit" name="b1" value="Attach Files"></td>
                                </tr>
                                <tr>
                                    <td colspan="3"><hr></td>
                                </tr>
                                <tr>
                                    <td></td><td><input type="button" value="Done" onclick="javascript:window.open('members.jsp','_self')"></td>
                                </tr>
                            </table>
                        </form>        
            </c:if>
                        <c:if test="${param.b1 ne nil and param.b1 eq 'Send Mail by Gmail'}">
                            <sql:query dataSource="${con}" var="rs">
                                Select email from members where userlogin=?
                                <sql:param value="${ulogin}" />
                            </sql:query>
                            <c:set var="from" value="${rs.rows[0].email}" />   
                            <jsp:useBean id="mail" class="p1.EmailSender"/>
                            
                            <c:set target="${mail}" property="from" value="${from}" />
                            <c:set target="${mail}" property="to" value="${param.t1}" />
                            <c:set target="${mail}" property="cc" value="${param.t2}" />
                            <c:set target="${mail}" property="bcc" value="${param.t3}" />
                            <c:set target="${mail}" property="subject" value="${param.t4}" />
                            <c:set target="${mail}" property="message" value="${param.t5}" />
                            <c:set target="${mail}" property="password" value="${param.t6}" />
                            <c:if test="${mail.mail}" >
                                <c:redirect url="members.jsp" />
                            </c:if>                            
                            <c:if test="${not mail.mail}" >
                                Email Sending Error
                            </c:if>                            
                        </c:if>            
        </div>
    
        
       
</body>
</html>
