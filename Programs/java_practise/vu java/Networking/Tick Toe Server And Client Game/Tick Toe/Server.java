import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
class Server extends Frame implements ActionListener{
	 static PrintStream out;
	 static DataInputStream in;
	 static Socket socket;
	 static int num;
	 static JButton btn1=new JButton("");
     static JButton btn2=new JButton("");
     static  JButton btn3=new JButton("");
     static JButton btn4=new JButton("");
     static JButton btn5=new JButton("");
     static  JButton btn6=new JButton("");
     static  JButton btn7=new JButton("");
     static JButton btn8=new JButton("");
     static JButton btn9=new JButton("");

	Server(){
		setBounds(600,200,400,500); //x , y , width , height
		setTitle("Server Frame");
        GridLayout gird = new GridLayout(3, 3,5,5);
        setLayout(gird);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		setVisible(true);//
		 
	}	
	
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()==btn1){
			try{
				btn1.setText("0");
				btn1.setEnabled(false);
				out.println(1);
				 ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception ee){}
		}
		else if(evt.getSource()==btn2){
			try{
				btn2.setText("0");
				btn2.setEnabled(false);
				out.println(2);
				ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception e){}
		}

		else if(evt.getSource()==btn3){
			try{
				btn3.setText("0");
				btn3.setEnabled(false);
				out.println(3);
				ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception e){}
		}

		else if(evt.getSource()==btn4){
			try{
				btn4.setText("0");
				btn4.setEnabled(false);
				out.println(4);
				ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception e){}
		}

		else if(evt.getSource()==btn5){
			try{
				btn5.setText("0");
				btn5.setEnabled(false);
				out.println(5);
				ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception e){}
		}	
		
		else if(evt.getSource()==btn6){
			try{
				btn6.setText("0");
				btn6.setEnabled(false);
				out.println(6);
				ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception e){}
		}
		
		else if(evt.getSource()==btn7){
			try{
				btn7.setText("0");
				btn7.setEnabled(false);
				out.println(7);
				ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception e){}
		}
		else if(evt.getSource()==btn8){
			try{
				btn8.setText("0");
				btn8.setEnabled(false);
				out.println(8);
				ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception e){}
		}
		
		else if(evt.getSource()==btn9){
			try{
				btn9.setText("0");
				btn9.setEnabled(false);
				out.println(9);
				ServerHandler serverhand = new ServerHandler(socket);
				serverhand.start();
			}catch(Exception e){}
		}
		
	}//end of action 
	
	 
	 
	
	public static void CheckWinner(){
		if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")){
			JOptionPane.showMessageDialog(null,"X WIN");
			System.exit(0);
		}
		if(btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")){
			JOptionPane.showMessageDialog(null,"X WIN");
			System.exit(0);
		}
		if(btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")){
			JOptionPane.showMessageDialog(null,"X WIN");
			System.exit(0);
		}
		if(btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")){
			JOptionPane.showMessageDialog(null,"X WIN");
			System.exit(0);
		}
		if(btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")){				
			JOptionPane.showMessageDialog(null,"X WIN");			
			System.exit(0);
		}
		if(btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")){
			JOptionPane.showMessageDialog(null,"X WIN");
			System.exit(0);
		}
		if(btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")){
			JOptionPane.showMessageDialog(null,"X WIN");
			System.exit(0);	
		}
		if(btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X")){
			JOptionPane.showMessageDialog(null,"X WIN");
			System.exit(0);	
		}
		if(btn1.getText().equals("0") && btn2.getText().equals("0") && btn3.getText().equals("0")){
			JOptionPane.showMessageDialog(null,"0 WIN");
			System.exit(0);
		}
		
		
		if(btn4.getText().equals("0") && btn5.getText().equals("0") && btn6.getText().equals("0")){
			JOptionPane.showMessageDialog(null,"0 WIN");
			System.exit(0);
		}
		if(btn7.getText().equals("0") && btn8.getText().equals("0") && btn9.getText().equals("0")){
			JOptionPane.showMessageDialog(null,"0 WIN");
			System.exit(0);
		}
		if(btn1.getText().equals("0") && btn4.getText().equals("0") && btn7.getText().equals("0")){
			JOptionPane.showMessageDialog(null,"0 WIN");
			System.exit(0);
		}
		if(btn2.getText().equals("0") && btn5.getText().equals("0") && btn8.getText().equals("0")){
			JOptionPane.showMessageDialog(null,"0 WIN");
			System.exit(0);
		}
		if(btn3.getText().equals("0") && btn6.getText().equals("0") && btn9.getText().equals("0")){
			JOptionPane.showMessageDialog(null,"0 WIN");
			System.exit(0);
		}
		if(btn1.getText().equals("0") && btn5.getText().equals("0") && btn9.getText().equals("0")){
			JOptionPane.showMessageDialog(null,"0 WIN");
			System.exit(0);
		}
		if(btn3.getText().equals("0") && btn5.getText().equals("0") && btn7.getText().equals("0")){
			JOptionPane.showMessageDialog(null,"0 WIN");
			System.exit(0);
		}
	}//end check method
	public static void main(String arg[]){
		
		try{
			Server clint  = new Server();
			ServerSocket sock = new ServerSocket(9090);
			System.out.println(" Server Is Started ..");
			socket = sock.accept();
			in = new DataInputStream(socket.getInputStream());
			out=new PrintStream(socket.getOutputStream());
			ServerHandler serverhand = new ServerHandler(socket);
			serverhand.start();
		}catch(Exception ee){ee.printStackTrace();}
		 
	 
	}//end of main 
}