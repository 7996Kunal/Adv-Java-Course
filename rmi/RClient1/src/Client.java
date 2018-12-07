
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
public class Client 
{
    public static void main(String[] args) {
        try{
                Registry r=LocateRegistry.getRegistry("127.0.0.1",1099);
                p1.ServerInterface rr=(p1.ServerInterface)r.lookup("TIME");
                rr.printTime();
                System.out.println("Done");
        }catch(Exception ee){}
    }
}
