import java.io.*;
import java.net.*;

class ServerHandler extends Thread{
	
	static Socket sock;
	static DataInputStream in;
	ServerHandler(Socket sock){
		try{
			this.sock = sock;
			in = new DataInputStream(sock.getInputStream());

		}catch(Exception e){
			e.printStackTrace();
		}
	}//end of cons
		  
		public void run (){
		try{
			String msg = in.readLine();
			int num = Integer.parseInt(msg);
			if(num==1){
				Server.btn1.setText("X");
				Server.btn1.setEnabled(false);
				Server.CheckWinner();
			}
			else if(num==2){
				Server.btn2.setText("X");
				Server.btn2.setEnabled(false);
				Server.CheckWinner();
			}
			else if(num==3){
				Server.btn3.setText("X");
				Server.btn3.setEnabled(false);
				Server.CheckWinner();
			}
			else if(num==4){
				Server.btn4.setText("X");
				Server.btn4.setEnabled(false);
				Server.CheckWinner();
			}
			else if(num==5){
				Server.btn5.setText("X");
				Server.btn5.setEnabled(false);
				Server.CheckWinner();
			}
			else if(num==6){
				Server.btn6.setText("X");
				Server.btn6.setEnabled(false);
				Server.CheckWinner();
			}
			else if(num==7){
				Server.btn7.setText("X");
				Server.btn7.setEnabled(false);
				Server.CheckWinner();
			}
			else if(num==8){
				Server.btn8.setText("X");
				Server.btn8.setEnabled(false);
				Server.CheckWinner();
			}
			else if(num==9){
				Server.btn9.setText("X");
				Server.btn9.setEnabled(false);
				Server.CheckWinner();
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
			
			
		} //end of run 
	
	
}