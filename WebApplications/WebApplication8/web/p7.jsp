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
        <s:query dataSource="${con}" var="rs">
            Select * from products
        </s:query>
            Total Rows:<c:out value="${f:length(rs.rows)}" /><br>    
            <c:out value="${rs.rows[0]}" /><br>
            <c:out value="${rs.rows[0].pid}" />,<c:out value="${rs.rows[0].name}" />,<c:out value="${rs.rows[0].price}" />
            <hr>
            <table align='center'>
                <c:forEach begin="0" end="${f:length(rs.rows)}" var="i">
                    <tr>
                        <td><c:out value="${rs.rows[i].pid}" /></td>
                        <td><c:out value="${rs.rows[i].name}" /></td>
                        <td><c:out value="${rs.rows[i].price}" /></td>
                    </tr>
                </c:forEach>                
            </table>
            <hr>
            <table>
                <c:forEach items="${rs.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.pid}" /></td>
                        <td><c:out value="${row.name}" /></td>
                        <td><c:out value="${row.price}" /></td>
                    </tr>
                </c:forEach>
            </table>
            <hr>
            <table align='center'>
                <c:forEach var="row" items="${rs.rows}">
                    <tr>
                        <c:forEach items="${row}" var="col">
                            <td><c:out value="${col.value}" /></td>
                        </c:forEach>
                    </tr>
                </c:forEach>                
            </table>
    </body>
</html>
