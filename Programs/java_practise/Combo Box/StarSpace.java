import javax.swing.*;
import java.awt.event.*;
class StarSpace implements ActionListener{
	
	
	JFrame f =new JFrame("Combo Invert Right ");
	JLabel l1 = new JLabel("Enter Number : ");
	JTextField tf1 = new JTextField();
	
	JButton b1 = new JButton("Calculate ");
	
	JComboBox com = new JComboBox();
	
	StarSpace(){
	
	f.setBounds(0,0,700,700);
	f.setLayout(null);
	
	
	l1.setBounds(20,50,100,30);
	f.add(l1);
	
	tf1.setBounds(150,50,100,30);
	f.add(tf1);
	
	b1.setBounds(200,150,100,30);
	f.add(b1);
	b1.addActionListener(this);

	com.setBounds(200,300,300,50);
	f.add(com);
	
	
	
		
	f.show();
		
	}
	
	
	public void actionPerformed(ActionEvent evt ){
		Object ob = evt.getSource();
		
		if(ob==b1){
			
			com.removeAllItems();
			String val = tf1.getText();
			int num = Integer.parseInt(val);
			
			
			for(int i=1; i<=num; i++){
				String ss="";
				String sp="";
				
				for(int j=1; j>=num-i; j++){
					sp =sp+" ";
				} 
				
				for(int k=1; k<=i; k++){
					ss=ss+k;
				}
				
				com.addItem(ss+"\n");
				
			}//end for 
			
			com.addItem("Star program");
			
		}
		
	}//end of action 
	
	public static void main(String args[]){
		new StarSpace();
	}
}