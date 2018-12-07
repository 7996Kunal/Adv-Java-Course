<%-- 
    Document   : p8
    Created on : Jan 19, 2018, 1:38:08 PM
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
                a=document.getElementById("s1");
                a.length=0;
            }
            function f2()
            {
                a=document.getElementById("d1");
                for(i=1;i<=6;i++)
                {
                    opt=document.createElement("input");
                    opt.type="text";
                    opt.value="Item "+i;
                    a.appendChild(opt);
                }
            }
        </script>
    </head>
    <body>
        <div id='d1' width="100" height="50"></div>
        <input type='button' value='Click Here' onClick='f1()'>
        <input type='button' value='Click Here' onClick='f2()'>
        
    </body>
</html>
