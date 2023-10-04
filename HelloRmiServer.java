// step-3: Register the object inside rmiregistry
// create server program 

import java.rmi.*;
import java.rmi.registry.*;//to get the registry services

public class HelloRmiServer{

public static void main (String[] args)
{
	
	try
	{
		Registry reg = LocateRegistry.createRegistry(2099);
		
		// Registry reg = LocateRegistry.getRegistry();

		HelloRmiImpl obj = new HelloRmiImpl();
		// give a name to the object and store that object inside rmiregistry
		// to give a name we have to use bind() or rebind() of Naming class
		Naming.rebind("rmi://localhost:2099/hello",obj);
	}
	catch(Exception e)
	{
		
	}
	

}
}