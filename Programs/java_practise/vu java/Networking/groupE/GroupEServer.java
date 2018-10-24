import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class GroupEServer {
    public static void main(String arg[]){
		try{
			ServerSocket server=new ServerSocket(9090);
			System.out.println("server is started....");
			
			while(true){
				Socket sock=server.accept();
				HandleMy ob=new HandleMy(sock);
				ob.start();

			}
		}catch(Exception e){}
	}
}
