
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import p1.Results;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CalcImplementation extends UnicastRemoteObject implements p1.CalcInterface
{
    public CalcImplementation() throws RemoteException
    {        
    }

    @Override
    public Results calculate(String s1, String s2) throws RemoteException {
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        int a=x+y;
        int b=x-y;
        int c=x*y;
        int d=x/y;
        Results r=new Results(a+"",b+"",c+"",d+"");
        return r;
    }
    
}
