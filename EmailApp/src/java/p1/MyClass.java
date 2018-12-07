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
    public String getDate()
    {
        java.util.Date d=new java.util.Date();
        String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
        return dt;
    }
    public String getDateTime()
    {
        java.util.Date d=new java.util.Date();
        String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate() +" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
        return dt;
    }
}
