<%-- 
    Document   : index
    Created on : Jan 24, 2018, 12:29:39 PM
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
        <script>
            function submitform()
            {
                a1=document.getElementById("t1");
                a2=document.getElementById("t2");
                if(a1.value=="")
                {
                    document.getElementById("d1").innerHTML="<font color='red'>*</font>";
                    a1.focus();
                    return;
                }
                else
                {
                    document.getElementById("d1").innerHTML="";
                }
                if(a2.value=="")
                {
                    document.getElementById("d2").innerHTML="<font color='red'>*</font>";
                    a2.focus();
                    return;
                }
                else
                {
                    document.getElementById("d2").innerHTML="";
                }
                document.frm1.submit();
            }
        </script>
    </head>
    <body>
        <c:if test="${param.t1 ne nil}">
            <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/SocialApp" user="root" password="" var="con" scope="session"/>
            <s:query dataSource="${con}" var="rs">
                Select * from Members where email=? and upass=?
                <s:param value="${param.t1}"/>
                <s:param value="${param.t2}"/>
            </s:query>
                <c:if test="${f:length(rs.rows) eq 1}">
                    <c:set var="email" value="${param.t1}" />
                    <c:set var="name" value="${rs.rows[0].name}" />
                    <c:redirect url="members.jsp" />
                </c:if>    
                <c:if test="${f:length(rs.rows) eq 0}">
                    <c:set var="msg" value="Invalid Login/Password!!!" />
                </c:if>    
        </c:if>
        <img src="banner.jpg" width="100%"/><hr>
        <form name='frm1' method="post">
        <table>
            <tr>
                <td><img src="social-media.jpg" width="500px"></td><td>
                    <table>
                        <tr>
                            <td>Email:</td><td><input type='email' name='t1' id='t1'></td><td><div id='d1'></div></td>
                        </tr>
                        <tr>
                            <td>Password:</td><td><input type='password' name='t2' id='t2'></td><td><div id='d2'></div></td>
                        </tr>
                        <tr>
                            <td></td><td><a href='#' onClick='submitform()'><img src='login.jpg' width='150px'></a></td><td></td>
                        </tr>
                        <tr>
                            <td></td><td><font color='red'><c:out value="${msg}" /></font></td><td></td>
                        </tr>
                        <tr>
                            <td></td><td><a href='register.jsp'><img src='register.png' width='150px'></a></td><td></td>
                        </tr>
                        <tr>
                            <td></td><td><a href='forgot.jsp'><img src='forgot.jpg' width='150px'></a></td><td></td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table></form>
        <hr><img src="footer.jpg" width="100%"/>
    </body>
</html>
