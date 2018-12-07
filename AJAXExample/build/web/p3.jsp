<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/entries","root","");
        PreparedStatement stmt;
        String ss=request.getParameter("cty");
        stmt=con.prepareStatement("Select * from entries where word like ?");
        stmt.setString(1,ss+"%");
        ResultSet rs=stmt.executeQuery();
        //String s="";
        while(rs.next())
        {
            String s1=rs.getString(1);
            String s2=rs.getString(3);
            String s="<b>"+s1+": </b>"+s2+"<br>";
            out.write(s);
            out.flush();
        }
        //out.write(s);
        con.close();
%>