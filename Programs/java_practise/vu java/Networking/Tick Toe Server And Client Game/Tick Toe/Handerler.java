import java.io.*;
import java.net.*;

class Handerler extends Thread{
	
	static Socket sock;
	static DataInputStream in ;
	Handerler(Socket sock){
		try{
			this.sock = sock;
			in = new DataInputStream(sock.getInputStream());
		}catch(Exception e){
			e.printStackTrace();
		}
		 
	}
	
	public void run(){
		
		 try{
			
			String msg = in.readLine();
			int num = Integer.parseInt(msg);
			if(num==1){
				client.btn1.setText("0");
				client.btn1.setEnabled(false);
				client.CheckWinner();
			}
			else if(num==2){
			client.btn2.setText("0");
			client.btn2.setEnabled(false);
			client.CheckWinner();
		}
		else if(num==3){
			client.btn3.setText("0");
			client.btn3.setEnabled(false);
			client.CheckWinner();
		}
		else if(num==4){
			client.btn4.setText("0");
			client.btn4.setEnabled(false);
			client.CheckWinner();
		}
		else if(num==5){
			client.btn5.setText("0");
			client.btn5.setEnabled(false);
			client.CheckWinner();
		}
		else if(num==6){
			client.btn6.setText("0");
			client.btn6.setEnabled(false);
			client.CheckWinner();
		}
		else if(num==7){
			client.btn7.setText("0");
			client.btn7.setEnabled(false);
			client.CheckWinner();
		}
		else if(num==8){
			client.btn8.setText("0");
			client.btn8.setEnabled(false);
			client.CheckWinner();
		}
		else if(num==9){
			client.btn9.setText("0");
			client.btn9.setEnabled(false);
			client.CheckWinner();
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}//end of run 
	
}//end of class