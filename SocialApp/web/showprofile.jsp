<%-- 
    Document   : showprofile
    Created on : Jan 26, 2018, 4:37:25 PM
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
        <s:query dataSource="${con}" var="rs">
            Select * from members where email=?
            <s:param value="${param.email}" />
        </s:query>
            <table>
                <c:forEach items="${rs.rows}" var="row">
                    <tr>
                        <td></td><td><c:out value="${row.email}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.name}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.state}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.city}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.dob}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.gender}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.school}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.college}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.hobbies}" /></td>
                    </tr>
                    <tr>
                        <td></td><td><c:out value="${row.aboutme}" /></td>
                    </tr>
                    <tr>
                        <td></td>Profile Photo:<td><img src="getPhoto.jsp?tbl=mem&id=<c:out value="${row.email}" />" width="200px"></td>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
