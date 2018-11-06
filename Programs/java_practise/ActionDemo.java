import java.awt.*;
import java.awt.event.*;
class ActionDemo extends Frame{

Button b1;
Button b2;
Button b3;

ActionDemo(){

setLayout(null);
setBounds(0,0,500,500);

b1=new Button("Red");
b2=new Button("Green");
b3=new Button("blue");

b1.setBounds(50,50,50,50);
b2.setBounds(100,50,50,50);
b3.setBounds(150,50,50,50);

add(b1);
add(b2);
add(b3);

setVisible(true);


  }//end of constructor
public static void main(String args[]){

ActionDemo ob=new ActionDemo();

  }
}

