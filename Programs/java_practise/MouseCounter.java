import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MouseCounter implements MouseListener{

int counter =-1;
JFrame frame = new JFrame();

	MouseCounter()
	{
	frame.setSize(500,500);
	frame.addMouseListener(this);
	frame.show();
	
	
	
	}
	
	public void mouseEntered(MouseEvent evt){
	/*
	counter++;
	
	if(counter ==0){
	frame.getContentPane().setBackground(Color.black);
	}
	if(counter==1){
	frame.getContentPane().setBackground(Color.blue);
	}
	if(counter==2){
	frame.getContentPane().setBackground(Color.pink);
	}
	if(counter==3){
	frame.getContentPane().setBackground(Color.green);
	}
	
	if(counter==3){
	counter=-1;
	}
	*/
	}
	
	public void mouseExited(MouseEvent evt){
	/*couter++;
	if(counter==0){
	frame.getContentPane().setBackground(Color.black);
	}
	if(couner==1){
	frame.getContentPane().setBackground(Color.blue);
	}
	if(counter==2){
	frame.getContentPane().setBackground(Color.pink);
	}
	if(counter==3){
	frame.getContentPane().setBackground(Color.green);
	}
	if(counter==3){
	counter=-1; 
	} */
											}
	
	public void mousePressed(MouseEvent evt){
		counter++;
	if(counter==0){
	frame.getContentPane().setBackground(Color.black);
	}
	if(counter==1){
	frame.getContentPane().setBackground(Color.blue);
	}
	if(counter==2){
	frame.getContentPane().setBackground(Color.pink);
	}
	if(counter==3){
	frame.getContentPane().setBackground(Color.green);
	}
	if(counter==3){
	counter=-1;
	}
											
											}
	
	public void mouseReleased(MouseEvent evt){
	}
	
	public void mouseClicked(MouseEvent evt){
	}
	
	public static void main(String args[]){
	new MouseCounter();
	}

}
