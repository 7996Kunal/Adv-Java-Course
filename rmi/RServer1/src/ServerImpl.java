
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ServerImpl extends UnicastRemoteObject implements p1.ServerInterface
{
    public ServerImpl() throws RemoteException
    {
        
    }
    public void printTime() throws RemoteException
    {
        Date d=new Date();
        System.out.println("Date is "+d);
    }
}
