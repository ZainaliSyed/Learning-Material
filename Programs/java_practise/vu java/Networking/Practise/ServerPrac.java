import java.io.*;
import java.net.*;
class ServerPrac{
	public static void main(String args[]){
	try{			
		ServerSocket sock = new ServerSocket(9092);
		System.out.println(" Server Started  ");
		
		Socket clientSocket = sock.accept();
		System.out.println(" Client Connected ..  ");
		
		DataInputStream in = new DataInputStream(clientSocket.getInputStream());
		String msg = in.readLine();
		System.out.println(" Msg From Clinet  : "+msg);
		
	}catch(Exception e){
			e.printStackTrace();
		}
			
	}//end of main 
}