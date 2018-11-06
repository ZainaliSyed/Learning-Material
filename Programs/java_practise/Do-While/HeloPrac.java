import java.util.*;
import javax.swing.*;

	class HeloPrac{
		
		JFrame f =new JFrame("new frame ");
		JButton b1 = new JButton("submit");
		HeloPrac(){
			
			f.setLayout(null);
			f.setBounds(0,100,500,500);
			f.show();
			
			f.add(b1);
			b1.setBounds(100,100,100,50);
		}
		
		public static void main(String args[]){	
		System.out.println("Nousheen");	
		System.out.println("Bc120403427");
		new HeloPrac();
		}
	}