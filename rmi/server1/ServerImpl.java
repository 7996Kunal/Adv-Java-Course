import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class ServerImpl extends UnicastRemoteObject implements ServerInterface
{
	public ServerImpl() throws RemoteException
	{

	}
	public void f1() throws RemoteException
	{
		System.out.println("Hello");
	}
}