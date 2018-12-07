import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
class Server
{
	public static void main(String[] ar)
	{
		try{
				Registry r=LocateRegistry.createRegistry(1099);
				RmiImpl rr=new RmiImpl();
				r.bind("ABC",rr);
				System.out.println("Ready");
		}catch(Exception ee){}
	}
}