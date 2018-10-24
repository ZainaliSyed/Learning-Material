import javax.swing.*;
class NestedFrame{
public static void main(String args[]){
JFrame frame1=new JFrame();
frame1.setBounds(100,0,800,700);
frame1.setTitle("Frame 1");
//frame1.setBackground(Color.blue);
frame1.show();

JFrame frame2=new JFrame();
frame2.setBounds(140,30,700,650);
frame2.setTitle(" Frame 2");
frame2.show();

JFrame frame3=new JFrame();
frame3.setBounds(200,70,550,550);
frame3.setTitle("Frame 3");
frame3.show();

JFrame frame4=new JFrame();
frame4.setBounds(250,100,450,400);
frame4.setTitle("Frame 4");
frame4.show();
}
}