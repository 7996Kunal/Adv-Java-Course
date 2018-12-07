import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
class Client
{
	public static void main(String[] ar)
	{
			try{
					Registry r=LocateRegistry.getRegistry("127.0.0.1",1099);
					Remote rmt=r.lookup("ABC");
					ServerInterface si=(ServerInterface)rmt;
					si.f1();
			}catch(Exception ee)
			{
				System.out.println("Error :"+ee);
			}
	}
}