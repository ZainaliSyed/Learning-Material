import javax.swing.*;
class DemoFrame{
public static void main (String args[]){
JFrame frame=new JFrame();
frame.setLayout(null);
//frame.setBackground(Color.green);
frame.setBounds(0,0,500,500);

JButton button1=new JButton("hello");
frame.add(button1);
button1.setBounds(50,50,100,50);

JButton button2=new JButton("ok");
frame.add(button2);
button2.setBounds(100,100,200,50);

JLabel label1=new JLabel("test");
frame.add(label1);
JTextField tf=new JTextField();
frame.add(tf);
tf.setBounds(100,100,50,50);
 
frame.show();
}
}