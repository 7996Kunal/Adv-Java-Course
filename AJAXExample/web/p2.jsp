<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db8am","root","");
        PreparedStatement stmt;
        String ss=request.getParameter("cty");
        stmt=con.prepareStatement("Select * from indianstates where city like ? and city is not null order by city");
        stmt.setString(1,ss+"%");
        ResultSet rs=stmt.executeQuery();
        String s="";
        while(rs.next())
        {
            s=s+rs.getString(2)+"<br>";            
        }
        out.write(s);
        con.close();
%>