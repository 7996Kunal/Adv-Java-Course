<%-- 
    Document   : p6
    Created on : Jan 19, 2018, 12:58:47 PM
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
                a2=document.getElementById("t2");
                a3=document.getElementById("t3");
                s1=a1.value;
                s2=a2.value;
                //x=(s1*1)+(s2*1);
                x=parseInt(s1)+parseInt(s2);
                a3.value=x;
            }
             function f2()
            {
                a1=document.getElementById("t1");
                a3=document.getElementById("t3");
                s1=a1.value;
                x=Math.sqrt(s1);
                a3.value=x;
                
                //document.getElementById("t3").value=Math.sqrt(document.getElementById("t1").value);
            }
        </script>
    </head>
    <body>
        <input type="text" id="t1"><br>
        <input type="text" id="t2"><br>
        <input type="text" id="t3"><br>
        <input type="button" id="b1" value="Click Here" onclick="f1()"><br>
        <input type="button" id="b1" value="Click Here" onclick="f2()"><br>
    </body>
</html>
