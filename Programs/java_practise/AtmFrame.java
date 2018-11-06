import javax.swing.*;
class AtmFrame{
public static void main(String args[]){

JFrame frame=new JFrame();
frame.setLayout(null);
frame.setBounds(80,50,700,700);


JLabel lab=new JLabel("Enter your Amount here :");
frame.add(lab);
lab.setBounds(0,20,200,40);

JTextField tf=new JTextField();
frame.add(tf);
tf.setBounds(150,20,200,40);

JButton btn1=new JButton("Cash Detail ");
frame.add(btn1);
btn1.setBounds(30,100,150,30);

JLabel lab1=new JLabel("5000 :");
frame.add(lab1);
lab1.setBounds(10,150,100,40);

JTextField tf1=new JTextField();
frame.add(tf1);
tf1.setBounds(100,160,150,30);

JLabel lab2=new JLabel("1000 :");
frame.add(lab2);
lab2.setBounds(10,200,100,40);

JTextField tf2=new JTextField();
frame.add(tf2);
tf2.setBounds(100,205,150,30);


JLabel lab3=new JLabel("500 :");
frame.add(lab3);
lab3.setBounds(10,250,100,40);

JTextField tf3=new JTextField();
frame.add(tf3);
tf3.setBounds(100,250,150,30);


JLabel lab4=new JLabel("100 :");
frame.add(lab4);
lab4.setBounds(10,300,100,40);

JTextField tf4=new JTextField();
frame.add(tf4);
tf4.setBounds(100,300,150,30);


JLabel lab5=new JLabel("50 :");
frame.add(lab5);
lab5.setBounds(10,350,100,40);

JTextField tf5=new JTextField();
frame.add(tf5);
tf5.setBounds(100,350,150,30);


JLabel lab6=new JLabel("20 :");
frame.add(lab6);
lab6.setBounds(10,400,100,40);

JTextField tf6=new JTextField();
frame.add(tf6);
tf6.setBounds(100,400,150,30);


JLabel lab7=new JLabel("10 :");
frame.add(lab7);
lab7.setBounds(10,450,100,40);

JTextField tf7=new JTextField();
frame.add(tf7);
tf7.setBounds(100,450,150,30);

JLabel lab8=new JLabel("2 :");
frame.add(lab8);
lab8.setBounds(10,500,100,40);

JTextField tf8=new JTextField();
frame.add(tf8);
tf8.setBounds(100,500,150,30);


JLabel lab9=new JLabel("1 :");
frame.add(lab9);
lab9.setBounds(10,550,100,40);

JTextField tf9=new JTextField();
frame.add(tf9);
tf9.setBounds(100,550,150,30);
frame.show();
}
}