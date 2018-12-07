/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class Student 
{
    private String rollno,name,course;
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    public Student() {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbshop","root","");
        }catch(Exception ee){}
    }

    public Student(String rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getDetails()
    {
        return rollno+":"+name+":"+course;
    }
    public void insert()
    {
        try{
                stmt=con.prepareStatement("Insert into Students values(?,?,?)");
                stmt.setString(1,rollno);
                stmt.setString(2,name);
                stmt.setString(3,course);
                stmt.executeUpdate();
                
        }catch(Exception ee){}
    }
}
