import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
class Server
{
	public static void main(String[] ar)
	{
			try{
					Registry r=LocateRegistry.createRegistry(1099);
					ServerImpl s=new ServerImpl();
					r.bind("MATH",s);
					System.out.println("Ready");
			}catch(Exception ee){}
	}
}