<%-- 
    Document   : s4
    Created on : Jan 17, 2018, 8:54:53 AM
    Author     : Administrator
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDB","root","");
        PreparedStatement stmt;
        ResultSet rs;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <%
                    stmt=con.prepareStatement("Select * from Customers");
                    rs=stmt.executeQuery();
                    while(rs.next())
                    {
                        out.write("<tr>");
                        out.write("<td>"+rs.getString(1)+"</td>");
                        out.write("<td>"+rs.getString(2)+"</td>");
                        out.write("<td>"+rs.getString(3)+"</td>");
                        out.write("<td>"+rs.getString(4)+"</td>");
                        out.write("<td>"+rs.getString(5)+"</td>");
                        out.write("<td>"+rs.getString(6)+"</td>");
                        out.write("<td>"+rs.getString(7)+"</td>");
                        out.write("<td>"+rs.getString(8)+"</td>");
                        out.write("</tr>");
                    }
            %>
        </table>
        <hr>
        <%
                    String id=session.getId();
                    out.write(id);
        %>
    </body>
</html>
