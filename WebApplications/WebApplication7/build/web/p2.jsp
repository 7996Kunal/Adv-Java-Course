<%-- 
    Document   : p2
    Created on : Jan 18, 2018, 12:20:01 PM
    Author     : Administrator
--%>

<%@page import="java.sql.*" errorPage="p1.jsp" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Object a=session.getAttribute("ULOGIN");
        Object b=session.getAttribute("CON");
        PreparedStatement stmt;
        ResultSet rs;
        String uname="";
        Connection con=null;
        if(a==null)
        {
            response.sendRedirect("p1.jsp");
        }
        else
        {
            uname=a.toString();
            con=(Connection)b;
        }
        
        
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <%
                stmt=con.prepareStatement("Select * from banktrans where accno=?");
                stmt.setString(1,uname);
                rs=stmt.executeQuery();
        %>
        <table align='center' border='1'>
            <%
                    while(rs.next())
                    {
                        out.write("<tr>");
                        out.write("<td>"+rs.getString(1)+"</td>");
                        out.write("<td>"+rs.getString(2)+"</td>");
                        out.write("<td>Rs. "+rs.getString(3)+"/-</td>");
                        out.write("<td>"+rs.getString(4)+"</td>");
                        out.write("<td>"+rs.getString(5)+"</td>");
                        out.write("<td>"+rs.getString(6)+"</td>");
                        out.write("</tr>");
                    }
                    int totaldebit=0,totalcredit=0;
                    stmt=con.prepareStatement("Select ifnull(sum(amt),0) from banktrans where accno=? and ttype='D'");
                    stmt.setString(1,uname);
                    rs=stmt.executeQuery();
                    if(rs.next()) totaldebit=rs.getInt(1);
                    stmt=con.prepareStatement("Select ifnull(sum(amt),0) from banktrans where accno=? and ttype='C'");
                    stmt.setString(1,uname);
                    rs=stmt.executeQuery();
                    if(rs.next()) totalcredit=rs.getInt(1);
                    out.write("<tr><th colspan='6'>Total Credit: Rs."+totalcredit+" /-</th></tr>");
                    out.write("<tr><th colspan='6'>Total Debit: Rs."+totaldebit+" /-</th></tr>");
                    out.write("<tr><th colspan='6'>Balance Amt: Rs."+(totalcredit-totaldebit)+" /-</th></tr>");
            %>
        </table>
        <jsp:include page="footer.html"/>
    </body>
</html>
