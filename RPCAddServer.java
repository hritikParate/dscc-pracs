//RPC Server

import java.net.*; //network programming
import java.io.*;
import java.util.*;

class RPCAddServer
{
// UDP for client server connection

DatagramSocket ds; //for connection
DatagramPacket dp; //for sending messges
String str, methodName,result;

//message stored in str. from str we have to tokenize 
//methodName and Values

int val1, val2; //from str by applying parseInt

RPCAddServer()
{
try
{
ds = new DatagramSocket(2222);
byte[] b = new byte[4096]; //to store the message from client
while (true)
{
dp = new DatagramPacket(b,b.length);
// dp will recieve the message from client as a packet
ds.recieve(dp);// socket is recieving the message
str = new String(dp.getData(),0,dp.getLength());
if str.equalsIgnoreCase("exit"))
System.exit(1);
else{
StringTokenizer st = new StringTokenizer(str," ");
while(st.hasMoreTokens()) 
{
String token = st.nextToken(); // to get tokens
methodName = token;
val1 = Integer.parseInt(st.nextToken());
val2 = Integer.parseInt(st.nextToken());

}
}

System.out.println("\n First value:"+val1);
System.out.println("\n Second value:"+val2);

InetAddress ia = InetAddress.getLocalHost();
result = ""+add(val1,val2);
byte b1[] = result.getBytes();

//send b1 in packet 
DatagramPacket dp1 = new DatagramPacket(b1,b1.length,ia,1300);
System.out.println("Result: "+result);
ds.send(dp1);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}

public int add(int val1, val2)
{
return val1+val2;
}

public static void main(String[] args)
{
new RPCAddServer();
}

}







