import java.io.*;
import java.net.*;
import javax.swing.*;
public class ClientWriteNetEx{
	
	public static void main(String args[]){
		
		try{
			
			PersonalInfo p = new PersonalInfo("ali","Hirabad ","090007860");
			
			Socket s = new Socket("LocalHost",2222);
			OutputStream is  = s.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(is);
			
			oos.writeObject(p);
			
			s.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}//end of main
}