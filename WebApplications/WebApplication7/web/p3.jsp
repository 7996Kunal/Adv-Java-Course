<%-- 
    Document   : p3
    Created on : Jan 18, 2018, 12:52:10 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Cookie[] ck=request.getCookies();
        if(ck!=null)
        {
            for(int i=0;i<ck.length;i++)
            {
                String nm=ck[i].getName();
                String v=ck[i].getValue();
                out.write(nm+":"+v+"<br>");
            }
        }
        %>
    </body>
</html>
