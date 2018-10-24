import javax.swing.*;
import java.awt.event.*;
class BasicPayF  extends JFrame implements ActionListener{

JLabel lab;
JTextField tf;

JButton btn;

JLabel lab1;
JTextField tf1;
JLabel lab2;
JTextField tf2;
JLabel lab3;
JTextField tf3;
JLabel lab4;
JTextField tf4;
JLabel lab5;
JTextField tf5;
JLabel lab6;
JTextField tf6;
JLabel lab7;
JTextField tf7;
JLabel lab8;
JTextField tf8;

BasicPayF(){
	
	setBounds(10,10,900,900);
	setLayout(null);

	
	lab = new JLabel("enter your sallery :");
	lab.setBounds(10,10,150,50);
	add(lab);

	
	tf = new JTextField();
	tf.setBounds(150,10,200,50);
	add(tf);

	btn = new JButton("Generate your Sallery");
	btn.setBounds(20,100,200,50);
	add(btn);
	btn.addActionListener(this);

	lab1 = new JLabel("House Rent 45%");
	lab1.setBounds(10,200,100,30);
	add(lab1);

	tf1 = new JTextField();
	tf1.setBounds(150,200,100,30);
	add(tf1);
	
	lab2 = new JLabel("Medical Allowance :");
	lab2.setBounds(10,250,150,30);
	add(lab2);
	
	tf2 = new JTextField();
	tf2.setBounds(150,250,100,30);
	add(tf2);
	
	lab3 = new JLabel("Bonus :");
	lab3.setBounds(10,300,100,30);
	add(lab3);
	
	tf3 = new JTextField();
	tf3.setBounds(150,300,100,30);
	add(tf3);
	
	lab4 = new JLabel("Gross Pay :");
	lab4.setBounds(10,350,100,30);
	add(lab4);

	tf4 = new JTextField();
	tf4.setBounds(150,350,100,30);
	add(tf4);

	lab5 = new JLabel("Income Tax :");
	lab5.setBounds(10,400,100,30);
	add(lab5);

	tf5 = new JTextField();
	tf5.setBounds(150,400,100,30);
	add(tf5);

	lab6= new JLabel("Zakat :");
	lab6.setBounds(10,450,100,30);
	add(lab6);

	tf6 = new JTextField();
	tf6.setBounds(150,450,100,30);
	add(tf6);
 


	lab7= new JLabel("Convince Allowance :");
	lab7.setBounds(10,500,150,30);
	add(lab7);

	tf7 = new JTextField();
	tf6.setBounds(170,500,100,30);
	add(tf7);


	lab8= new JLabel("Net Income :");
	lab8.setBounds(10,550,100,30);
	add(lab8);

	tf8 = new JTextField();
	tf6.setBounds(150,550,100,30);
	add(tf8);

	
	setVisible(true);
 	}


	public static void main(String args[]){
	new BasicPayF();
	}

	public void actionPerformed(ActionEvent e){
	
	Object ob=e.getSource();
	String textbox1 =tf.getText();
	int amount = Integer.parseInt(textbox1);	
	

	if(ob==btn){
	int houserent =(amount/100)*45;
	tf1.setText(""+houserent);
	
	int medical =(amount/100)*15;
	tf2.setText(""+medical);
	
	int bounus=(amount/100)*5;
	tf3.setText(""+bounus); 
	
	int grosspay = amount+houserent+medical+bounus;
	tf4.setText(""+grosspay);

	int incometax=(amount/100)*5;
	tf5.setText(""+incometax);
	
	int zakat=(amount/100)*3;
	tf6.setText(""+zakat);
	
	int vehicle=(amount/100)*8;
	tf7.setText(""+vehicle);
	
	int netpay=grosspay-incometax-zakat-vehicle;
	tf8.setText(""+netpay);
	}
	

	}

}