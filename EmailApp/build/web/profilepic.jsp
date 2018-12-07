<%
    Class.forName("org.gjt.mm.mysql.Driver");
    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1/emailapp","root","");
    java.sql.PreparedStatement stmt=con.prepareStatement("Select * from members where userlogin=? and profilepic is not null");
    stmt.setObject(1,session.getAttribute("ulogin"));
    java.sql.ResultSet rs=stmt.executeQuery();
    if(rs.next())
    {
        byte[] data=rs.getBytes("profilepic");
        response.setContentType("image/jpeg");
        response.setContentLength(data.length);
        java.io.OutputStream iout=response.getOutputStream();
        iout.write(data);
        iout.close();
    }
    else
    {
        String s=request.getRealPath("");
        java.io.FileInputStream fin=new java.io.FileInputStream(s+"\\images\\Parties.jpg");
        int size=fin.available();
        byte[] data=new byte[size];
        fin.read(data);
        response.setContentType("image/jpeg");
        response.setContentLength(data.length);
        java.io.OutputStream iout=response.getOutputStream();
        iout.write(data);
        iout.close();
    }
    con.close();
%>