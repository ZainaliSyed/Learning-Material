import javax.swing.*;
import java.awt.event.*;
class ComboStar implements ActionListener{
	
		JFrame f = new JFrame("Star left Combo Box");
		JComboBox com = new JComboBox();
		JLabel l1 = new JLabel("Enter A Number : ");
		JTextField tf1 = new JTextField();
		
		JButton b1 = new JButton("Calculate ");
		
		
		
		ComboStar(){
			
			f.setBounds(0,0,600,600);
			f.setLayout(null);
			
			l1.setBounds(20,50,100,30);
			f.add(l1);
			
			tf1.setBounds(150,50,100,30);
			f.add(tf1);
			
			b1.setBounds(200,100,100,30);
			f.add(b1);
			b1.addActionListener(this);
			
			com.setBounds(100,200,300,50);
			f.add(com);
			
			
			
			f.show();
		}
		public void actionPerformed(ActionEvent evt){
			Object ob = evt.getSource();
			if(ob==b1){
				com.removeAllItems();
				String val1 = tf1.getText();
				int num = Integer.parseInt(val1);
				for(int i=1; i<=num; i++){
					String ss="";
					for(int j=1; j<=i; j++){
						ss=ss+j+" ";
					}
					com.addItem(ss+"\n");
				}//end of main for 
			}
		}//end of action 
	public static void main(String args[]){
		new ComboStar();
	}
}//