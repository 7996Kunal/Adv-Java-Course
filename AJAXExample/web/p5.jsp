<%-- 
    Document   : p5
    Created on : Jun 29, 2018, 9:28:10 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            var xmlhttp;
            function getCities()
            {
                st=document.getElementById("s1").value;
                xmlhttp=new XMLHttpRequest();
                xmlhttp.onreadystatechange=showCities;
                xmlhttp.open("GET","p6.jsp?state="+st,true);
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
            function getEmailStatus()
            {
                st=document.getElementById("t1").value;
                xmlhttp=new XMLHttpRequest();
                xmlhttp.onreadystatechange=showEmailStatus;
                xmlhttp.open("GET","p7.jsp?email="+st,true);
                xmlhttp.send(null);
            }
            function showEmailStatus()
            {
                 if(xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    ans=xmlhttp.responseText.trim();
                    if(ans=="Y")
                    {
                        document.getElementById("d1").innerHTML="*";
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
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/db8am" user="root" password="" var="con" />
        <table>
            <tr>
                <td>Email:</td><td><input type="text" id="t1" name="t1" onblur="getEmailStatus()"></td><td><div id="d1"></div></td>
            </tr>
            <tr>
                <td>Password:</td><td><input type="text" id="t2" name="t2"></td><td></div></td>
            </tr>
            <tr>
                <td>State:</td>
        <s:query dataSource="${con}" var="rs">
            Select distinct states from indianstates order by states
        </s:query>
            <td>
            <select id="s1" onChange="getCities()">
                <c:forEach var="row" items="${rs.rows}">
                    <option><c:out value="${row.states}" /></option>
                </c:forEach>
            </select></td><td></td></tr>
            <tr>
                <td>
                    Cities:
                </td>
                <td>
                    <select id="s2"></select>
                </td>
                <td></td>
            </tr>
        </table>
    </body>
</html>
