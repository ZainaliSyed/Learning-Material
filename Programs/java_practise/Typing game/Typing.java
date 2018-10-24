import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Typing implements KeyListener{
	
	JFrame f = new JFrame();
	JLabel l1 = new JLabel("My Name Is Zain Ali");
	JTextField tf1 =new JTextField();
	JLabel l2 = new JLabel("My Father Name is Syed Rizwan Ali ");
	JTextField tf2 = new JTextField();
	
	JLabel  l3 = new JLabel("I Study In Sindh University ");
	JTextField tf3 = new JTextField();
	
	
	
	Typing(){
	f.setVisible(true);
	f.show();
	f.setSize(500,500);
	f.setLayout(null);
	
	l1.setBounds(10,20,200,50);
	f.add(l1);
	
	tf1.setBounds(10,80,200,30);
	f.add(tf1);
	tf1.setEditable(false);
	tf1.addKeyListener(this);
	tf1.setBackground(Color.white);
	
	l2.setBounds(10,150,200,30);
	f.add(l2);
	
	tf2.setBackground(Color.white);
	tf2.setBounds(0,200,200,30);
	tf2.setEditable(false);
	tf2.addKeyListener(this);
	f.add(tf2);
	
	l3.setBounds(10,250,200,30);
	f.add(l3);
	
	tf3.setBackground(Color.white);
	tf3.setBounds(0,300,200,30);
	tf3.setEditable(false);
	tf3.addKeyListener(this);
	f.add(tf3);
	
	}
	
	public void keyPressed(KeyEvent e){
	
	}
	
	String text1 = "";
	String typetext1 = "";
	
	public void keyTyped(KeyEvent e){
	
	char ch = e.getKeyChar();
	if(e.getSource()==tf1){
	text1 = l1.getText();
	typetext1 = tf1.getText();
	typetext1 = typetext1+""+ch;
	

	
	
	if(text1.startsWith(typetext1)){
	tf1.setText(typetext1);
	}
	}
	
	
	
	
	else if(e.getSource()==tf2){String text2 =  l2.getText();
	String typetext2 =tf2.getText();
	typetext2 =typetext2+""+ch;
	
	
	if(text2.startsWith(typetext2)){
	tf2.setText(typetext2);
	}
		
	}
	else if(e.getSource()==tf3){
	String text3 = l3.getText();
	String typetext3 = tf3.getText();
	typetext3 = typetext3+""+ch;
	
	if(text3.startsWith(typetext3)){
	tf3.setText(typetext3);
	}
	}
	
	else{
	System.out.println("Wrong key ..!");
	Toolkit.getDefaultToolkit().beep();
	}
	
	
	
	}
	
	public void keyReleased(KeyEvent e){
	}
	
	public static void main(String args[]){
	new Typing();
	}
}