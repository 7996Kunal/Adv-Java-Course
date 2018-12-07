<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db8am","root","");
        PreparedStatement stmt;
        String id=request.getParameter("eid");
        stmt=con.prepareStatement("Select * from employees where eid=?");
        stmt.setString(1,id);
        ResultSet rs=stmt.executeQuery();
        String s="NO DATA";
        if(rs.next())
        {
            s=rs.getString(2);
            s=s+"#"+rs.getString(3);
            s=s+"#"+rs.getString(4);
            s=s+"#"+rs.getString(5);
            s=s+"#"+rs.getString(6);            
        }
        out.write(s);
        con.close();
%>