
import java.io.*;
import java.net.*;
class ServerHander extends Thread{
	
	Socket sock ;
	DataInputStream serverInput;
	PrintStream out ;
	ServerHander(Socket sock ){
		try{
			this.sock = sock;
			serverInput = new DataInputStream(sock.getInputStream());
			out = new PrintStream(sock.getOutputStream());
		 	}catch(Exception e){
			e.printStackTrace();
		}
	}//end 
	
	public void run(){
		
		try{
			
			while(true){
				System.out.println("The Msg from client : "+serverInput.readLine());
				out.println("Msg Delivered   ..");
			}
			
		}catch(Exception ee){
			System.out.println("Connection DisConnected ");
		}
		 
		
	}
	
		
		
		

}