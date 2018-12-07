<%-- 
    Document   : p7
    Created on : Jan 20, 2018, 1:19:43 PM
    Author     : Administrator
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDb","root","");
        PreparedStatement stmt;
        ResultSet rs;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            var xmlhttp;
            function getCities()
            {
                s=document.getElementById("s1").value;
                xmlhttp=new XMLHttpRequest();
                xmlhttp.onreadystatechange=showCities;
                xmlhttp.open("GET","p8.jsp?state="+s,true);
                xmlhttp.send(null);
            }
            function showCities()
            {
                if(xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    ans=xmlhttp.responseText.trim();
                    ss=document.getElementById("s2");
                    ss.length=0;
                    arr=ans.split("#");
                    for(i=0;i<arr.length;i++)
                    {
                        opt=document.createElement("option");
                        opt.text=arr[i];
                        opt.value=arr[i];
                        ss.appendChild(opt);
                    }
                }
            }
        </script>
    </head>
    <body>
        <%
            stmt=con.prepareStatement("Select distinct states from indianstates order by states");
            rs=stmt.executeQuery();
        %>
        <select id="s1" onchange="getCities()">
            <%
                while(rs.next())
                {
                    out.write("<option>"+rs.getString(1)+"</option>");
                }
            %>
        </select><br><br>
        <select id="s2"></select>
    </body>
</html>
