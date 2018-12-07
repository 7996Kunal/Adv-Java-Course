/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class MyClass 
{
    public static String getPassword()
    {
        String pass="";
        for(int i=1;i<=5;i++)
        {
            int a=(int)(Math.random()*25+65);
            char ch=(char)a;
            pass=pass+ch;
        }
        for(int i=1;i<=3;i++)
        {
            int a=(int)(Math.random()*9+48);
            char ch=(char)a;
            pass=pass+ch;
        }
        return pass;
    }
    public static String getDate()
    {
        java.util.Date dd=new java.util.Date();
        int y=dd.getYear()+1900;
        int m=dd.getMonth()+1;
        int d=dd.getDate();
        String s=y+"-"+m+"-"+d;
        return s;
    }
    public static int getTransactionId()
    {
        int id=0;
        try{
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDB","root","");
        PreparedStatement stmt;
        stmt=con.prepareStatement("Select count(*)+1 from banktrans");
        ResultSet rs=stmt.executeQuery();
        if(rs.next())
            id=rs.getInt(1);
        con.close();
        }catch(Exception ee){}
        
        return id;
    }
}
