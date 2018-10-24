import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ArfinPuzzle implements ActionListener{
	
	
	JFrame  frame = new JFrame();
	
	JButton b1 = new JButton("btn1");
	JButton b2 = new JButton("btn2");
	JButton b3 = new JButton("btn3");
	JButton b4 = new JButton("btn4");
	JButton b5 = new JButton("btn5");
	JButton b6 = new JButton("btn6");
	JButton b7 = new JButton("btn7");
	JButton b8 = new JButton("btn8");
	JButton b9 = new JButton("btn9");
	JButton b10 = new JButton("btn10");
	JButton b11 = new JButton("btn11");
	JButton b12 = new JButton("btn12");
	JButton b13 = new JButton("btn13");
	JButton b14 = new JButton("btn14");
	JButton b15 = new JButton("btn15");
	JButton b16 = new JButton("");
	
	ArfinPuzzle(){
	frame.setLayout(new GridLayout(4,4));
	frame.setSize(400,400);
	frame.setVisible(true);
	
	
	frame.add(b1);
	b1.addActionListener(this);
	frame.add(b2);
	b2.addActionListener(this);
	frame.add(b3);
	b3.addActionListener(this);
	frame.add(b4);
	b4.addActionListener(this);
	frame.add(b5);
	b5.addActionListener(this);
	frame.add(b6);
	b6.addActionListener(this);
	frame.add(b7);
	b7.addActionListener(this);
	frame.add(b8);
	b8.addActionListener(this);
	frame.add(b9);
	b9.addActionListener(this);
	frame.add(b10);
	b10.addActionListener(this);
	frame.add(b11);
	b11.addActionListener(this);
	frame.add(b12);
	b12.addActionListener(this);
	frame.add(b13);
	b13.addActionListener(this);
	frame.add(b14);
	b14.addActionListener(this);
	frame.add(b15);
	b15.addActionListener(this);
	frame.add(b16);
	b16.addActionListener(this);
	
	
	
	
	
	
	
	
	}
	
	public void actionPerformed(ActionEvent evt){
	
	Object ob = evt.getSource();
	
	if(ob==b15 && b16.getText().equals("")){
	b16.setText(b15.getText());
	b15.setText("");
	}
	
	}
	
	public static void main(String args[]){
	new ArfinPuzzle();
	}
	
}