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
public interface ServerInterface extends java.rmi.Remote
{
    void printTime() throws RemoteException;
    
}
