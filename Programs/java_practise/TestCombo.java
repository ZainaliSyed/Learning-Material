import javax.swing.*;
import java.awt.event.*;
class TestCombo implements ActionListener{
		JFrame frm=new JFrame("New Frame");
		JComboBox com=new JComboBox();
		JButton bb=new JButton("click");
		TestCombo(){
			frm.setLayout(null);
			frm.setBounds(0,0,500,500);
			com.setBounds(50,80,200,30);
			bb.setBounds(50,120,80,35);
			
			frm.add(com);
			frm.add(bb);
			bb.addActionListener(this);

			frm.show();
		}//end of const
		public static void main(String arg[]){
			new TestCombo();
		}
		public void actionPerformed(ActionEvent ev){
				Object ob=ev.getSource();
				if(ob==bb){
					com.removeAllItems();
					for(int i=1;i<=10;i++){
						com.addItem("Zain Ali i="+i);
					}
				
				}
			
			
		}

}//end of class