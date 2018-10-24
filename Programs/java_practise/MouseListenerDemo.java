import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MouseListenerDemo implements MouseListener{
	JFrame f=new JFrame();
	JButton b1=new JButton();
	JButton b2=new JButton();
	int count=-1;
	
	MouseListenerDemo(){
		f.addMouseListener(this);
		f.setSize(500,500);
		f.show();
		//f.add(b1);
		//f.add(b2); */

	}
public void mouseEntered(MouseEvent evt){
	count++;		
	
	if(count==0){
		f.getContentPane().setBackground(Color.black);
	}
	if(count==1){
		f.getContentPane().setBackground(Color.blue);
	}
	if(count==2){
		f.getContentPane().setBackground(Color.pink);
	}
	if(count==3){
		f.getContentPane().setBackground(Color.green);
	}
	if(count==3){
	count=-1;
	}
		
}
public void mouseExited(MouseEvent evt){
	/*
	count++;	
		
	if(count==0){
		f.getContentPane().setBackground(Color.black);
	}
	if(count==1){
		f.getContentPane().setBackground(Color.blue);
	}
	if(count==2){
		f.getContentPane().setBackground(Color.pink);
	}
	if(count==3){
		f.getContentPane().setBackground(Color.green);
	}
	if(count==3){
	count=-1;
	}
	*/
}
public void mousePressed(MouseEvent evt){
	//System.out.println("PRESSED");
	//f.getContentPane().setBackground(Color.blue);
		
}
public void mouseReleased(MouseEvent evt){
	//System.out.println("RELEASED");
	//f.getContentPane().setBackground(Color.pink);
		
}
public void mouseClicked(MouseEvent evt){
	//System.out.println("CLICKED");
		
}

public static void main(String arg[]){
	new MouseListenerDemo();
	}
}