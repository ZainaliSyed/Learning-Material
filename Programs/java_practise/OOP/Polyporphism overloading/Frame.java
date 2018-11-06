import java.awt.*;
import java.util.*;
class Frame{
	
	Frame f = new Frame("Frame ");
	
	Frame(){
		
		f,setLayout(null);
		f.setBounds(0,0,300,300);
		f.setVisible(true);
		f.show();
	}
	
	public static void main(String args[]){
		new Frame();
	}
	
}//end of class 