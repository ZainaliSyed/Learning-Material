import javax.swing.*;
import java.awt.event.*;
class ComboInvertRight  extends JFrame implements ActionListener{
	
	JFrame f = new JFrame("Combo Box Invert Right");
	
	JLabel l1 =new JLabel("Enter a Number : ");
	JTextField tf1 = new JTextField();
	
	JButton b1 =new JButton("calculate");
	JComboBox com =new JComboBox();
	
	ComboInvertRight(){
		
		setBounds(0,0,700,700);
		setLayout(null);
		
		l1.setBounds(10,20,100,50);
		add(l1);
		
		tf1.setBounds(150,20,100,50);
		add(tf1);
		
		b1.setBounds(100,150,100,50);
		add(b1);
		b1.addActionListener(this);
		
		com.setBounds(200,300,200,100);
		add(com);
		
		
		
		show();
		
		
	}
	

		public void actionPerformed(ActionEvent evt){
			
			Object ob =evt.getSource();
			if(ob==b1){
			
				String val =tf1.getText();
				int num =Integer.parseInt(val);
			
				for(int i=0; i<num;i++){
					String str= "";
					String sp= "";
					
					for(int j=num-i; j>=1; j--){
					
						str=str+j+" ";
					}
					
					//for(int k=0; k<=i; k++){
					//	sp =sp+" ";
					//}
					com.addItem(str+"\n"+sp);
				}//end of for 
			}
		}//end of action 
	
	
	public static void main(String args[]){
			new ComboInvertRight();
	}//end of main
	
	
}//end of class 