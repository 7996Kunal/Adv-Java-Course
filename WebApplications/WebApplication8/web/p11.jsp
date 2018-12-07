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
        <s:query dataSource="${con}" var="rs">
            Select * from indianstates            
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
            </table>
        <hr>
          
    </body>
</html>
