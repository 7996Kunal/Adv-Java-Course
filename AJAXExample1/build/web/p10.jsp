<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        for(int i=1;i<=2000000000;i++);
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDb","root","");
        PreparedStatement stmt=con.prepareStatement("Select * from users where ulogin=?");
        stmt.setString(1,request.getParameter("id"));
        ResultSet rs=stmt.executeQuery();
        String ans="N";
        if(rs.next())
        {
            ans="Y";
        }        
        out.write(ans);
        con.close();
%>