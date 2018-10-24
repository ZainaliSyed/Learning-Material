import javax.swing.*;
import java.awt.event.*;
class Marksheet extends JFrame implements ActionListener{


JLabel lab1;
JTextField tf1;
JLabel lab2;
JTextField tf2;
JLabel lab3;
JTextField tf3;
JLabel lab4;
JTextField tf4;
JButton btn;
JLabel lab5;
JTextField tf5;
JLabel lab6;
JTextField tf6;
JLabel lab7;
JTextField tf7;
JLabel lab8;
JTextField tf8;

JButton btnclear;
JButton btnexit;

Marksheet(){

setBounds(10,10,700,700);
setLayout(null);


lab1 = new JLabel(" Maths :");
lab1.setBounds(10,50,100,30);
add(lab1);

tf1 = new JTextField();
tf1.setBounds(150,50,100,30);
add(tf1);

lab2 = new JLabel("Computer :");
lab2.setBounds(10,100,100,30);
add(lab2);

tf2 = new JTextField();
tf2.setBounds(150,100,100,30);
add(tf2);

lab3 = new JLabel("Chemistry :");
lab3.setBounds(10,150,100,30);
add(lab3);

tf3 = new JTextField();
tf3.setBounds(150,150,100,30);
add(tf3);


lab4= new JLabel("Physics :");
lab4.setBounds(10,200,100,30);
add(lab4);

tf4 = new JTextField();
tf4.setBounds(150,200,100,30);
add(tf4);


lab5 = new JLabel("English :");
lab5.setBounds(10,250,100,30);
add(lab5);

tf5 = new JTextField();
tf5.setBounds(150,250,100,30);
add(tf5);


btn =new JButton("Submit");
btn.setBounds(50,350,100,30);
add(btn);
btn.addActionListener(this);

lab6 = new JLabel("Percentage :");
lab6.setBounds(10,400,100,30);
add(lab6);

tf6 = new JTextField();
tf6.setBounds(150,400,100,30);
add(tf6);

lab7 = new JLabel(" Marks Obtain :");
lab7.setBounds(10,450,100,30);
add(lab7);

tf7 = new JTextField();
tf7.setBounds(150,450,100,30);
add(tf7);


lab8 = new JLabel("Total Marks :");
lab8.setBounds(10,500,100,30);
add(lab8);

tf8 = new JTextField();
tf8.setBounds(150,500,100,30);
add(tf8);
tf8.setText("500");


btnclear = new JButton("clear");
btnclear.setBounds(50,550,100,30);
add(btnclear);
btnclear.addActionListener(this);

btnexit = new JButton("exit");
btnexit.setBounds(200,550,100,30);
add(btnexit);
btnexit.addActionListener(this);


setVisible(true);
}
	public static void main(String args[]){
	new Marksheet();
	}

	public void actionPerformed(ActionEvent e){
	Object ob =e.getSource();
	String textbox1 = tf1.getText();
	String textbox2 = tf2.getText();
	String textbox3 = tf3.getText();
	String textbox4 = tf4.getText();
	String textbox5 = tf5.getText();

	int maths = Integer.parseInt(textbox1);
	int comp = Integer.parseInt(textbox2);
	int chem = Integer.parseInt(textbox3);
	int phy  = Integer.parseInt(textbox4);
	int eng  = Integer.parseInt(textbox5);

	if(ob==btn){
	int marks = maths+comp+chem+phy+eng;
	float percent = (marks*100)/500;
	tf7.setText(""+marks);
	tf6.setText(""+percent);
	}
	
	if(ob==btnclear){
	tf1.setText("");
	tf2.setText("");
	tf3.setText("");
	tf4.setText("");
	tf5.setText("");
	tf6.setText("");
	tf7.setText("");
	}
	
	if(ob==btnexit){
	System.exit(0);
	}
	
	
	}
}