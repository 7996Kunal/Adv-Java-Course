<%-- 
    Document   : members
    Created on : Jan 24, 2018, 1:03:04 PM
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
        <c:if test="${name eq nil}">
            <c:redirect url="index.jsp" />
        </c:if>
        <jsp:include page="header.jsp"/>
        
        <s:query dataSource="${con}" var="rs">
            Select * from friends where ToEmail=? and status='N' order by rdate desc
            <s:param value="${email}" />
        </s:query>
            <table align='center'>
                <c:forEach items="${rs.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.fromEmail}" /></td>
                        <td><c:out value="${row.message}" /></td>
                        <td><c:out value="${row.rdate}" /></td>
                        <td><a href='updatestatus.jsp?status=A&rid=<c:out value="${row.rid}" />'>Accept</a></td>
                        <td><a href='updatestatus.jsp?status=R&rid=<c:out value="${row.rid}" />'>Reject</a></td>
                    </tr>
                </c:forEach>
            </table>   
        <hr>
            <table>
                <s:query dataSource="${con}" var="rs">
                    select * from Members where email in(Select distinct ToEmail from friends where FromEmail=? and status='A')            
                    <s:param value="${email}" />            
                </s:query>
                    <c:forEach items="${rs.rows}" var="row">
                        <tr>
                            <td><c:out value="${row.name}" /></td>
                            <td><c:out value="${row.city}" /></td>
                            <td><c:out value="${row.hobbies}" /></td>
                            <td><c:out value="${row.email}" /></td>
                            <td><a href='#' onClick="javascript:window.open('showprofile.jsp?email=<c:out value="${row.email}" />','','width=300,height=500,left=300')">Show Profile</a></td>
                        </tr>
               </c:forEach>    
                <s:query dataSource="${con}" var="rs">
                    select * from Members where email in(Select distinct FromEmail from friends where ToEmail=? and status='A')            
                    <s:param value="${email}" />            
                </s:query>
                    <c:forEach items="${rs.rows}" var="row">
                        <tr>
                            <td><c:out value="${row.name}" /></td>
                            <td><c:out value="${row.city}" /></td>
                            <td><c:out value="${row.hobbies}" /></td>
                            <td><c:out value="${row.email}" /></td>
                            <td><a href='#' onClick="javascript:window.open('showprofile.jsp?email=<c:out value="${row.email}" />','','width=300,height=500,left=300')">Show Profile</a></td>
                        </tr>
                    </c:forEach>           
            </table>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
