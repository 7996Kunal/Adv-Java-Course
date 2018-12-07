<%-- 
    Document   : viewmail
    Created on : Jul 3, 2018, 9:06:27 AM
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
        <sql:query dataSource="${con}" var="rs">
            Select * from emails where mailid=?
            <sql:param value="${param.mid}" />
        </sql:query>                   
            <sql:update dataSource="${con}">
                Update emails set status='R' where mailid=?
            <sql:param value="${param.mid}" />
        </sql:update>                   
        <table>
            <tr>
                <td>From:</td><td><c:out value="${rs.rows[0].frommail}" /></td>
            </tr>
            <tr>
                <td>Cc:</td><td><c:out value="${rs.rows[0].ccmail}" /></td>
            </tr>
            <tr>
                <td>Bcc:</td><td><c:out value="${rs.rows[0].bccmail}" /></td>
            </tr>
            <tr>
                <td>Subject:</td><td><c:out value="${rs.rows[0].subject}" /></td>
            </tr>
            <tr>
                <td valign='top'>Message:</td><td><c:out value="${rs.rows[0].message}" /></td>
            </tr>
            <tr>
                <td>Attachments:</td><td>
                    <sql:query dataSource="${con}" var="rs">
                        Select * from attachments where mailid=?
                        <sql:param value="${param.mid}" />
                    </sql:query>
                        <c:forEach items="${rs.rows}" var="row">
                            <a href='viewfile.jsp?id=<c:out value="${row.attachid}" />'><c:out value="${row.filename}" /></a> | 
                        </c:forEach>
                </td>
            </tr>
        </table>
    </body>
</html>
