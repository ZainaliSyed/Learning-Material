import java.io.*;
import java.net.*;


class Server{
	
	public static void main(String args[]){
		
		try{
			
			ServerSocket serverSocket = new ServerSocket(9090);
			System.out.println("Server Started ");
			
			int clientCounter = 0;
			
			while(true){
				clientCounter ++;
				Socket sock = serverSocket.accept();
				System.out.println("Client  Connected ..  "+clientCounter);
				
				ServerHander ob = new ServerHander(sock);
				ob.start();
				DataInputStream serverInput = new DataInputStream(sock.getInputStream());
				PrintStream out  = new PrintStream(sock.getOutputStream());
			

			}//end of while 
			 
		}catch(Exception e){e.printStackTrace(); }
		
		
		
		
	}//end of main 
	
}