<%
    Class.forName("org.gjt.mm.mysql.Driver");
    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1/emailapp","root","");
    java.sql.PreparedStatement stmt=con.prepareStatement("Select * from attachments where attachid=?");
    stmt.setString(1,request.getParameter("id"));
    java.sql.ResultSet rs=stmt.executeQuery();
    if(rs.next())
    {
        
        String s1=rs.getString("filetype");
        byte[] data=rs.getBytes("filedata");
        java.io.OutputStream rout=response.getOutputStream();
        response.setContentType(s1);
        response.setContentLength(data.length);
        rout.write(data);
        rout.close();
    }
    con.close();
%>