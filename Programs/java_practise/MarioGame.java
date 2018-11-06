import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MarioGame implements KeyListener{
	
	int x=0;
	int y=0;
	
	JFrame f = new JFrame();
	
	//ImageIcon backgrnd = new ImageIcon("C:\\Users\\Hp EliteBook 6930p\\Desktop\\Mario game\\backmario.jpg");
	
	
	ImageIcon playerimage = new ImageIcon("C:\\Users\\Hp EliteBook 6930p\\Desktop\\Mario game\\Mario1.jpg");
	JLabel player = new JLabel(playerimage);
	
	ImageIcon wallpic = new ImageIcon("C:\\Users\\Hp EliteBook 6930p\\Desktop\\Mario game\\Brick-Wall-l.jpg");
	
	
	JLabel wal1 = new JLabel(wallpic);
	JLabel wal2 = new JLabel(wallpic);
	JLabel wal3 = new JLabel(wallpic);
	JLabel wal4 = new JLabel(wallpic);
	JLabel wal5 = new JLabel(wallpic);
	JLabel wal6 = new JLabel(wallpic);
	JLabel wal7 = new JLabel(wallpic);
	JLabel wal8 = new JLabel(wallpic);
	JLabel wal9 = new JLabel(wallpic);

MarioGame(){

	f.setSize(1280,800);
	f.setLayout(null);
	f.show();
	f.addKeyListener(this);
	//f.getContentPane().add(new JPanelWithBackground("backmario.jpg"));
	
	player.setSize(55,54);
	player.setIcon(playerimage);
	f.add(player);
	player.addKeyListener(this);
	
	wal1.setBounds(0,100,600,50);
	wal1.setIcon(wallpic);
	f.add(wal1);
	wal1.addKeyListener(this);
	
	
	wal2.setBounds(900,100,360,50);
	wal2.setIcon(wallpic);
	f.add(wal2);
	wal2.addKeyListener(this);
	
	
	wal3.setBounds(0,250,400,50);
	wal3.setIcon(wallpic);
	f.add(wal3);
	wal3.addKeyListener(this);
	
	
	wal4.setBounds(600,250,650,50);
	wal4.setIcon(wallpic);
	f.add(wal4);
	wal4.addKeyListener(this);
	
	
	wal5.setBounds(150,400,650,0);
	wal5.setIcon(wallpic);
	f.add(wal5);
	wal5.setSize(500,50);
	wal5.addKeyListener(this);
	
	wal6.setBounds(800,400,400,50);
	wal6.setIcon(wallpic);
	f.add(wal6);
	wal6.addKeyListener(this);

	wal7.setBounds(0,550,400,50);
	wal7.setIcon(wallpic);
	f.add(wal7);
	wal7.addKeyListener(this);

	
	wal8.setBounds(650,550,610,50);
	wal8.setIcon(wallpic);
	f.add(wal8);
	wal8.addKeyListener(this);

	wal9.setBounds(0,680,1200,50);
	wal9.setIcon(wallpic);
	f.add(wal9);
	wal9.addKeyListener(this);

	
	f.setVisible(true);
	}

	public void keyPressed(KeyEvent evt){
	int code = evt.getKeyCode();
	if(code==37 && x>0) //left
	if(y>=45 && y<155 && x==600);
	else if(y>195 && y<300 && x==400);
	else if(y>=345 && y<450 && x==650);
	else if(y>=495 && y<600 && x==400);
	else {
	x=x-5;
	}
	
	if(code==38 && y>0) //upward
	if(x>=0 && x<600 && y==155);
	else if(x>900 && x<1195 && y==150);
	else if(x>=0 && x<400 && y==300);
	else if(x>=545 && x<1195 && y==300);
	else if(x>=95 && x<650 && y==450);
	else if(x>=0 && x<400 && y==600);
	else if(x>=595 && x<1195 && y==600);
	else {
	y =y-5;
	}
	
	if(code==39 && x<=1185) //right
	if(y>45 && y<150 && x==845);
	else if(y>195 && y<300 && x==545);
	else if(y>=345 && y<450 && x==95);
	else if(y>=495 && y<600 && x==595);
	else{
	 x+=5;
		
	}
	
	if(code==40 && y<626) // downward
	if(x>=0 && x<600 && y==45);
	else if(x>900 && x<1185 && y==45);
	else if(x>=0 && x<400 &&y==195);
	else if(x>=545 && x<1195 && y==195);
	else if(x>=95 && x<650 && y==345);
	else if(x>=0 && x<=400 && y==495);
	else if(x>=595 && x<1195 && y==495);
	
	else{
	y = y+5;	
		
	}//end of 40
	
	player.setBounds(x,y,55,54);
	f.setTitle("X"+x+"Y"+y);
	
}//end of key press 
	
	public void keyTyped(KeyEvent evt){
	}
	
	public void keyReleased(KeyEvent evt){
	}
	
	public static void main(String args[]){
	new MarioGame();
	
	}
}