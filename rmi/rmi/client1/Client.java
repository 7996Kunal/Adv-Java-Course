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
				RmiInterface rr=(RmiInterface)rmt;
				rr.f1();
		}catch(Exception ee){}
	}
}