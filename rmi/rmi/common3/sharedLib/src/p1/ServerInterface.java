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
public interface ServerInterface extends Remote
{
        public String add(String s1,String s2) throws RemoteException;
	public String sub(String s1,String s2) throws RemoteException;
	public String mul(String s1,String s2) throws RemoteException;
	public String div(String s1,String s2) throws RemoteException;
}
