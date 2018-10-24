import java.io.*;
import java.net.*;
import javax.swing.*;

class Client{
	public static void main(String args[]){
		try{
			Socket  clientSock = new Socket("localhost",9090);
			PrintStream out  = new PrintStream(clientSock.getOutputStream());
			DataInputStream in = new DataInputStream(clientSock.getInputStream());
			while(true){
				String msg  = JOptionPane.showInputDialog(null," Enter Name ");
				out.println(msg);
				System.out.println(in.readLine());
			}
			
			
		}catch(Exception e){e.printStackTrace();}
	}//end of main 
	
}