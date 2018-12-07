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
                
                document.frm1.submit();
            }
            var xmlhttp;
            function getCities()
            {
                xmlhttp=new XMLHttpRequest();
                state=document.getElementById("s1").value;
                xmlhttp.onreadystatechange=showCities;
                xmlhttp.open("GET","getCities.jsp?state="+state,true);
                xmlhttp.send(null);
            }
            function showCities()
            {
                if(xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    ans=xmlhttp.responseText.trim();
                    arr=ans.split("#");
                    aa=document.getElementById("s2");
                    aa.length=0;
                    for(i=0;i<arr.length;i++)
                    {
                        opt=document.createElement("option");
                        opt.text=arr[i];
                        opt.value=arr[i];
                        aa.appendChild(opt);
                    }
                }
            }
            var xmlhttp1;
            function checkUser()
            {
                xmlhttp1=new XMLHttpRequest();
                uid=document.getElementById("t1").value;
                xmlhttp1.onreadystatechange=showStatus;
                xmlhttp1.open("GET","getStatus.jsp?uid="+uid,true);
                xmlhttp1.send(null);                                
            }
            function showStatus()
            {
                if(xmlhttp1.readyState==4 && xmlhttp1.status==200)
                {
                    ans=xmlhttp1.responseText.trim();
                    if(ans=="Y")
                    {
                        document.getElementById("d1").innerHTML="<font color=red>Email Aready Exists!!!</font>";
                        document.getElementById("t1").focus();
                    }
                    else
                    {
                        document.getElementById("d1").innerHTML="";
                    }
                }
            }
        </script>
    </head>
    <body>
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/SocialApp" user="root" password="" var="con"/>
        <c:if test="${param.t1 ne nil}">
            <s:update dataSource="${con}" var="x">
                Insert into Members(`EMAIL`, `UPASS`, `NAME`, `STATE`, `CITY`, `DOB`, `GENDER`, `SCHOOL`, `COLLEGE`, `HOBBIES`, `ABOUTME`) values(?,?,?,?,?,?,?,?,?,?,?)
                <s:param value="${param.t1}"/>
                <s:param value="${param.t2}"/>
                <s:param value="${param.t4}"/>
                <s:param value="${param.s1}"/>
                <s:param value="${param.s2}"/>
                <s:param value="${param.t5}"/>
                <s:param value="${param.r1}"/>
                <s:param value="${param.t7}"/>
                <s:param value="${param.t8}"/>
                <s:param value="${param.t9}"/>
                <s:param value="${param.t10}"/>                
            </s:update>
                <c:if test="${x eq 1}">
                    <c:redirect url="index.jsp" />
                </c:if>
        </c:if>
        <img src="banner.jpg" width="100%"/><hr>
        <form name='frm1' method="post">
        <table align='center'>
            <tr>
                <th colspan='3'>Member Registration</th>
            </tr>
            <tr>
                <td>Email:</td><td><input type='text' name='t1' id="t1" onBlur="checkUser()"></td><td style="width:200px"><div id="d1"></div></td>
            </tr>
            <tr>
                <td>Password:</td><td><input type='password' name='t2'></td><td></td>
            </tr>
            <tr>
                <td>Re-Password:</td><td><input type='password' name='t3'></td><td></td>
            </tr>
            <tr>
                <td>Name:</td><td><input type='text' name='t4'></td><td></td>
            </tr>
            <tr>
                <td>State:</td><td>
                    <s:query dataSource="${con}" var="rs">
                        Select distinct states from Indianstates
                    </s:query>
                    <select name='s1' id='s1' onChange="getCities()">
                        <c:forEach items="${rs.rows}" var="row">
                            <option><c:out value="${row.states}" /></option>
                        </c:forEach>
                    </select>
                </td><td></td>
            </tr>
            <tr>
                <td>City:</td><td><select name='s2' id='s2'></select></td><td></td>
            </tr>
            <tr>
                <td>Date of Birth:</td><td><input type='date' name='t5'></td><td></td>
            </tr>
            <tr>
                <td>Gender:</td><td><input type='radio' value="M" name="r1">Male <input type='radio' value="F" name="r1">Female</td><td></td>
            </tr>
            <tr>
                <td>School:</td><td><input type='text' name='t7'></td><td></td>
            </tr>
            <tr>
                <td>College:</td><td><input type='text' name='t8'></td><td></td>
            </tr>
            <tr>
                <td>Hobbies:</td><td><input type='text' name='t9'></td><td></td>
            </tr>
            <tr>
                <td>About You:</td><td><input type='text' name='t10'></td><td></td>
            </tr>
            <tr>
                <td></td><td><a href='#' onClick='submitform()'><img src='register.png' width='150px'></a></td><td></td>
            </tr>
        </table></form>
        <hr><img src="footer.jpg" width="100%"/>
    </body>
</html>
