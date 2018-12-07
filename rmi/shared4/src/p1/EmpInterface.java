/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

import java.rmi.RemoteException;

/**
 *
 * @author Administrator
 */
public interface EmpInterface extends java.rmi.Remote
{
    boolean insert(String eid,String name,String salary,String mobile,String doa,String designation) throws RemoteException;
    boolean delete(String eid) throws RemoteException;
    boolean update(String eid,String salary) throws RemoteException;
    Employees search(String eid) throws RemoteException;
    
}
