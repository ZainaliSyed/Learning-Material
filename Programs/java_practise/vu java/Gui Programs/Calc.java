import java.awt.*;
import javax.swing.*;
public class Calc{
	
	
	public void initGui(){
		
		JFrame f  = new JFrame("Calculator");
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		
		JButton bPlus = new JButton("+");
		JButton bMines = new JButton("-");
		JButton bMul = new JButton("*");
		JButton bDiv = new JButton("/");
		JButton bEqual = new JButton("=");
		JButton bCancel = new JButton("c");
		JButton bPoint = new JButton(".");
		
		JTextField tf = new JTextField();
		JLabel l1 = new JLabel("My Calulator ");
		
		JPanel pButton = new JPanel(new GridLayout(4,4));
		pButton.add(b1);
		pButton.add(b2);
		pButton.add(b3);
		pButton.add(bCancel);
		pButton.add(b4);
		pButton.add(b5);
		pButton.add(b6);
		pButton.add(bMul);
		pButton.add(b7);
		pButton.add(b8);
		pButton.add(b9);
		pButton.add(bMines);
		pButton.add(b0);
		pButton.add(bPoint);
		pButton.add(bPlus);
		pButton.add(bEqual);
		
		
		Container con = f.getContentPane();
		con.setLayout(new BorderLayout());
		
		con.add(tf,BorderLayout.NORTH);
		con.add(l1,BorderLayout.SOUTH);
		con.add(pButton,BorderLayout.CENTER);
		
		f.setSize(400,400);
		f.setVisible(true);
		
	}
	
	public Calc(){
		initGui();
	}
	
	public static void main(String args[]){
		Calc ob = new Calc();
	}
	
}