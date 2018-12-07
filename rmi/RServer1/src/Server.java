
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
    public static void main(String[] args) {
        try{
                Registry r=LocateRegistry.createRegistry(1099);
                ServerImpl s=new ServerImpl();
                r.bind("TIME",s);
                System.out.println("Server is Ready");
        }catch(Exception ee){}
    }
    
}
