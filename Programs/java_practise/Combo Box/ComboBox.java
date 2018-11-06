import javax.swing.*;
import java.awt.event.*;


class ComboBox implements ActionListener{
	
		JFrame f = new JFrame("Combo Bob Table ");
		JLabel tablb = new JLabel("Table No : ");
		JTextField tf1 =new JTextField();
		
		JLabel countlb = new JLabel("Count : ");
		JTextField tf2 = new JTextField();
		
		JComboBox com = new JComboBox();
		JButton b1 =new JButton("Click ");
		JButton b2 =new JButton("Clear ");

			ComboBox(){
				f.setBounds(0,0,500,500);
				f.setLayout(null);
				
				tablb.setBounds(20,50,100,30);
				f.add(tablb);
				
				tf1.setBounds(100,50,100,30);
				f.add(tf1);
				
				countlb.setBounds(20,100,100,30);
				f.add(countlb);
				
				tf2.setBounds(100,100,100,30);
				f.add(tf2);
				
				
				com.setBounds(100,150,100,50);
				f.add(com);
				
				b1.setBounds(50,250,80,30);
				f.add(b1);
				b1.addActionListener(this);
				
				b2.setBounds(150,250,80,30);
				f.add(b2);
				b2.addActionListener(this);
				
				
				f.show();
			}
	
	public void actionPerformed(ActionEvent evt){
		Object ob = evt.getSource();
		
			if(ob==b1){
				
				String val1 = tf1.getText();
				int table = Integer.parseInt(val1);
				
				String val2 = tf2.getText();
				int count = Integer.parseInt(val2);
				
				com.removeAllItems();
				
				for(int i=1; i<=table; i++){
					
					for(int j=1; j<=count; j++){
						com.addItem(i+"x "+j+" = "+i*j);
					}
					
					com.addItem(" ");
				}
				
				
			}
			
			else if(ob==b2){
				tf1.setText("");
				tf2.setText("");
				
				com.removeAllItems();
				
			}//end of b2
	}// end of action 
	
	public static void main(String args[]){
		new ComboBox();
	}
}