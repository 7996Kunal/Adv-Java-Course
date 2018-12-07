<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    String uid=request.getParameter("uid");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/SocialApp","root","");
    PreparedStatement stmt=con.prepareStatement("Select * from members where email=?");
    stmt.setString(1,uid);
    ResultSet rs=stmt.executeQuery();
    String ans="N";
    if(rs.next())
    {
        ans="Y";
    }
    out.write(ans);
    con.close();    
%>