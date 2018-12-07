import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class RmiImpl extends UnicastRemoteObject implements RmiInterface
{
	public RmiImpl() throws RemoteException
	{
		super();
	}
	public void f1() throws RemoteException
	{
		System.out.println("Hello");
	}
}