<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    String state=request.getParameter("state");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/SocialApp","root","");
    PreparedStatement stmt=con.prepareStatement("Select city from indianstates where states=? order by city");
    stmt.setString(1,state);
    ResultSet rs=stmt.executeQuery();
    String ans="";
    while(rs.next())
    {
        ans=ans+rs.getString(1)+"#";
    }
    out.write(ans);
    con.close();
%>