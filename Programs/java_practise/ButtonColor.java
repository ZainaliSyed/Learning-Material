import java.awt.*;
import java.awt.*;
class BtnPress extends Frame implements ActionListener{

Button b1;
Button b2;
Button b3;

BtnPress (){

	setLayout(null);
	setBounds(0,0,500,500);
	
	b1.setBounds(50,50,100,30);
	add(b1);
	b1=new Button("Red");
	
	
	b2.setBounds(50,100,100,30);
	add(b1);
	b1=new Button("Blue");

	
	b3.setBounds(50,150,100,30);
	add(b1);
	b1=new Button("Green");
	setVisible(true);
  }//end constructor

public static void main(String args[]){

BtnPress ob=new BtnPress();

  }

}