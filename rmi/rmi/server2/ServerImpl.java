import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class ServerImpl extends UnicastRemoteObject implements ServerInterface
{
	public ServerImpl() throws RemoteException
	{
	}
	public String add(String s1,String s2) throws RemoteException
	{
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		return "Addition is :"+(x+y);
	}
	public String sub(String s1,String s2) throws RemoteException
	{
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		return "Difference is :"+(x-y);
	}
	public String mul(String s1,String s2) throws RemoteException
	{
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		return "Multiplication is :"+(x*y);
	}
	public String div(String s1,String s2) throws RemoteException
	{
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		return "Division is :"+(x/y);
	}
}