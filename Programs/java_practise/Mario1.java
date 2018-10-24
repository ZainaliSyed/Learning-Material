import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Mario1 implements KeyListener{

int x =0;
int y=0;

ImageIcon icon = new ImageIcon("C:\\Users\\Hp EliteBook 6930p\\Desktop\\mario1.jpg");
JLabel image = new JLabel(icon);

JFrame frame = new JFrame();
JButton wal1 = new JButton();
JButton wal2 = new JButton();
JButton wal3 = new JButton();
JButton wal4 = new JButton();
JButton wal5 = new JButton();
JButton wal6 = new JButton();
JButton wal7 = new JButton();


Mario1(){

	frame.show();
	frame.setBounds(10,10,900,500);
	frame.setVisible(true);
	frame.setLayout(null);
	frame.addKeyListener(this);

	frame.add(image);
	image.setBounds(x,y,50,50);
	image.addKeyListener(this);
	image.setSize(90,92);

	


	wal1.setBounds(50,100,400,50);
	frame.add(wal1);
	wal1.setBackground(Color.blue);

	wal2.setBounds(550,100,300,50);
	frame.add(wal2);
	wal2.setBackground(Color.blue);

	wal3.setBounds(100,200,300,50);
	frame.add(wal3);
	wal3.setBackground(Color.blue);

	wal4.setBounds(500,200,200,50);
	frame.add(wal4);
	wal4.setBackground(Color.blue);
	
	wal5.setBounds(0,300,300,50);
	frame.add(wal5);
	wal5.setBackground(Color.blue);

	wal6.setBounds(100,400,400,50);
	frame.add(wal6);
	wal6.setBackground(Color.blue);

	wal7.setBounds(550,400,200,50);
	frame.add(wal7);
	wal7.setBackground(Color.blue);

		}

public void keyPressed(KeyEvent evt){
int code = evt.getKeyCode();

if(code==37  ){
image.setBounds(x,y,50,50);
x=x-3;
frame.setTitle("x"+x+"y"+y);
	
	if(x<0 ){
	x=0;
}

	}
	
if(code==38){
image.setBounds(x,y,50,50);
y=y-3;
frame.setTitle("X"+x+"Y"+y);

	if(y>411){
	y=411;
	}	 

}	

	
if(code==39){
image.setBounds(x,y,50,50);
x=x+3;
frame.setTitle("X"+x+"Y"+y);
	if(x>828){
	x=828;
	}

}

if(code==40){
image.setBounds(x,y,50,50);
y=y+3;
frame.setTitle("X"+x+"Y"+y);

	if(y<0){
	y=0;
	}


	
}

public void keyTyped(KeyEvent evt){

}

public void keyReleased(KeyEvent evt){

}

public static void main(String args[]){	 
	new Mario1(); 
	}

}