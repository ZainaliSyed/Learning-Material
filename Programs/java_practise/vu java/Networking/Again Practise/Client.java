import java.io.*;
import java.net.*;
import javax.swing.*;


class Client{
	
	public static void main(String args[]){
		
		
		try{
			
			Socket clientSocket = new Socket("LocalHost",9090);
			PrintStream out  = new PrintStream(clientSocket.getOutputStream());
			DataInputStream clientInput = new DataInputStream(clientSocket.getInputStream());
			
			while(true){
				String msg = JOptionPane.showInputDialog(null,"Enter NAme  : ");
				out.println(msg);
				System.out.println(clientInput.readLine());
			 
			}//end of while 
			 
				
			
		}catch(Exception e){e.printStackTrace(); }
		 
		
	}//end of main 
	
}