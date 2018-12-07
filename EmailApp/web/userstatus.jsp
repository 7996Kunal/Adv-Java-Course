<%
    Class.forName("org.gjt.mm.mysql.Driver");
    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1/emailapp","root","");
    java.sql.PreparedStatement stmt=con.prepareStatement("Select * from members where userlogin=?");
    stmt.setString(1,request.getParameter("ulogin"));
    java.sql.ResultSet rs=stmt.executeQuery();
    if(rs.next())
        out.write("Y");
    else
        out.write("N");
    con.close();
%>