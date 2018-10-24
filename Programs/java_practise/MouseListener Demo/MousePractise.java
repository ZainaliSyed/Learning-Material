import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MousePractise extends JFrame implements MouseListener{
	
	MousePractise(){
		setLayout(null);
		setBounds(0,0,500,500);
		
		addMouseListener(this);
		setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("Mouse Clicked");
		getContentPane().setBackground(Color.green);
	}
	
	public void mousePressed(MouseEvent e){
		System.out.println("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e){
		System.out.println("Mouse Released");
	}
	
	public void mouseEntered(MouseEvent e){
		System.out.println("Mouse Entered");
	}
	
	public void mouseExited(MouseEvent e){
		System.out.println("Mouse Exited");
	}
	
	public static void main(String args[]){
		new MousePractise();
	}
}//end of class 