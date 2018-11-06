//import javax.swing.*;
import java.awt.*;
class FrameRight{
public static void main(String args[]){
Frame frame1=new Frame();
frame1.setTitle("FRAME 1");
frame1.setBackground(Color.red);
frame1.setBounds(0,0,300,300);
frame1.setLayout(null);
frame1.show();

Frame frame2=new Frame();
frame2.setTitle("Frame 2");
frame2.setBounds(300,300,300,250);
frame2.setLayout(null);
frame2.setBackground(Color.green);
frame2.show();

Frame frame3=new Frame();
frame3.setTitle("Frame 3");
frame3.setLayout(null);
frame3.setBackground(Color.blue);
frame3.setBounds(600,550,200,200);
frame3.show();
} 
}