import java.awt.*;
import java.awt.event.*;
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
	b1.addActionListener(this);
	
	
	b2.setBounds(50,100,100,30);
	add(b2);
	b2=new Button("Blue");
	b2.addActionListener(this);

	
	b3.setBounds(50,150,100,30);
	add(b3);
	b3=new Button("Green");
	b3.addActionListener(this);
	
	setVisible(true);
  }//end constructor

public static void main(String args[]){

BtnPress ob=new BtnPress();

  }

	public void actionPerformed(ActionEvent e){
		Object ob = e.getSource();

		if(ob == b1){
//System.out.println("Red");
		setBackground(Color.red);
		}

		if(ob == b2){
			System.out.println("Blue");
		}
		if(ob == b3){
			System.out.println("Green");
		}

	}

}