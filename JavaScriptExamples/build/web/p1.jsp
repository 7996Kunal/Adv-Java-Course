<%-- 
    Document   : p1
    Created on : Jan 19, 2018, 12:25:28 PM
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
                //window.alert("Hello");
                //x=window.confirm("Are you sure?");
                //s=window.prompt("Enter your name");
                //window.open("index.html");
                //window.open("index.html","_self");
                  window.open("index.html","","height=400,width=300,left=300,top=50");
            }
        </script>
    </head>
    <body>
        <input type="button" value="Click Here" onclick="f1()">
    </body>
</html>
