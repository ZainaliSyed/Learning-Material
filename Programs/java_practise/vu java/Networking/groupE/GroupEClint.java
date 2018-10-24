import java.io.*;
import java.net.Socket;
import javax.swing.JOptionPane;

public class GroupEClint {
    public static void main(String arg[])throws Exception{
        Socket socket=new Socket("localhost",9090);  //127.0.0.1//
        PrintStream out=new PrintStream(socket.getOutputStream());
	    DataInputStream in=new DataInputStream(socket.getInputStream());
		while(true){
			String msg=JOptionPane.showInputDialog("Enter msg:");
			out.println(msg);
			System.out.println(in.readLine());
		}
    
    }
}
