import java.io.*;
import java.net.*;
class HandleMy extends Thread{
	Socket sock;
	HandleMy(Socket sock){
		this.sock=sock;
	}
	public void run(){
		try{
			DataInputStream in=new DataInputStream(sock.getInputStream());
			PrintStream out=new PrintStream(sock.getOutputStream());
			while(true){
				String msg=in.readLine();
				System.out.println("this msg from clint="+msg);
				out.println("Your msg has reveived");
			}
		}catch(Exception e){}		
	}
}