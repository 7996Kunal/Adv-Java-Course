<%-- 
    Document   : s3
    Created on : Jan 17, 2018, 8:45:59 AM
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
                int ans=0;
                if(request.getParameter("b1")!=null)
                {
                    String s1=request.getParameter("t1");
                    String s2=request.getParameter("t2");
                    int x=Integer.parseInt(s1);
                    int y=Integer.parseInt(s2);
                    ans=x+y;
                }
        %>
        <form method="post">
            <table align="center">
                <tr>
                    <td>First Number:</td><td><input type='text' name="t1"></td>
                </tr>
                <tr>
                    <td>Second Number:</td><td><input type='text' name="t2"></td>
                </tr>
                <tr>
                    <td>Result:</td><td><%=ans%></td>
                </tr>
                <tr>
                    <td></td><td><input type='submit' name="b1" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

