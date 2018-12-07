<%-- 
    Document   : p1
    Created on : Jan 18, 2018, 12:08:30 PM
    Author     : Administrator
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        String msg="";        
        if(request.getParameter("b1")!=null)
        {
            String s1=request.getParameter("t1");
            String s2=request.getParameter("t2");
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDb","root","");
            PreparedStatement stmt=con.prepareStatement("Select * from users where ulogin=? and upass=?");
            stmt.setString(1,s1);
            stmt.setString(2,s2);
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
            {
                if(request.getParameter("c1")!=null)
                {
                    Cookie c=new Cookie("UN",s1);
                    c.setMaxAge(7*24*60*60);
                    response.addCookie(c);
                }
                session.setAttribute("ULOGIN",s1);
                session.setAttribute("CON",con);
                response.sendRedirect("p2.jsp");
            }
            else
            {
                msg="Invalid ID/Password!!!";
                con.close();
            }
        }
        Cookie[] ck=request.getCookies();
        String v="";
        if(ck!=null)
        {
            for(int i=0;i<ck.length;i++)
            {
                String nm=ck[i].getName();
                if(nm.equals("UN"))
                {
                    v=ck[i].getValue();
                }
            }
        }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <form method="post">
            <table align='center'>
                <tr>
                    <td>Login:</td><td><input type='text' name='t1' value='<%=v%>'></td><td></td>
                </tr>
                <tr>
                    <td>Password:</td><td><input type='password' name='t2'></td><td></td>
                </tr>
                <tr>
                    <td></td><td><input type='checkbox' name='c1'> Remember Me</td><td></td>
                </tr>
                <tr>
                    <td></td><td><input type='submit' name='b1' value='Login'></td><td></td>
                </tr>
                <tr>
                    <td></td><td><font color='red'><%=msg%></font></td><td></td>
                </tr>
            </table>
        </form>
                    <jsp:include page="footer.html"/>
    </body>
</html>
