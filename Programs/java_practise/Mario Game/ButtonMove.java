import javax.swing.*;
import java.awt.event.*;

class ButtonMove implements KeyListener{
	
	
	JButton b1 = new JButton(" Press Arrow ");
	JFrame f = new JFrame("");
	
	int x=150,y=100;
	
	ButtonMove(){
	f.setLayout(null);
	f.setVisible(true);
	f.setSize(700,700);
	f.addKeyListener(this);
	
	b1.setBounds(200,250,x,y);
	f.add(b1);
	
	
	
	
	}
	int code ;
	public void keyPressed(KeyEvent e){
	code = e.getKeyCode();
	
		if(code==37){
		
		x = x-10;
		
		b1.setBounds(200,250,x,y);
		f.setTitle("X :"+x+"Y : "+y);
		//b1.setBounds(x,y,150,100);
		//b1.setLocation(x,y);
		
		}
		
			
		if(code==38){
		
		b1.setBounds(200,250,x,y);
		f.setTitle("X :"+x+"Y : "+y);
		y = y-10;
		//b1.setLocation(x,y);
		}
		
		if(code==39){
		
		b1.setBounds(200,250,x,y);
		f.setTitle("X :"+x+"Y : "+y);
		
		x = x+10;
		
		}
		
		if(code==40){
		
		b1.setBounds(200,250,x,y);
		f.setTitle("X :"+x+"Y : "+y);
		
		y = y+10;
		//b1.setLocation(x,y);
		}
		
		
	} // end of key Pressed
	
	public void keyTyped(KeyEvent e){
	
	}
	
	public void keyReleased(KeyEvent e){
	
	}
	
	public static void main(String args[]){
	new ButtonMove();
	
	
	
	
	
	}

}
