<%-- 
    Document   : p4
    Created on : Jun 23, 2018, 9:23:45 AM
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
        <form method="post">
            <input type="text" name="t1"><br>
            <input type="text" name="t2"><br>
            <input type="text" name="t3"><br>
            <input type="text" name="t4"><br>
            <input type="submit" value="Submit" name="b1"><br>
            <%
                    out.write(request.getParameter("t1")+"<br>");
                    out.write(request.getParameter("t2")+"<br>");
                    out.write(request.getParameter("t3")+"<br>");
                    out.write(request.getParameter("t4")+"<br>");
                    out.write(request.getParameter("b1")+"<br>");
            %>
        </form>
    </body>
</html>
