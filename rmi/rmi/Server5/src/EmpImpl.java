/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.rmi.*;
import java.rmi.server.*;
import p1.Emp;
/**
 *
 * @author Administrator
 */
public class EmpImpl extends UnicastRemoteObject implements p1.EmpInterface
{
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    public EmpImpl() throws RemoteException
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDb","root","");
        }catch(Exception ee){}
    }

    @Override
    public boolean insert(Emp e) throws RemoteException {
        boolean b=false;
        try{
                stmt=con.prepareStatement("Insert into emp values(?,?,?,?,?)");
                stmt.setString(1,e.id);
                stmt.setString(2,e.name);
                stmt.setString(3,e.designation);
                stmt.setString(4,e.doa);
                stmt.setString(5,e.salary);
                int a=stmt.executeUpdate();
                if(a==1) b=true;
        }catch(Exception ee){}
        return b;
    }

    @Override
    public boolean delete(String id) throws RemoteException {
         boolean b=false;
        try{
                stmt=con.prepareStatement("Delete from emp where eid=?");
                stmt.setString(1,id);
                int a=stmt.executeUpdate();
                if(a==1) b=true;
        }catch(Exception ee){}
        return b;
    }

    @Override
    public boolean update(String id, String salary) throws RemoteException {
         boolean b=false;
        try{
                stmt=con.prepareStatement("Update emp set salary=? where eid=?");
                stmt.setString(1,salary);
                stmt.setString(2,id);
                int a=stmt.executeUpdate();
                if(a==1) b=true;
        }catch(Exception ee){}
        return b;
    }

    @Override
    public Emp search(String id) throws RemoteException {
        Emp e=null;
        try{
                stmt=con.prepareStatement("Select * from emp where eid=?");
                stmt.setString(1,id);
                rs=stmt.executeQuery();
                if(rs.next())
                {
                    e=new Emp();
                    e.id=rs.getString(1);
                    e.name=rs.getString(2);
                    e.designation=rs.getString(3);
                    e.doa=rs.getString(4);
                    e.salary=rs.getString(5);
                }
        }catch(Exception ee){}
        return e;
    }
    
}
