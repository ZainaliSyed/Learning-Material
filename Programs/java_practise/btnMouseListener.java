import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class btnMouseListener implements MouseListener{

JFrame frame = new JFrame(); 
int  counter=-1;
JButton btn1;
	btnMouseListener(){
		frame.setSize(500,500);
		//frame.addMouseListener();
		frame.show();
		frame.setVisible(true);
		
		btn1 = new JButton("Change  Color :");
		frame.add(btn1);
		btn1.setBounds(50,100,200,50);
		btn1.addMouseListener(this);
		
		JButton btn2 = new JButton("Adpot  Color :");
		frame.add(btn2);
		btn2.setBounds(50,150,100,50);
		btn2.addMouseListener(this);
				  }
	public void mouseEntered(MouseEvent evt){
		}
	public void mouseExited(MouseEvent evt){
	}
	
	
	public void mousePressed(MouseEvent evt){
	counter++;
		if(counter==0){
	btn1.getContentPane().setBackground(Color.black);
	}
		if(counter==1){
	btn1.setBackground(Color.blue);
	}
	
				 }
					  
					  
					  
	public void mouseReleased(MouseEvent evt){
	}
	public void mouseClicked(MouseEvent evt){
	}
	public static void main(String args[]){
	new btnMouseListener();
	}
}