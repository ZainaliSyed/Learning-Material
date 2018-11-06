import java.net.*;
import java.io.*;
import javax.swing.*;
public class EchoClient{
	public static void main(String args[]){
		
		try{
			
			Socket s  = new Socket("LocalHost",2222);
			
			InputStream is = s.getInputStream();
			InputStreamReader isr  = new InputStreamReader(is);
			BufferedReader br  = new BufferedReader(isr);
			
			OutputStream os  = s.getOutputStream();
			PrintWriter pw  = new PrintWriter(os,true);
			
			String msg = JOptionPane.showInputDialog(null, "Enter Your Name : ");
			pw.println(pw);
			
			msg = br.readLine();
			JOptionPane.showMessageDialog(null,"Msg : "+msg);
			s.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}//end of class
}