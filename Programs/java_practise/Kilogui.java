import java.awt.event.*;
import javax.swing.*;

class Kilogui implements ActionListener{
		
		JFrame f = new JFrame("Converter ");
		JLabel head = new JLabel("Converter For Km To Meter ");
		JLabel l1 = new JLabel("Enter Km : ");
		JTextField tf1 = new JTextField();
		
		JLabel l2 = new JLabel("Meter : ");
		JTextField tf2 = new JTextField();
		
		JButton b1 = new JButton("Calculate");
		JButton b2 = new JButton("About");
		JButton b3 = new JButton("Clear");
		JButton b4 = new JButton("Exit");
		
		Kilogui(){
			
			f.setBounds(0,0,500,500);
			f.setLayout(null);
			
			
			head.setBounds(100,30,200,30);
			f.add(head);
			
			l1.setBounds(10,80,80,30);
			f.add(l1);
			
			tf1.setBounds(100,80,100,30);
			f.add(tf1);
			
			l2.setBounds(10,140,80,30);
			f.add(l2);
			
			tf2.setBounds(100,140,100,30);
			f.add(tf2);
			
			
			b1.setBounds(50,200,100,30);
			f.add(b1);
			b1.addActionListener(this);
			
			b2.setBounds(160,200,80,30);
			f.add(b2);
			b2.addActionListener(this);
			
			b3.setBounds(250,200,80,30);
			f.add(b3);
			b3.addActionListener(this);
			
			b4.setBounds(350,200,80,30);
			f.add(b4);
			b4.addActionListener(this);
			
			
			
			
			f.setVisible(true);
		}
	public static void main(String args[]){
		new Kilogui();
	}
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()==b1){
			String val=tf1.getText();
			int num=Integer.parseInt(val);
			int met=num*1000;


			tf2.setText(met+"");
			
		}
		else if(evt.getSource()==b2){
			JOptionPane.showMessageDialog(null,"\t Programmer \n Name : Syed Zain Ali \n Study : BSCS  ");
		}
		
		else if(evt.getSource()==b3){
			tf1.setText("");
			tf2.setText("");
		}
		
		else if(evt.getSource()==b4){
			System.exit(0);
		}
		
		
	}
}//end of class