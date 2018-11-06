import java.awt.*;
import javax.swing.*;
public class GuiTest{
	
	JFrame f ;
	public void initGui(){
		
		f = new JFrame("First Frme");
		
		Container c  = f.getContentPane();
		c.setLayout(new FlowLayout());
		JTextField tf =new JTextField(10);
		JButton b1 = new JButton("Button ");
		
		c.add(tf);
		c.add(b1);
		
		f.setSize(200,200);
		f.setVisible(true);
		
	}//end of method 
	
	public GuiTest(){
		initGui();
	}
	
	public static void main(String args[]){
		GuiTest gui = new GuiTest();
	}
}