<%-- 
    Document   : p14
    Created on : Jun 26, 2018, 8:53:01 AM
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
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/db8am" user="root" password="" scope="session" var="con"/>
        <c:if test="${param.b1 ne nil and param.b1 eq 'Insert'}">
            <s:update dataSource="${con}">
                Insert into employees values(?,?,?,?,?,?)
                <s:param value="${param.t1}" />
                <s:param value="${param.t2}" />
                <s:param value="${param.t3}" />
                <s:param value="${param.t4}" />
                <s:param value="${param.t5}" />
                <s:param value="${param.t6}" />
            </s:update>
            <c:set var="msg" value="Data Inserted" />
        </c:if>
        <c:if test="${param.b1 ne nil and param.b1 eq 'Delete'}">
            <s:update dataSource="${con}">
                Delete from Employees where eid=?
                <s:param value="${param.t1}" />
            </s:update>
            
            <c:set var="msg" value="Data Deleted" />
        </c:if>
        <c:if test="${param.b1 ne nil and param.b1 eq 'Update'}">
            <s:update dataSource="${con}">
                Update Employees set salary=? where eid=?
                <s:param value="${param.t3}" />
                <s:param value="${param.t1}" />
            </s:update>
            <c:set var="msg" value="Data Updated" />
        </c:if>
        <c:if test="${param.b1 ne nil and param.b1 eq 'Search'}">
            <s:query dataSource="${con}" var="rs">
                Select * from employees where eid=?
                <s:param value="${param.t1}"/>
            </s:query>
                <c:if test="${f:length(rs.rows) eq 0}">
                    <c:set var="msg" value="Data Not Found" />
                </c:if>   
                <c:if test="${f:length(rs.rows) eq 1}">
                    <c:set var="s1" value="${rs.rows[0].eid}" />
                    <c:set var="s2" value="${rs.rows[0].name}" />
                    <c:set var="s3" value="${rs.rows[0].salary}" />
                    <c:set var="s4" value="${rs.rows[0].mobile}" />
                    <c:set var="s5" value="${rs.rows[0].doa}" />
                    <c:set var="s6" value="${rs.rows[0].designation}" />
                </c:if>   
        </c:if>
        <form method='post' action='p14.jsp'>
        <table align='center'>
            <tr>
                <td>Employee Id:</td><td><input type='text' name='t1' value='<c:out value="${s1}" />'></td>
            </tr>
            <tr>
                <td>Name:</td><td><input type='text' name='t2' value='<c:out value="${s2}" />'></td>
            </tr>
            <tr>
                <td>Salary:</td><td><input type='text' name='t3' value='<c:out value="${s3}" />'></td>
            </tr>
            <tr>
                <td>Mobile:</td><td><input type='text' name='t4' value='<c:out value="${s4}" />'></td>
            </tr>
            <tr>
                <td>Appointment Date:</td><td><input type='date' name='t5' value='<c:out value="${s5}" />'></td>
            </tr>
            <tr>
                <td>Designation:</td><td><input type='text' name='t6' value='<c:out value="${s6}" />'></td>
            </tr>
            <tr>
                <td></td><td><input type='submit' name='b1' value='Insert'> <input type='submit' name='b1' value='Delete'></td>
            </tr>
            <tr>
                <td></td><td><input type='submit' name='b1' value='Update'> <input type='submit' name='b1' value='Search'></td>
            </tr>
            <tr>
                <td></td><td><c:out value="${msg}" /></td>
            </tr>
        </table></form>
        <hr>
        <s:query dataSource="${con}" var="rs">
            Select * from Employees
        </s:query>
            <table align='center' border='1'>
                <tr>
                    <th>EID</th><th>Name</th><th>Salary</th><th>Mobile</th><th>Appointment Date</th><th>Designation</th><th></th>
                </tr>
                <c:forEach items="${rs.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.eid}" /></td>
                        <td><c:out value="${row.name}" /></td>
                        <td><c:out value="${row.salary}" /></td>
                        <td><c:out value="${row.mobile}" /></td>
                        <td><c:out value="${row.doa}" /></td>
                        <td><c:out value="${row.designation}" /></td>
                        <td><a href='p14.jsp?b1=Search&t1=<c:out value="${row.eid}" />'>Search</a></td>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
