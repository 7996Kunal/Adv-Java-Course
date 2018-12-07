<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    String tbl=request.getParameter("tbl");
    String id=request.getParameter("id");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/SocialApp","root","");
    if(tbl.equals("msg"))
    {
        PreparedStatement stmt=con.prepareStatement("Select Photo from Messages where mid=? and photo is not null");
        stmt.setString(1,id);
        ResultSet rs=stmt.executeQuery();
        if(rs.next())
        {
            byte[] b=rs.getBytes(1);
            response.setContentType("image/jpeg");
            response.setContentLength(b.length);
            response.getOutputStream().write(b);
            response.getOutputStream().close();
        }
    }
    else
    {
        PreparedStatement stmt=con.prepareStatement("Select Photo from Members where email=? and photo is not null");
        stmt.setString(1,id);
        ResultSet rs=stmt.executeQuery();
        if(rs.next())
        {
            byte[] b=rs.getBytes(1);
            response.setContentType("image/jpeg");
            response.setContentLength(b.length);
            response.getOutputStream().write(b);
            response.getOutputStream().close();
        }
    }
    con.close();
%>