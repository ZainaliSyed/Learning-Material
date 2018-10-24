import javax.swing.*;
import java.awt.event.*;
class Booleans implements ActionListener{

boolean b;
JFrame f =new JFrame();
JButton b1 =new JButton("ok ");

Booleans(){

	f.setLayout(null);
	f.show();
	f.setSize(500,500);
	f.setVisible(true);
	

	b1.setBounds(50,50,100,50);
	f.add(b1);
	b1.addActionListener(this);
	
	
}

	public void actionPerformed(ActionEvent evt){
	Object ob = evt.getSource();
	if(ob==b1){
	
	f.setTitle(""+b);
	b1.setText("cancel"+b);
	b1.setText("ok"+b);
	b=!b;
	}
	
}
	public static void main (String args[]){
	new  Booleans();
	}
}