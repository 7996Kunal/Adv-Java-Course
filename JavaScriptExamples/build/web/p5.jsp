<%-- 
    Document   : p3
    Created on : Jan 19, 2018, 12:44:16 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function f1()
            {
                a1=document.getElementById("img1");
                a1.src="b12.jpg";
            }
            function f2()
            {
                a1=document.getElementById("img1");
                a1.src="b10.jpg";
            }
            function f3()
            {
                a1=document.getElementById("img1");
                a1.src="b13.jpg";
            }
            function f4()
            {
                a1=document.getElementById("img1");
                a1.src="b12.jpg";
            }
        </script>
    </head>
    <body>
        <img src='b10.jpg' id="img1" onmouseover="f1()" onmouseout="f2()" onmousedown="f3()" onmouseup="f4()"><br>
        
    </body>
</html>
