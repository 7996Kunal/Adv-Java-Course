<%-- 
    Document   : p5
    Created on : Jun 23, 2018, 9:28:56 AM
    Author     : Administrator
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbshop","root","");
        PreparedStatement stmt;
        ResultSet rs;
        String ss="FGFGFFGFG";
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                stmt=con.prepareStatement("Select * from products");
                rs=stmt.executeQuery();
        %>
        <table align="center">
            <%
                    while(rs.next())
                    {
                        String s1=rs.getString(1);
                        String s2=rs.getString(2);
                        String s3=rs.getString(3);
                        String s4=rs.getString(4);
                        String s5=rs.getString(5);
                        out.write("<tr>");
                        out.write("<td>"+s1+"</td>");
                        out.write("<td>"+s2+"</td>");
                        out.write("<td>"+s3+"</td>");
                        out.write("<td>"+s4+"</td>");
                        out.write("<td>"+s5+"</td>");
                        out.write("</tr>");
                    }
            %>
        </table><hr>
        <%=ss%>
        <hr>
        <%
            out.write(65);
        %>
    </body>
</html>
