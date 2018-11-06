import java.awt.event.*;
import javax.swing.*;

class MileK implements ActionListener{
	
	JFrame f = new JFrame("Converter ");
	JLabel head = new JLabel("Converter For Mile To Km ");
	JLabel l1 = new JLabel("Enter Mile : ");
	JTextField tf1 = new JTextField();
	
	JLabel l2 = new JLabel("KiloMeter : ");
	JTextField tf2 = new JTextField();
	
	JButton b1 = new JButton("Calculator");
	JButton b2 = new JButton("About");
	JButton b3 = new JButton("Clear");
	JButton b4 = new JButton("Exit");
	
	MileK(){
		
		f.setBounds(0,0,500,500);
		f.setLayout(null);
		
		head.setBounds(100,50,200,50);
		f.add(head);
		
		l1.setBounds(20,100,100,30);
		f.add(l1);
		
		tf1.setBounds(150,100,100,30);
		f.add(tf1);
		
		l2.setBounds(20,150,100,30);
		f.add(l2);
		
		tf2.setBounds(150,150,100,30);
		f.add(tf2);
		
		b1.setBounds(50,200,100,50);
		f.add(b1);
		b1.addActionListener(this);
		
		b2.setBounds(150,200,80,50);
		f.add(b2);
		b2.addActionListener(this);
		
		b3.setBounds(220,200,80,50);
		f.add(b3);
		b3.addActionListener(this);
		
		b4.setBounds(300,200,80,50);
		f.add(b4);
		b4.addActionListener(this);
		
		f.setVisible(true);
	}
	
	public static void main(String args[]){
		new MileK();	
	}
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()==b1){
			String val =tf1.getText();
			int num = Integer.parseInt(val);
			
			int kilo =num*40;
			tf2.setText(kilo+"");
			
		}
		
		else if(evt.getSource()==b2){
			JOptionPane.showMessageDialog(null,"Hello zain here \n from Bscs ");
		}
		
		else if(evt.getSource()==b3){
			tf1.setText("");
			tf2.setText("");
		}
		
		else if(evt.getSource()==b4){
			System.exit(0);
		}
		
		
		
	}//end of action listner
	
}