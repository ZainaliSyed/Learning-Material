import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class GroupEServer {
    public static void main(String arg[])throws Exception{
        ServerSocket server=new ServerSocket(9090);
        System.out.println("server is started....");
        Socket sock=server.accept();
        System.out.println("clint is connected......");
        DataInputStream in=new DataInputStream(sock.getInputStream());
		
        //String msg=in.read();
        //System.out.println("this msg from clint="+msg);
		
		
		
    }//end of main
}
