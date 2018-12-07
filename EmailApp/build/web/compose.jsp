<%-- 
    Document   : index
    Created on : Jun 30, 2018, 9:24:54 AM
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
        <script>
            function f1()
            {
                alert("Enter Gmail Password!!!!");
                
                document.getElementById("t6").disabled=false;
                document.getElementById("t6").focus();
                document.getElementById("bb1").disabled=false;
                
            }
        </script>
    </head>
    <body>        
        <img src="images/mailbanner.jpg" width="100%"><hr>
        <table width="100%"><tr><td><img src="profilepic.jsp" width="50px" onerror=""></td><td>Welcome <c:out value="${uname}" /></td> <td>Last Login:<c:out value="${lastlogin}" /></td><td><a href="logout.jsp">Logout</a></td></tr></table>
        <div id="d1" style="width:150px;background-color: antiquewhite; float: left">
            
            <a href="compose.jsp">Compose</a><hr>
            <a href="inbox.jsp">Inbox</a><hr>
            <a href="dratfs.jsp">Drafts</a><hr>
            <a href="sent.jsp">Sent</a><hr>
            <a href="trash.jsp">Trash</a><hr>
            <a href="settings.jsp">Settings</a><hr>
            <a href="password.jsp">Change Password</a><hr>            
        </div>
        <div id="d2" style="width:800px;background-color: aliceblue;float: right">
            <form method="post" action="mailattach.jsp">
            <table>
                <tr>
                    <td>To:</td><td><input type="text" name="t1" style="width:400px"></td><td></td>
                </tr>
                <tr>
                    <td>Cc:</td><td><input type="text" name="t2" style="width:400px"></td><td></td>
                </tr>
                <tr>
                    <td>Bcc:</td><td><input type="text" name="t3" style="width:400px"></td><td></td>
                </tr>
                <tr>
                    <td>Subject:</td><td><input type="text" name="t4" style="width:400px"></td><td></td>
                </tr>
                <tr>
                    <td>Message:</td><td><textarea name="t5" style="width:400px; height: 250px"></textarea></td><td></td>
                </tr>
                 <tr>
                     <td></td><td><input type="password" name="t6" id="t6" style="width:400px;" id="t6" disabled></td><td></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" name="b1" value="Send Mail"><input type="button" value="By Gmail" onclick="f1()"> <input type="submit" name="b1" id="bb1" value="Send Mail by Gmail" disabled></td><td></td>
                </tr>
                <tr>
                    <td></td><td></td><td></td>
                </tr>
            </table></form>
        </div>
    
        
       
</body>
</html>
