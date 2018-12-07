/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

/**
 *
 * @author Administrator
 */
public class MyClass 
{
    public static String getDateTime()
    {
        java.util.Date d=new java.util.Date();
        String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
        return dt;
    }
    public static String getPassword()
    {
        String password="";
        int n=10;
        int m=(int)(Math.random()*6);
        for(int i=1;i<=m;i++)
        {
            int x=(int)(Math.random()*26+65);
            char ch=(char)x;
            password=password+ch;
        }
        for(int i=1;i<=n-m;i++)
        {
            int x=(int)(Math.random()*10+48);
            char ch=(char)x;
            password=password+ch;
        }
        return password;
    }
}
