import javax.swing.*;
import java.awt.event.*;
class TypeingTutor{
	
	
	JFrame f =new JFrame("Hello typing ");
	
	JLabel l1 = new JLabel("I love Pakistan ");
	JTextField tf1 = new JTextField();
	
	JLabel l2 = new JLabel("My Name is Syed Zain Ali ");
	JTextField tf2 = new JTextField();


	JLabel l3 = new JLabel("My Father Name is Syed rizwan Ali ");
	JTextField tf3 = new JTextField();	
	
	
	TypeingTutor(){
		
		f.setBounds(0,0,700,700);
		f.setLayout(null);
		
		
		l1.setBounds(10,20,200,30);
		f.add(l1);
		
		tf1.setBounds(10,50,200,30);
		f.add(tf1);
		
		l2.setBounds(10,150,200,30);
		f.add(l2);
		
		tf2.setBounds(10,200,200,30);
		f.add(tf2);
		
		l3.setBounds(10,300,200,30);
		f.add(l3);
		
		tf3.setBounds(10,350,200,30);
		f.add(tf3);
		
		f.show();
		
	}
	
	
	public static void main(String args[]){
		new TypeingTutor();
		
	}
}