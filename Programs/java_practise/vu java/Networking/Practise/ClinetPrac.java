import javax.swing.*;
import java.io.*;
import java.net.*;
class ClinetPrac{
	
	public static void main(String args[]){
		
		try{
			
		
		Socket sock = new Socket("LocalHost",9092);
		
		
		PrintStream out = new PrintStream(sock.getOutputStream());
		String name  = JOptionPane.showInputDialog(null,"Enter NAme  here : ");
		
		out.println(name);
		}catch(Exception e){e.printStackTrace();}
	}
}