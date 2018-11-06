import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MousePractise implements MouseListener{
	
	
	JFrame f  =  new JFrame("Ali");
	
	MousePractise(){
		
		f.setLayout(null);
		f.setBounds(10,10,500,500);
		f.setVisible(true);
		f.addMouseListener(this);
		
	}
	
	public void mousePressed(MouseEvent evt){
		Object ob = evt.getSource();
		System.out.println("Mouse Pressed ");
	}
	
	public void mouseReleased(MouseEvent evt){
		System.out.println("Mouse Releasde ");
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("Mouse Clicked  ");
	}
	public void mouseEntered (MouseEvent e){
		System.out.println("Mouse Entered  ");
	}
	public void mouseExited (MouseEvent e){
		System.out.println("Mouse Exit ");
		System.exit(0);
	}
	
	
	public static void main(String args[]){
			new MousePractise();
	}

}