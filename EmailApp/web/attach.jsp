<%@page import="java.io.*,java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("org.gjt.mm.mysql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/emailapp","root","");
    PreparedStatement stmt;
    ResultSet rs;
    int size=request.getContentLength();            
    byte[] data=new byte[size];
    InputStream inr=request.getInputStream();
    int read=0;
    int remaining=size;
    while(remaining>0)
    {
        int x=inr.read(data,read,remaining);
        read=read+x;
        remaining=remaining-x;
    }
    String str=new String(data);
    int p1=str.indexOf("\r\n");
    String bndry=str.substring(0,p1);
    
    p1=str.indexOf("name=\"t0\"")+13;
    int p2=str.indexOf(bndry,p1)-2;
    String mailid=str.substring(p1,p2);
    
    //Extraction of File1  Details
    p1=str.indexOf("name=\"t1\"");
    p1=str.indexOf("filename=",p1)+10;
    p2=str.indexOf("\"",p1);
    String filename1=str.substring(p1,p2);

    p1=str.indexOf("Content-Type:",p1)+14;
    p2=str.indexOf("\r\n\r\n",p1);
    String filetype1=str.substring(p1,p2);
    
    int filestart1=p2+4;
    int fileend1=str.indexOf(bndry,filestart1)-3;
    int filesize1=fileend1-filestart1+1;
    byte[] filedata1=new byte[filesize1];
    System.arraycopy(data, filestart1,filedata1,0,filesize1);    
    
    stmt=con.prepareStatement("select count(*)+1 from attachments");
    rs=stmt.executeQuery();
    int atid=0;
    if(rs.next()) atid=rs.getInt(1);
    
    stmt=con.prepareStatement("Insert into attachments values(?,?,?,?,?)");
    stmt.setInt(1,atid);
    stmt.setString(2,mailid);
    stmt.setString(3,filename1);
    stmt.setString(4,filetype1);
    stmt.setBytes(5,filedata1);    
    stmt.executeUpdate();
    
    //------------------------------------
    try{
    p1=str.indexOf("name=\"t2\"");
    p1=str.indexOf("filename=",p1)+10;
    p2=str.indexOf("\"",p1);
    String filename2=str.substring(p1,p2);

    p1=str.indexOf("Content-Type:",p1)+14;
    p2=str.indexOf("\r\n\r\n",p1);
    String filetype2=str.substring(p1,p2);
    
    int filestart2=p2+4;
    int fileend2=str.indexOf(bndry,filestart2)-3;
    int filesize2=fileend2-filestart2+1;
    byte[] filedata2=new byte[filesize2];
    System.arraycopy(data, filestart2,filedata2,0,filesize2);    
    if(filesize2>0)
    {
    stmt=con.prepareStatement("select count(*)+1 from attachments");
    rs=stmt.executeQuery();
    if(rs.next()) atid=rs.getInt(1);    
    stmt=con.prepareStatement("Insert into attachments values(?,?,?,?,?)");
    stmt.setInt(1,atid);
    stmt.setString(2,mailid);
    stmt.setString(3,filename2);
    stmt.setString(4,filetype2);
    stmt.setBytes(5,filedata2);    
    stmt.executeUpdate();
    }
    }catch(Exception ee){}
    //--------------------------------------------------------
     try{
    p1=str.indexOf("name=\"t3\"");
    p1=str.indexOf("filename=",p1)+10;
    p2=str.indexOf("\"",p1);
    String filename3=str.substring(p1,p2);

    p1=str.indexOf("Content-Type:",p1)+14;
    p2=str.indexOf("\r\n\r\n",p1);
    String filetype3=str.substring(p1,p2);
    
    int filestart3=p2+4;
    int fileend3=str.indexOf(bndry,filestart3)-3;
    int filesize3=fileend3-filestart3+1;
    byte[] filedata3=new byte[filesize3];
    System.arraycopy(data, filestart3,filedata3,0,filesize3);    
    if(filesize3>0)
    {
    stmt=con.prepareStatement("select count(*)+1 from attachments");
    rs=stmt.executeQuery();
    if(rs.next()) atid=rs.getInt(1);    
    stmt=con.prepareStatement("Insert into attachments values(?,?,?,?,?)");
    stmt.setInt(1,atid);
    stmt.setString(2,mailid);
    stmt.setString(3,filename3);
    stmt.setString(4,filetype3);
    stmt.setBytes(5,filedata3);    
    stmt.executeUpdate();
    }
    }catch(Exception ee){}
    con.close();
    response.sendRedirect("members.jsp");
%>
