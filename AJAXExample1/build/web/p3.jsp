<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDb","root","");
        PreparedStatement stmt=con.prepareStatement("Select * from customers where accno=?");
        stmt.setString(1,request.getParameter("id"));
        ResultSet rs=stmt.executeQuery();
        String ans="";
        if(rs.next())
        {
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            String s3=rs.getString(3);
            String s4=rs.getString(4);
            String s5=rs.getString(5);
            String s6=rs.getString(6);
            String s7=rs.getString(7);
            ans=s1+"#"+s2+"#"+s3+"#"+s4+"#"+s5+"#"+s6+"#"+s7;
        }
        else
        {
            ans="NO";
        }
        out.write(ans);
        con.close();
%>