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
    public  String getDate()
    {
        String s="";
        java.util.Date d=new java.util.Date();
        s=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
        return s;
    }
    public  int getId()
    {
        int rid=0;
        Connection con=null;
        try{
        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/SocialApp","root","");
        PreparedStatement stmt=con.prepareStatement("select count(*)+1 from friends");
        ResultSet rs=stmt.executeQuery();
        if(rs.next())
            rid=rs.getInt(1);
        }catch(Exception ee){}
        finally
        {
            try{
            if(con!=null)
                con.close();
            }catch(Exception e){}
        }
        System.out.println("RID is "+rid)        ;
        return rid;
    }
}
