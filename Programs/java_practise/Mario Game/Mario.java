import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
public class Mario implements KeyListener {
      
	JFrame f = new JFrame();
	
	JLabel player = new JLabel(new ImageIcon("super_mario.gif")); 
	
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JLabel l6 = new JLabel();
	JLabel l7 = new JLabel();
	JLabel l8 = new JLabel();
	JLabel l9 = new JLabel();
	JLabel l10 = new JLabel();
	
	JLabel  arrow = new JLabel(new ImageIcon("GIF-arrow.gif"));
	
	
	int x=0,y=0;
	
	Mario(){
	f.show();
	f.setSize(1100,750);
	
	f.setVisible(true);
	f.setLayout(null);
	//f.setLoction(x,y);
	f.addKeyListener(this);
	
	player.setBounds(x,y,18,33);
	f.add(player);
	
	l1.setBackground(Color.blue);
	l1.setOpaque(true);
	l1.setBounds(0,100,300,50);
	f.add(l1);
	
	l2.setBackground(Color.blue);
	l2.setOpaque(true);
	l2.setBounds(400,100,200,50);
	f.add(l2);
	
	l3.setBackground(Color.blue);
	l3.setOpaque(true);
	l3.setBounds(800,100,400,50);
	f.add(l3);
	
	l4.setBackground(Color.blue);
	l4.setOpaque(true);
	l4.setBounds(200,250,400,50);
	f.add(l4);
	
	l5.setBackground(Color.blue);
	l5.setOpaque(true);
	l5.setBounds(800,250,300,50);
	f.add(l5);
	
	l6.setBackground(Color.blue);
	l6.setOpaque(true);
	l6.setBounds(0,400,500,50);
	f.add(l6);
	
	l7.setBackground(Color.blue);
	l7.setOpaque(true);
	l7.setBounds(800,400,250,50);
	f.add(l7);
	
	l8.setBackground(Color.blue);
	l8.setOpaque(true);
	l8.setBounds(200,550,400,50);
	f.add(l8);
	
	l9.setBackground(Color.blue);
	l9.setOpaque(true);
	l9.setBounds(700,550,300,50);
	f.add(l9);
	
	l10.setBackground(Color.blue);
	l10.setOpaque(true);
	l10.setBounds(0,700,1000,50);
	f.add(l10);
	
	// 	Arrow Position 
	arrow.setBounds(0,180,35,31);
	f.add(arrow);
	
	while(true){	
		for(int i=0; i<=1050;  i++){	
			arrow.setLoction(i,180);
				if(i==1050){
					break;
				}
		}
		for(int j=1050; j>0; j--){
		arrow.setLoction(j,180);
		
		}
	  }
	}
	
	public void keyPressed(KeyEvent e){
	int code = e.getKeyCode();
	
		if(code==37 && x>=0){
		player.setBounds(x,y,18,33);
		f.setTitle("X :"+x+"Y :"+y);
			
			if(y>=70 && y<150 && x==300);
			else if(y>=70 && y<=150 && x==600);
			else if(y>=220 && y<=300 && x==600);
			else if(y>=370 && y<=450 && x==500);
			else if(y>=520 && y<=600 && x==600);
			else if(y>=520 && y<=600 && x==990);
			
			else{
			x = x-10;
			}
		
			//if(x>=0 && x<=1060 && y==0);
			
		 
		}// end of 37 left 
		
		if(code==38 && y>=0){
		player.setBounds(x,y,18,33);
		f.setTitle("X : "+x+" Y :"+y);
		
			if(x>0 && x<300 && y==150);	
			else if(x>=380 && x<=600 && y==150);
			else if(x>=780 && x<1060 && y==150);
			else if(x>=190 && x<=590 && y==300);
			else if(x>=790 && x<1060 && y==300);
			else if(x>=0 && x<490 && y==450);
			else if(x>=790 && x<1060 && y==450);
			else if(x>=190 && x<600 && y==600);
			else if(x>=690 && x<=990 && y==600);
			
			else{
			y = y-10;
			}
			
			
		}// end 38 up
	
		if(code==39 && x<=1060){
		player.setBounds(x,y,18,33);
		f.setTitle("X :"+x+" Y :"+y);
			if(y>=70 && y<=150 && x==380);
			else if(y>=70 && y<150 && x==780);
			else if(y>=220 && y<=300 && x==190);
			else if(y>=220 && y<=300 && x==780);
			else if(y>=370 && y<=450 && x==790);
			else if(y>=520 && y<=600 && x==190);
			else if(y>=520 && y<=600 && x==690);
			
			else{
			x=x+10;
			}
		}// end of 39 right 
		
		if(code==40 && y<=670){
		player.setBounds(x,y,18,33);
		f.setTitle("X :"+x+" Y :"+y);
		
			if(x>=0 && x<300 && y==70);
			else if(x>=390 && x<600 && y==70);
			else if(x>790 && x<1060 && y==70);
			else if(x>=190 && x<=590 && y==220);
			else if(x>=790 && x<1060 && y==220);
			else if(x>=0 && x<490 && y==370);
			else if(x>=790 && x<1060 && y==370);
			else if(x>=190 && x<590 && y==520);
			else if(x>=690 && x<990 && y==520);
			else if(x>=690 && x<1000 && y==600);
			else if(x>=0 && x<1060 && y==670);
			
			
			else{
			y = y+10;
			}// 40 down 
		
		}
		
		
	}	// end of key Press
	
	public void keyTyped(KeyEvent e){
			
	
	}
	
	public void keyReleased(KeyEvent e){
	}

	public static void main(String args[]){
	
	new Mario();
	
	}



}