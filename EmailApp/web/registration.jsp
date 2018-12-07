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
            var xmlhttp;
            function checkUser()
            {
                s=document.getElementById("t1").value;
                xmlhttp=new XMLHttpRequest();
                xmlhttp.onreadystatechange=showUserStatus;
                xmlhttp.open("GET","userstatus.jsp?ulogin="+s,true);
                xmlhttp.send(null);
            }
            function showUserStatus()
            {
                if(xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    reply=xmlhttp.responseText.trim();
                    if(reply=="Y")
                    {
                        document.getElementById("d1").innerHTML="This id Already Exists!!!";
                    }
                    else
                    {
                        document.getElementById("d1").innerHTML="";
                    }
                }
            }
            function verifyData()
            {
                tt1=document.getElementById("t1");
                tt2=document.getElementById("t2");
                tt3=document.getElementById("t3");
                tt4=document.getElementById("t4");
                tt5=document.getElementById("t5");
                tt6=document.getElementById("t6");
                tt7=document.getElementById("t7");
                tt8=document.getElementById("t8");
                tt9=document.getElementById("t9");
                tt10=document.getElementById("t10");
                tt11=document.getElementById("t11");
                if(tt1.value=="")
                {
                    alert("User name is Compulsory!!");
                    tt1.focus();
                    return false;
                }
                if(tt11.value!=tt10.value)
                {
                    alert("Invalid Captch Text!!!");
                    tt10.focus();
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>
        <img src="images/mailbanner.jpg" width="100%"><hr>
        <form method="post" action="register.jsp">
        <table align="center">
            <tr>
                <th colspan="3">Member Registration</th>
            </tr>
            <tr>
                <td>User Name:</td><td><input type="text" name="t1" id="t1" onBlur="checkUser()"></td><td style="width:150px"><div id="d1"></div></td>
            </tr>
            <tr>
                <td>Password:</td><td><input type="password" name="t2" id="t2"></td><td></td>
            </tr>
            <tr>
                <td>Re-Type Password:</td><td><input type="password" name="t3" id="t3"></td><td></td>
            </tr>
            <tr>
                <td>Alternate Email:</td><td><input type="email" name="t4" id="t4"></td><td></td>
            </tr>
            <tr>
                <td>Name:</td><td><input type="text" name="t5" id="t5" placeholder="Enter Name"></td><td></td>
            </tr>
            <tr>
                <td>Mobile:</td><td><input type="text" name="t6" id="t6" placeholder="Enter Mobile"></td><td></td>
            </tr>
            <tr>
                <td>Date of Birth:</td><td><input type="date" name="t7" id="t7"></td><td></td>
            </tr>
            <tr>
                <td>Security Question:</td><td><select name="t8" id="t8"><option>Pet Name?</option><option>Favorite Destination?</option><option>1st Movie?</option></select></td><td></td>
            </tr>
            <tr>
                <td>Answer:</td><td><input type="text" name="t9" id="t9"></td><td></td>
            </tr>
            <tr>
                <td>Captcha Text:</td><td><input type="text" id="t10" name="t10"></td><td></td>
            </tr>
             <tr>
                 <td></td><td><input type="hidden" id="t11" name="t11" value="<c:out value="${pageContext.session.id.substring(5,13)}" />"></td><td></td>
            </tr>
            <tr>
                <td></td><td><img src="captcha.jsp"></td><td></td>
            </tr>
              <tr>
                <td></td><td><input type="submit" value="Register" name="b1" id="b1" onClick="return verifyData()"></td><td></td>
            </tr>
        </table></form>
        <hr>
    <center>All Rights Reserved</center>
    <center><address>Copyright 2018</address></center>
    </body>
</html>
