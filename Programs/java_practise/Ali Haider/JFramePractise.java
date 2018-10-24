import java.awt.event.*;
import javax.swing.*;
class JFramePractise implements ActionListener{
	
	int x= 0;
	JFrame f  = new JFrame("Ali");
	JLabel l1  = new JLabel("Enter Name : ");
	JTextField tf1  = new JTextField();
	
	JButton b1  = new JButton("Action Perform");
	JButton b2  = new JButton("Al1");
	JFramePractise(){
		
		f.setLayout(null);
		f.setVisible(true);
		f.setBounds(50,10,700,700); // X , Y , width ,Height
		
		f.add(l1);
		l1.setBounds(10,80,80,30);
		
		f.add(tf1);
		tf1.setBounds(100,80,100,50);
		
		 f.add(b1);
		b1.setBounds(100,200,100,50);
		b1.addActionListener(this);
		
		f.add(b2);
		b2.setBounds(250,200,100,50);
		b2.addActionListener(this);	
		
	}
	
	
		public void actionPerformed(ActionEvent evt){
			Object ob =evt.getSource();
			if(ob==b1){
			x=x+50;
			f.setBounds(10,10,x,500);
			System.out.println("Hello");
			tf1.setText(""+x);
		}
		
		if(ob==b2){
			x=x-50;
			f.setBounds(10,10,x,500);
			System.out.println("Hello");
			tf1.setText(""+x);
		}
		
	}
	
	
	public static void main(String args[]){
		new JFramePractise();
	}//end of main
	
}