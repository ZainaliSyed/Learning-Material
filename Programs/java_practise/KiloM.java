
import java.awt.event.*;
import javax.swing.*;


class KiloM implements ActionListener{
	
	JFrame f = new JFrame("Converter ");
	JLabel head = new JLabel("Converter Kilo To Mile ");
	JLabel l1 = new JLabel("Enter Kilogram : ");
	JTextField tf1 = new JTextField();
	
	JLabel l2 = new JLabel("Miles : ");
	JTextField tf2 = new JTextField();
	
	JButton b1 = new JButton("Calculate");
	JButton b2 = new JButton("About");
	JButton b3 = new JButton("Clear");
	JButton b4 = new JButton("Exit");
	
	
	KiloM(){
		f.setBounds(100,50,500,500);
		f.setLayout(null);
		
		head.setBounds(100,50,200,30);
		f.add(head);
		
		l1.setBounds(20,100,100,30);
		f.add(l1);
		
		tf1.setBounds(150,100,100,30);
		f.add(tf1);
		
		l2.setBounds(20,150,100,30);
		f.add(l2);
		
		tf2.setBounds(150,150,100,30);
		f.add(tf2);
		
		
		b1.setBounds(50,250,100,30);
		f.add(b1);
		b1.addActionListener(this);
		
		b2.setBounds(140,250,80,30);
		f.add(b2);
		b2.addActionListener(this);
		
		b3.setBounds(220,250,80,30);
		f.add(b3);
		b3.addActionListener(this);
		
		b4.setBounds(300,250,80,30);
		f.add(b4);
		b4.addActionListener(this);
		
		
		f.setVisible(true);
	}
	public static void main(String args[]){
		new KiloM();
	}
	
		public void actionPerformed(ActionEvent evt ){
			if(evt.getSource()==b1){
				String val = tf1.getText();
				int num = Integer.parseInt(val);
				
				int kilo = num*1000;
				
				tf2.setText(kilo+"");
			}
			
			else if(evt.getSource()==b2){
				JOptionPane.showMessageDialog(null,"\t Programmer \n Name : Syed Zain Ali \n Study : BSCS");
			}
			
			else if(evt.getSource()==b3){
				tf1.setText("");
				tf2.setText("");
			}
			
			else if(evt.getSource()==b4){
				System.exit(0);
			}
		}
	

}// end of main 