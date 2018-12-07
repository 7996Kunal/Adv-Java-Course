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
        <form method="post">
            <input type='text' name='t1'><input type='submit' value='Search' name='b1'>
        </form>
        <c:if test="${param.b1 ne nil}">           
        
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/BankAppDB" user="root" password="" var="con" />
        <s:query dataSource="${con}" var="rs">
            Select * from indianstates where states=?
            <s:param value="${param.t1}" />
        </s:query>
            Total Rows:<c:out value="${f:length(rs.rows)}" /><br>    
            <hr>
            <table align='center'>
                <c:forEach begin="0" end="${f:length(rs.rows)}" var="i">
                    <tr>
                        <td><c:out value="${rs.rows[i].states}" /></td>
                        <td><c:out value="${rs.rows[i].city}" /></td>                        
                    </tr>
                </c:forEach>                
            </table></c:if>
        <hr>
          
    </body>
</html>
