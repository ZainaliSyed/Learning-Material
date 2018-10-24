import java.util.*;
import javax.swing.*;
import java.awt.*;

class CarGame{
	JFrame f = new JFrame();
	JLabel l1 = new JLabel(new ImageIcon("1.gif"));
	JLabel l2 = new JLabel(new ImageIcon("2.gif"));
	JLabel l3 = new JLabel(new ImageIcon("3.gif"));
	JLabel l4 = new JLabel(new ImageIcon("6.gif"));
	
	CarGame(){
	
	f.show();
	f.setSize(200,150);
	f.setVisible(true);
	f.setLayout(null);
	
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	
	l1.setBounds(0,0,200,150);
	l2.setBounds(0,0,200,150);
	l3.setBounds(0,0,200,150);
	l4.setBounds(0,0,200,150);
	
	
	while(true)	{
	l1.setLocation(l1.getX()-1,0);
	l2.setLocation(l2.getX()-1,0);
	l3.setLocation(l3.getX()-1,0);
	l4.setLocation(l4.getX()-1,0);
	
	if(l1.getX()<=-200){
	l1.setLocation(603,0);
	}
	if(l2.getX()<=-200){
	l2.setLocation(603,0);
	}
	if(l3.getX()<=-200){
	l3.setLocation(603,0);
	}
	if(l4.getX()<=-200){
	l4.setLocation(603,0);
	}
	
	/*for(int i=0; i<=100; i++){
	System.out.print(""+i);
	} */
	
	} //end of while
	
	}
	
	public static void main(String args[]){
	
	new CarGame();
	}
}