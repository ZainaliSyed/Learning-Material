import java.awt.event.*;
import javax.swing.*;

class Metergui implements ActionListener{
	JFrame f = new JFrame("Converter ");
	JButton calBtn = new JButton("Calculate");
	JButton AbtBtn = new JButton("About ");
	JButton ClrBtn = new JButton("Clear ");
	JButton ExtBtn = new JButton("Exit ");
	
	JLabel headLb = new JLabel("Converter Cm To Meter "); 
	JLabel l1 = new JLabel("Enter Cm : ");
	JLabel l2 = new JLabel("Meter : ");
	
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	
		Metergui(){
			f.setLayout(null);
			f.setBounds(0,0,500,500);
			
			headLb.setBounds(170,50,300,50);
			f.add(headLb);
			
			l1.setBounds(20,100,80,50);
			f.add(l1);
			
			tf1.setBounds(100,110,200,30);
			f.add(tf1);
			
			l2.setBounds(20,180,80,50);
			f.add(l2);
			
			tf2.setBounds(100,180,200,30);
			f.add(tf2);
			
			calBtn.setBounds(50,250,100,50);
			f.add(calBtn);
			calBtn.addActionListener(this);
			
			AbtBtn.setBounds(150,250,80,50);
			f.add(AbtBtn);
			AbtBtn.addActionListener(this);
			
			ClrBtn.setBounds(230,250,80,50);
			f.add(ClrBtn);
			ClrBtn.addActionListener(this);
			
			ExtBtn.setBounds(320,250,80,50);
			f.add(ExtBtn);
			ExtBtn.addActionListener(this);
			
			f.show();
		
		}
	
	public static void main(String args[]){
		new Metergui();		
	}// End of  main 
	
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()==calBtn){
			String val = tf1.getText();
			int num = Integer.parseInt(val);
			
			float meter = num/100f;
			tf2.setText(meter+"");
			
		}
		
		if(evt.getSource()==AbtBtn){
			JOptionPane.showMessageDialog(null,"HEllo I am Syed Zain ALi \n I Study In BSCS \n Program Made by BSCS");
		}
		
		if(evt.getSource()==ClrBtn){
			tf1.setText("");
			tf2.setText("");
		}
		if(evt.getSource()==ExtBtn){
			System.exit(0);
		}
		
		
	}// end of action 
	
}//end of class 