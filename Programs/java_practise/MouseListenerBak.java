import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MouseListenerBak implements MouseListener{

JFrame frame = new JFrame();

MouseListenerBak(){

	frame.setSize(500,500);
	frame.show();
	frame.addMouseListener(this);
				  }

	public void mouseEntered(MouseEvent evt){
	frame.getContentPane().setBackground(Color.blue);
	}
	
	public void mouseExited(MouseEvent evt){
	frame.getContentPane().setBackground(Color.white);
	}
	public void mousePressed(MouseEvent evt){
	frame.getContentPane().setBackground(Color.pink);
	}
	public void mouseReleased(MouseEvent evt){
	frame.getContentPane().setBackground(Color.green);
	}
	public void mouseClicked(MouseEvent evt){
	//frame.getContentPane().setBackground(Color.black);
	}
	public static void main(String args[]){
	new MouseListenerBak();
	}
}