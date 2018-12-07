<%-- 
    Document   : p9
    Created on : Jun 25, 2018, 9:09:46 AM
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
        
        <s:query var="rs" dataSource="${con}">
            Select * from Employees
        </s:query>
            Total Rows:<c:out value="${f:length(rs.rows)}" />    <br>
            <table border="1">
            <c:forEach begin="0" end="${f:length(rs.rows)-1}" var="i">
                <tr>
                    <td><c:out value="${rs.rows[i].eid}" /></td>
                    <td><c:out value="${rs.rows[i].name}" /></td>
                    <td><c:out value="${rs.rows[i].salary}" /></td>
                    <td><c:out value="${rs.rows[i].doa}" /></td>
                    <td><c:out value="${rs.rows[i].designation}" /></td>
                </tr>
            </c:forEach>
             </table>   
    </body>
</html>
