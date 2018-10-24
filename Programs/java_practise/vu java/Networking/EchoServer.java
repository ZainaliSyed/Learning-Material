import java.net.*;
import java.io.*;
import javax.swing.*;
public class EchoServer{
	
	public static void main(String args[]){
		
		try{
			
			ServerSocket ss = new ServerSocket(2222);
			System.out.println("server started .. ");
			
			while(true){
				Socket s  = ss.accept();
				System.out.println("Connection Request Recieved .. ");
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br  = new BufferedReader(isr);
				
				OutputStream os = s.getOutputStream();
				PrintWriter pw  = new PrintWriter(os,true);
				String name  = br.readLine();
				
				String msg = "Hello "+name+" From Server ";
				pw.println(msg);
				s.close();
			}
			
		}catch(Exception e){
			System.out.println(e);
		}		
			
	}//end of main
}