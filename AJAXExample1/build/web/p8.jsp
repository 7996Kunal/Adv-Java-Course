<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDb","root","");
        PreparedStatement stmt=con.prepareStatement("Select city from indianstates where states=? order by city");
        stmt.setString(1,request.getParameter("state"));
        ResultSet rs=stmt.executeQuery();
        String ans="";
        while(rs.next())
        {
            ans=ans+rs.getString("city")+"#";
        }        
        out.write(ans);
        con.close();
%>