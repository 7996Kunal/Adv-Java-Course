<%-- 
    Document   : newjspp1
    Created on : Jul 7, 2018, 9:15:22 AM
    Author     : Administrator
--%>

<%@page import="java.rmi.*,java.rmi.registry.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                String s1="",s2="",s3="",s4="",s5="",s6="";
                if(request.getParameter("b1")!=null)
                {
                    String s=request.getParameter("t1");
                    Registry r=LocateRegistry.getRegistry("127.0.0.1",1099);
                    p1.EmpInterface emp=(p1.EmpInterface)r.lookup("EMP");
                    p1.Employees ee=emp.search(s);
                    if(ee!=null)
                    {
                        s1=ee.getEid();
                        s2=ee.getName();
                        s3=ee.getSalary();
                        s4=ee.getMobile();
                        s5=ee.getDoa();
                        s6=ee.getDesignation();
                    }
                }
        %>
        <form method="post">
            <input type="text" name="t1" value="<%=s1%>"><br>
            <input type="text" name="t2" value="<%=s2%>"><br>
            <input type="text" name="t3" value="<%=s3%>"><br>
            <input type="text" name="t4" value="<%=s4%>"><br>
            <input type="text" name="t5" value="<%=s5%>"><br>
            <input type="text" name="t6" value="<%=s6%>"><br>
            <input type="submit" name="b1" value="Search">
        </form>
    </body>
</html>
