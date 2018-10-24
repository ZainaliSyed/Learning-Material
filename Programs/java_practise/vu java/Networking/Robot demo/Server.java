package mixmaterial;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public static void main(String arg[])throws Exception{
        ServerSocket server =new ServerSocket(9099);
        System.out.println("server is started....");
		
        Socket sock = server.accept();
		
        System.out.println("client is connected......");
		
        DataInputStream in = new DataInputStream(sock.getInputStream());
        String str=in.readLine();
		
        while(true){
            System.out.println(str);
            str=in.readLine();
        }
    }
}
