import java.io.*;
import java.net.*;
import javax.swing.*;
public class ServerReadNetEx{
	
	public static void main(String args[]){
		
		try{
			
			ServerSocket ss  = new ServerSocket(2222);
			System.out.println("Server Started  ... ");
			
			while(true){
				
				Socket s = ss.accept();
				System.out.println("Connection Request Continouesly ");
				
				InputStream is  = s.getInputStream();
				ObjectInputStream ois  = new ObjectInputStream(is);
				
				PersonalInfo p = (PersonalInfo)ois.readObject();
				p.printPersonalInfo();
				s.close();
			}
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}//end of main
	
}