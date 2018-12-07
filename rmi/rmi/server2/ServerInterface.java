import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public interface ServerInterface extends Remote
{
	public String add(String s1,String s2) throws RemoteException;
	public String sub(String s1,String s2) throws RemoteException;
	public String mul(String s1,String s2) throws RemoteException;
	public String div(String s1,String s2) throws RemoteException;
}