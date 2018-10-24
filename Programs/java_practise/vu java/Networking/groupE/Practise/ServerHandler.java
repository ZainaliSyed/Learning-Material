import java.io.*;
import java.net.*;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
class ServerHandler extends Thread{
	Socket  socket;
	DataInputStream in;
	PrintStream out;
	
	ServerHandler(Socket  socket){
		try{
			this.socket=socket;
			in = new DataInputStream(socket.getInputStream());
			out  = new PrintStream(socket.getOutputStream());
		}catch(Exception ee){}
	}
	public void run(){
		try{
			while(true){
				String msg = in.readLine();
				System.out.println("this msg from clint="+msg);
				out.println("tanjo msg pochyo ro");
			}
		}catch(Exception ee){System.out.println("clint is disconted...");}
	}
}