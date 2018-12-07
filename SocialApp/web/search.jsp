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
        <script>
            var xmlhttp;
            function getDetails()
            {
                a1=document.getElementById("r1");
                a2=document.getElementById("r2");
                a3=document.getElementById("r3");
                a4=document.getElementById("r4");
                a5=document.getElementById("r5");
                fld="name";
                if(a2.checked) fld="city";
                if(a3.checked) fld="email";
                if(a4.checked) fld="hobbies";
                if(a5.checked) fld="college";
                txt=document.getElementById("t1").value;
                xmlhttp=new XMLHttpRequest();
                xmlhttp.onreadystatechange=showDetails;
                xmlhttp.open("GET","datasearch.jsp?fld="+fld+"&txt="+txt,true);
                xmlhttp.send(null);
            }
            function showDetails()
            {
                if(xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    document.getElementById("d1").innerHTML=xmlhttp.responseText.trim();
                }
            }
        </script>
    </head>
    <body>
        <c:if test="${name eq nil}">
            <c:redirect url="index.jsp" />
        </c:if>
        <jsp:include page="header.jsp"/>
        <input type="radio" value="name" name="r1" id="r1" checked>Name <input type="radio" id="r2"  value="city" name="r1">City <input type="radio"  id="r3" value="email" name="r1">Email <input type="radio" value="hobbies"  id="r4"  name="r1">Hobbies  <input type="radio" value="college"  id="r5"  name="r1">College <input type="text" id="t1" name="t1" size="40" onKeyUp="getDetails()">
        <hr>
        <div id="d1">
            
        </div>
        <hr>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
