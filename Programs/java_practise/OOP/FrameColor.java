import java.awt.*;

class FrameColor extends Frame{
	Label l1 = new Label("Black ");
	FrameColor(){
		setLayout(null);
		setBounds(0,0,500,500);
		setVisible(true); 
	}
	
	
	FrameColor(int a){
		System.out.println("I am One arrgument ");
		setLayout(null);
		setBounds(0,0,500,500);
		setVisible(true); 
		setBackground(Color.black);
	}
	
	FrameColor(int a ,int b){
		System.out.println("I am two  arrgument ");
		setLayout(null);
		setBounds(0,0,500,500);
		setVisible(true); 
		setBackground(Color.blue);
	}	
	FrameColor(double b, int a){
		System.out.println("I Am three Argument ");
		setLayout(null);
		setBounds(0,0,500,500);
		setVisible(true);
		setBackground(Color.gray);
	}
	
	FrameColor(String b, int a){
		System.out.println("I am Fourth argument");
		setLayout(null);
		setBounds(0,0,500,500);
		setVisible(true);
		setBackground(Color.yellow);
	}
}//end of class 