import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class AcctionDemo extends JFrame implements ActionListener{
	
	JButton b1  = new JButton(" Hello ");
	AcctionDemo(){
		
		setLayout(null);
		setBounds(0,0,500,500);
		
		b1.setBounds(100,100,200,200);
		add(b1);
		b1.addActionListener(this);
		
		setVisible(true);
	}//end of constructor 
		

		
		public static void main(String args[]){
			AcctionDemo ob = new AcctionDemo();
		}//end of main method 
		
		public void actionPerformed(ActionEvent e){
			Object ob = e.getSource();
			
			if(ob==b1){
				System.out.println("Hello I am Zain ..");
			}
			
		}//end of action 
		
}//end of class 