//step-2: Implement the interface methods
//create a class 

import java.rmi.*;
import java.rmi.server.*;//for rmi server application
public class HelloRmiImpl extends UnicastRemoteObject implements HelloRmiInterface
{
	public HelloRmiImpl()throws RemoteException
	{
		super();
	}
	
	public String display()
	{
		return ("Welcome to RMI Application");
	}
	
	
}
