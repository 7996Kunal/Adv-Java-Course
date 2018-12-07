/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Administrator
 */
public interface EmpInterface extends Remote
{
    public boolean insert(Emp e) throws RemoteException;
    public boolean delete(String id) throws RemoteException;
    public boolean update(String id,String salary) throws RemoteException;
    public Emp search(String id) throws RemoteException;
}
