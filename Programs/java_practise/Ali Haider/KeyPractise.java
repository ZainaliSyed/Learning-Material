import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyPractise implements KeyListener{
	
	JFrame f  =  new JFrame("Ali");
	KeyPractise(){
		
		
		f.setLayout(null);
		f.setBounds(10,10,500,500);
		f.setVisible(true);
		f.addKeyListener(this);
	}
	
	
	public void keyPressed(KeyEvent ev){
		System.out.println("key pressed cod="+ev.getKeyCode());
	}
	public void keyClicked(KeyEvent ev){
		System.out.println("key clicked code="+ev.getKeyCode());
	}
	public void keyReleased(KeyEvent ev){
		System.out.println("key released code="+ev.getKeyCode());
	}
	public void keyTyped(KeyEvent ev){
		System.out.println("key typed code ="+ev.getKeyCode());
	}
	
	public static void main(String args[]){
		new KeyPractise();
	}
}//end of class 