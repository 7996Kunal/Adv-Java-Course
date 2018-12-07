
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Server 
{
    public static void main(String[] arr)
    {
        try{
                Registry rr=LocateRegistry.createRegistry(1099);
                rr.bind("EMP",new EmpImpl());
                System.out.println("Ready");
        }catch(Exception ee){}
    }
}
