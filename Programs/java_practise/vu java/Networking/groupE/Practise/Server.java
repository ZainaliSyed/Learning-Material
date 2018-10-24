import java.io.*;
import java.net.*;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
class Server{
	public static void main(String args[]){
		try{
			ServerSocket sock = new ServerSocket(9090);
			System.out.println(" Server Is Started ..");
			while(true){
				
				Socket  socket = sock.accept();
				System.out.println(" Client  Is Connected  ..");
				ServerHandler ob=new ServerHandler(socket);
				ob.start();
			}
		}catch(Exception e){}
				
	}//end of main 
	
}