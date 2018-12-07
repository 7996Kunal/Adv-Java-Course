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
                a1=document.getElementById("t1");
                //a1.size=40;
                //a1.type="password";
                a1.type="date";
            }
            function f2()
            {
                a1=document.getElementById("img1");
                a1.height=100;
                a1.width=300;
                a1.src="st2.jpg";
            }
            function f3()
            {
                a1=document.getElementById("t2");
                a2=document.getElementById("t3");
                s=a1.value;
                a2.value=s;
            }
        </script>
    </head>
    <body>
        <input type="text" name="t1" id="t1"><br>
        <input type="button" value="ABCD" name="b1" id="b1"><br>
        <img src='st1.jpg' id="img1"><br>
        <hr>
        <input type="button" value="Click Here" onClick="f1()" /><br>
        <input type="button" value="Click Here" onClick="f2()" /><br>
        
        <input type="text" name="t2" id="t2" onKeyUp="f3()"><br>
        <input type="text" name="t3" id="t3"><br>
        <input type="button" value="Click Here" onClick="f3()" /><br>
    </body>
</html>
