import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public interface ServerInterface extends Remote
{
	void f1() throws RemoteException;
}