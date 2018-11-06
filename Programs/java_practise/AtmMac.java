import javax.swing.*;
import java.awt.event.*;
class AtmMac extends JFrame implements ActionListener{

JLabel lab;
JTextField tf;

JButton btn;

JLabel lab1;
JTextField tf1;

JTextField tf2;
JLabel lab2;
JTextField tf3;
JLabel lab3;
JTextField tf4;
JLabel lab4;
JTextField tf5;
JLabel lab5;
JTextField tf6;
JLabel lab6;
JTextField tf7;
JLabel lab7;
JTextField tf8;
JLabel lab8;
JTextField tf9;
JLabel lab9;





AtmMac(){
	
	setBounds(10,10,900,900);		
	setLayout(null);

	lab= new JLabel("please enter the Amount :");
	lab.setBounds(10,10,200,50);
	add(lab);
	
	tf = new JTextField();
	tf.setBounds(200,10,200,50);
	add(tf);
	
	btn = new JButton("Cash Detail ");
	btn.setBounds(50,80,200,50);
	add(btn);	
	btn.addActionListener(this);


	lab1 = new JLabel("5000 :");
	lab1.setBounds(10,150,200,30);
	add(lab1);
	
	tf1 = new JTextField();
	tf1.setBounds(200,150,200,30);
	add(tf1);
	


	lab2 = new JLabel("1000 :");
	lab2.setBounds(10,200,200,30);
	add(lab2);
	
	tf2 = new JTextField();
	tf2.setBounds(200,200,200,30);
	add(tf2);


	
	lab3 = new JLabel("500 :");
	lab3.setBounds(10,250,200,30);
	add(lab3);
	
	tf3 = new JTextField();
	tf3.setBounds(200,250,200,30);
	add(tf3);

	
	lab4 = new JLabel("100 :");
	lab4.setBounds(10,300,200,30);
	add(lab4);
	
	tf4 = new JTextField();
	tf4.setBounds(200,300,200,30);
	add(tf4);


	lab5 = new JLabel("50 :");
	lab5.setBounds(10,350,200,30);
	add(lab5);
	
	tf5 = new JTextField();
	tf5.setBounds(200,350,200,30);
	add(tf5);


	lab6 = new JLabel("20 :");
	lab6.setBounds(10,400,200,30);
	add(lab6);
	
	tf6 = new JTextField();
	tf6.setBounds(200,400,200,30);
	add(tf6);


	lab7 = new JLabel("10 :");
	lab7.setBounds(10,450,200,30);
	add(lab7);
	
	tf7 = new JTextField();
	tf7.setBounds(200,450,200,30);
	add(tf7);


	lab8 = new JLabel("2 :");
	lab8.setBounds(10,500,200,30);
	add(lab8);
	
	tf8 = new JTextField();
	tf8.setBounds(200,500,200,30);
	add(tf8);



	lab9 = new JLabel("1 :");
	lab9.setBounds(10,550,200,30);
	add(lab9);
	
	tf9 = new JTextField();
	tf9.setBounds(200,550,200,30);
	add(tf9);
	setVisible(true);
	}

	public static void main(String args[]){
	new AtmMac();

	 }

	public void actionPerformed(ActionEvent e){

	Object ob = e.getSource();
	String textbox1=tf.getText();
	int amount = Integer.parseInt(textbox1);



if(ob==btn){
int fiveThousand=amount/5000;
tf1.setText(""+fiveThousand);

int remFiveThousand=amount%5000;
int oneThousand=remFiveThousand/1000;
tf2.setText(""+oneThousand);

int remoneThousand=remFiveThousand%1000;
int fiveHundred=remoneThousand/500;
tf3.setText(""+fiveHundred);

int remFiveHundred=remoneThousand%500;
int onehunded=remFiveHundred/100;
tf4.setText(""+onehunded);

int remOneHunded=remFiveHundred%100;
int fifty=remOneHunded/50;
tf5.setText(""+fifty);

int remfifty=remOneHunded%50;
int twenty=remfifty/20;
tf6.setText(""+twenty);

int remtwenty=remfifty%20;
int ten=remtwenty/10;
tf7.setText(""+ten);

int remten=remtwenty%10;
int two=remten/2;
tf8.setText(""+two);

int remtwo=remten%2;
int one=remtwo/1;
tf9.setText(""+one);
}  

}
}