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
        <div id="d1" style="width:20%; height: 400px;float:left "></div>
        <div id="d2" style="background-color:#ffccff; width:80%;float: right ">
            <table align="center">
                <s:query dataSource="${con}" var="rs">
                    Select * from Messages where toemail=? order by mdate desc
                    <s:param value="${email}" />
                </s:query>
                    <c:forEach items="${rs.rows}" var="row">
                        <tr>
                            <td>
                                <b><c:out value="${row.fromemail}" /></b><br>
                                <b><c:out value="${row.mdate}" /></b><br>
                                <c:out value="${row.message}" /><br>
                                <img src='getPhoto.jsp?tbl=msg&id=<c:out value="${row.mid}" />' width='100px'><hr>
                            </td>
                        </tr>
                    </c:forEach>     
            </table>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
