//retrieve simple method from server which is located inside an object
//step-1 define an interface  which contains a method 

import java.rmi.*;
public interface HelloRmiInterface extends Remote
{
	public String display() throws RemoteException;
	
}