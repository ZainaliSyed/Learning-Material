import javax.swing.*;
class SalleryFrame{
public static void main(String args[]){
JFrame frame=new JFrame();
frame.setLayout(null);
frame.setBounds(100,0,800,750);


JLabel lab1=new JLabel("enter your sallery :");
frame.add(lab1);
lab1.setBounds(0,0,200,100);

JTextField tf1=new JTextField();
tf1.setBounds(200,40,100,30);
frame.add(tf1);

JButton btn1=new JButton("Generate sallery");
btn1.setBounds(50,100,200,50);
frame.add(btn1);


JLabel lab2=new JLabel("Retirement :");
frame.add(lab2);
lab2.setBounds(0,170,100,30);

JTextField tf2=new JTextField();
frame.add(tf2);
tf2.setBounds(150,170,200,30);


JLabel lab3=new JLabel("Medical Tax :");
frame.add(lab3);
lab3.setBounds(0,203,100,30);

JTextField tf3=new JTextField();
frame.add(tf3);
tf3.setBounds(150,205,200,30);


JLabel lab4=new JLabel("Government Tax:");
frame.add(lab4);
lab4.setBounds(0,245,100,30);

JTextField tf4=new JTextField();
frame.add(tf4);
tf4.setBounds(150,245,200,30);

JLabel lab5=new JLabel("policy");
frame.add(lab5);
lab5.setBounds(0,280,100,30);

JTextField tf5=new JTextField();
frame.add(tf5);
tf5.setBounds(150,285,200,30);

JLabel lab6=new JLabel("House Rent");
frame.add(lab6);
lab6.setBounds(0,330,200,30);

JTextField tf6=new JTextField();
frame.add(tf6);
tf6.setBounds(150,330,200,30);



JLabel lab7=new JLabel("Your Net Sallery :");
frame.add(lab7);
lab7.setBounds(0,370,200,30);

JTextField tf7=new JTextField();
frame.add(tf7);
tf7.setBounds(150,370,200,30);

frame.show();



}
}