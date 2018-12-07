<%-- 
    Document   : p7
    Created on : Jan 19, 2018, 1:07:49 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function f1()
            {
                a1=document.getElementById("t1");
                a2=document.getElementById("t2");
                a3=document.getElementById("t3");
                a4=document.getElementById("t4");
                a5=document.getElementById("t5");
                a6=document.getElementById("t6");
                if(a1.value=="")
                {
                    alert("Enter your name!!!!");
                    a1.focus();
                    return false;
                }
                if(a2.value.length<8 || a2.value!=a3.value)
                {
                    alert("Both password must be same.\nMinimum 8 characters");
                    a2.focus();
                    return false;
                }
                if(parseInt(a4.value)<18)
                {
                    alert("Age should be greater than 18");
                    a4.focus();
                    return false;
                }
                mb=a5.value;
                if(mb.length!=10)
                {
                    alert("Invalid Mobile Number");
                    a5.focus();
                    return false;
                }
                else
                {
                    for(i=0;i<10;i++)
                    {
                        c=mb.substring(i,i+1);
                        if(c<'0' || c>'9')
                        {
                            alert("Invalid Digits in Mobile Number");
                            a5.focus;
                            return false;
                        }
                    }
                }
                email=a6.value;
                ln=email.length;
                at=email.indexOf("@");
                dot=email.lastIndexOf(".");
                if(ln<10 || at<4 || dot<7 || dot-at<3 || ln-dot<3)
                {
                    alert("Invalid Email!!!!!");
                    a6.focus();
                    return false;
                }
                return true;
            }
            function f2()
            {
                x1=document.getElementById("c1");
                //alert(x1.value);
                //alert(x1.checked);
                if(x1.checked)
                    document.getElementById("b1").disabled=false;
                else
                    document.getElementById("b1").disabled=true;
            }
        </script>
    </head>
    <body>
        <form method="post" action="p6.jsp">              
        <table align="center">
            <tr><td>Name:</td><td><input type='text' name='t1' id='t1'></td><td></td></tr>
            <tr><td>Password:</td><td><input type='text' name='t2' id='t2'></td><td></td></tr>
            <tr><td>Re-Password:</td><td><input type='text' name='t3' id='t3'></td><td></td></tr>
            <tr><td>Age:</td><td><input type='text' name='t4' id='t4'></td><td></td></tr>
            <tr><td>Mobile:</td><td><input type='text' name='t5' id='t5'></td><td></td></tr>
            <tr><td>Email:</td><td><input type='text' name='t6' id='t6'></td><td></td></tr>
            <tr><td></td><td><input type='checkbox' name='c1' id='c1' onchange="f2()">I Agrees</td><td></td></tr>
            <tr><td></td><td></td><td></td></tr>
            <tr><td></td><td></td><td></td></tr>
            <tr><td></td><td><input type="submit" value="Register" id='b1' onclick="return f1()" disabled></td><td></td></tr>
        </table>
            </form>
    </body>
</html>
