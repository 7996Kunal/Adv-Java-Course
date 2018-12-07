<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db8am","root","");
        PreparedStatement stmt;
        String ss=request.getParameter("email");
        stmt=con.prepareStatement("Select * from users where ulogin=?");
        stmt.setString(1,ss);
        ResultSet rs=stmt.executeQuery();
        if(rs.next())
        {
            out.write("Y");
        }
        else
        {
            out.write("N");
        }
        con.close();
%>