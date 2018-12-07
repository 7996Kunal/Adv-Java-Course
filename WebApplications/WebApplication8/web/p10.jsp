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
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/BankAppDB" user="root" password="" var="con" scope="session" />
        <c:if test="${param.b1 ne nil and param.b1 eq 'Insert'}">
            <s:update dataSource="${con}">
                Insert into Products values(?,?,?)
                <s:param value="${param.t1}" />
                <s:param value="${param.t2}" />
                <s:param value="${param.t3}" />
            </s:update>
            <c:set var="msg" value="Data Inserted" />
        </c:if>
        <c:if test="${param.b1 ne nil and param.b1 eq 'Delete'}">
            <s:update dataSource="${con}">
                Delete from products where pid=?
                <s:param value="${param.t1}" />                
            </s:update>
            <c:set var="msg" value="Data Deleted" />
        </c:if>
        <c:if test="${param.b1 ne nil and param.b1 eq 'Update'}">
            <s:update dataSource="${con}">
                Update products set price=?,name=? where pid=?
                <s:param value="${param.t3}" />
                <s:param value="${param.t2}" />
                <s:param value="${param.t1}" />
            </s:update>
            <c:set var="msg" value="Data Updated" />
        </c:if>
        <c:if test="${param.b1 ne nil and param.b1 eq 'Search'}">
            <s:query var="rs" dataSource="${con}">
                Select * from products where pid=?
                <s:param value="${param.t1}" />
            </s:query>
                <c:if test="${f:length(rs.rows) eq 1}" >
                    <c:set var="x1" value="${rs.rows[0].pid}" />
                    <c:set var="x2" value="${rs.rows[0].name}" />
                    <c:set var="x3" value="${rs.rows[0].price}" />
                </c:if>   
               <c:if test="${f:length(rs.rows) ne 1}" >
                    <c:set var="msg" value="Data Not Found" />
                </c:if>    
            
        </c:if>
        <form method="post">
        <table align='center'>
            <tr>
                <td>Product Code:</td><td><input type='text' name='t1' value="<c:out value="${x1}" />"></td><td></td>
            </tr>
            <tr>
                <td>Product Name:</td><td><input type='text' name='t2' value="<c:out value="${x2}" />"></td><td></td>
            </tr>
            <tr>
                <td>Product Price:</td><td><input type='text' name='t3' value="<c:out value="${x3}" />"></td><td></td>
            </tr>
            <tr>
                <td></td><td><input type='submit' name='b1' value='Insert'> <input type='submit' name='b1' value='Search'></td><td></td>
            </tr>
            <tr>
                <td></td><td><input type='submit' name='b1' value='Update'> <input type='submit' name='b1' value='Delete'></td><td></td>
            </tr>
            <tr>
                <td></td><td><font color='red'><c:out value="${msg}" /></font></td><td></td>
            </tr>
        </table>  </form>
    </body>
</html>
