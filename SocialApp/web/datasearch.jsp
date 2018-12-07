<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    String fld=request.getParameter("fld");
    String txt=request.getParameter("txt");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/SocialApp","root","");
    PreparedStatement stmt=con.prepareStatement("Select * from Members where "+fld+" like ?");
    stmt.setString(1,"%"+txt+"%");
    ResultSet rs=stmt.executeQuery();
    String ans="<table>";
    while(rs.next())
    {
        String s1=rs.getString(1);
        String s2=rs.getString("name");
        String s3=rs.getString("city");
        String s4=rs.getString("hobbies");
        String s5=rs.getString("college");
        ans=ans+"<tr>";
        ans=ans+"<td>"+s1+"</td>";
        ans=ans+"<td>"+s2+"</td>";
        ans=ans+"<td>"+s3+"</td>";
        ans=ans+"<td>"+s4+"</td>";
        ans=ans+"<td>"+s5+"</td>";
        ans=ans+"<td><a href='#' onClick=\"javascript:window.open('showprofile.jsp?email="+s1+"','','width=300,left=300,height=400')\">Show Profile</a></td>";
        ans=ans+"<td><a href='#' onClick=\"javascript:window.open('sendrequest.jsp?email="+s1+"','','width=400,left=300,height=300')\">Send Request</a></td>";
        ans=ans+"</tr>";
    }
    ans=ans+"</table>";
    out.write(ans);
    con.close();
%>