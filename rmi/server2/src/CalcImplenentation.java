
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CalcImplenentation extends UnicastRemoteObject implements p1.CalcInterface
{
    public CalcImplenentation() throws RemoteException
    {
        
    }

    @Override
    public String add(String s1, String s2) throws RemoteException {
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        int z=x+y;
        String s=z+"";
        return s;
    }

    @Override
    public String sub(String s1, String s2) throws RemoteException {
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        int z=x-y;
        String s=z+"";
        return s;
    }

    @Override
    public String mul(String s1, String s2) throws RemoteException {
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        int z=x*y;
        String s=z+"";
        return s;
    }

    @Override
    public String div(String s1, String s2) throws RemoteException {
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        if(y!=0)
        {    
            int z=x/y;
            String s=z+"";
            return s;
        }
        else
        {
            return "Division Not Possible";
        }
        
    }
    
}
