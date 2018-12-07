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
                a=document.getElementById("s2");
                for(i=1;i<=6;i++)
                {
                    opt=document.createElement("option");
                    opt.text="Item "+i;
                    //opt.value="Item "+i;
                    a.appendChild(opt);
                }
            }
        </script>
    </head>
    <body>
        <select id='s1'>
            <option>Item 1</option>
            <option>Item 2</option>
            <option>Item 3</option>
            <option>Item 4</option>
        </select><br>
        <select id='s2'></select><br>
        <input type='button' value='Click Here' onClick='f1()'>
        <input type='button' value='Click Here' onClick='f2()'>
        
    </body>
</html>
