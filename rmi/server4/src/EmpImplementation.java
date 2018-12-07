
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import p1.Employees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class EmpImplementation extends UnicastRemoteObject implements p1.EmpInterface
{
    PreparedStatement stmt;
    ResultSet rs;
    Connection con;
    public EmpImplementation() throws RemoteException
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db8am","root","");
        }catch(Exception ee){System.out.println(ee);}
    }

    @Override
    public boolean insert(String eid, String name, String salary, String mobile, String doa, String designation) throws RemoteException {
        boolean b=false;
        try{
                stmt=con.prepareStatement("Insert into employees values(?,?,?,?,?,?)");
                stmt.setString(1,eid);
                stmt.setString(2,name);
                stmt.setString(3,salary);
                stmt.setString(4,mobile);
                stmt.setString(5,doa);
                stmt.setString(6,designation);
                int a=stmt.executeUpdate();
                if(a==1) b=true;
        }catch(Exception ee){System.out.println(ee);}
        return b;
    }

    @Override
    public boolean delete(String eid) throws RemoteException {
        boolean b=false;
        try{
                stmt=con.prepareStatement("Delete from employees where eid=?");
                stmt.setString(1,eid);
                int a=stmt.executeUpdate();
                if(a==1) b=true;
        }catch(Exception ee){System.out.println(ee);}
        return b;
    }

    @Override
    public boolean update(String eid, String salary) throws RemoteException {
        boolean b=false;
        try{
                stmt=con.prepareStatement("Update employees set salary=? where eid=?");
                stmt.setString(1,salary);
                stmt.setString(2,eid);                
                int a=stmt.executeUpdate();
                if(a==1) b=true;
        }catch(Exception ee){System.out.println(ee);}
        return b;
    }

    @Override
    public Employees search(String eid) throws RemoteException {
        p1.Employees emp=null;
        try{
                stmt=con.prepareStatement("Select * from employees where eid=?");
                stmt.setString(1,eid);
                rs=stmt.executeQuery();
                if(rs.next())
                {
                    emp=new p1.Employees(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                    
                }
        }catch(Exception ee){System.out.println(ee);}
        return emp;
    }
    
}
