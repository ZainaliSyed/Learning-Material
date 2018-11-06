import javax.swing.*;
import java.awt.event.*;
class Framewidth implements ActionListener{
JFrame f=new JFrame();
JButton b1=new JButton("Width ++");
JButton b2=new JButton("Width --");
int x=400;

	Framewidth(){
	
		f.setLayout(null);
		f.show();
		f.setBounds(10,10,400,500);
		
						
		f.add(b1);
		f.add(b2);
		
		b1.setBounds(50,100,50,50);
		b2.setBounds(50,100,50,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt){
	Object ob =evt.getSource();
	if(ob==b1){
	x=x+50;
	f.setBounds(10,10,x,500);
	}
}
	
	public static void main(String args[]){
		new Framewidth();
	}
	
	
	
}
	
	
	