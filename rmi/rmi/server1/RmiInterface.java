import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public interface RmiInterface extends Remote
{
	public void f1() throws RemoteException;
}