import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

	class PuzzleGame /*extends JFrame */ implements ActionListner {
	
	JFrame frame = new JFrame();
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn10 = new JButton("10");
	JButton btn11 = new JButton("11");
	JButton btn12 = new JButton("12");
	JButton btn13 = new JButton("13");
	JButton btn14 = new JButton("14");
	JButton btn15 = new JButton("15");
	JButton btn16 = new JButton("16");
	
	PuzzleGame(){
	
	//this.setLayout(new GridLayout(4,4)); 
	
	frame.setLayout(new GridLayout(4,4));	
	
	frame.setBounds(0,0,400,400);
	//this.setBounds(0,0,400,400);
	
	frame.add(btn1);
	frame.add(btn2);
	frame.add(btn3);
	frame.add(btn4);
	frame.add(btn5);
	frame.add(btn6);
	frame.add(btn7);
	frame.add(btn8);
	frame.add(btn9);
	frame.add(btn10);
	frame.add(btn11);
	frame.add(btn12);
	frame.add(btn13);
	frame.add(btn14);
	frame.add(btn15);
	frame.add(btn16);
	frame.setVisible(true);
	frame.show();
	frame.setSize(400,400);
	/*
	this.add(btn1);
	this.add(btn2);
	this.add(btn3);
	this.add(btn4);
	this.add(btn5);
	this.add(btn6);
	this.add(btn7);
	this.add(btn8);
	this.add(btn9);
	this.add(btn10);
	this.add(btn11);
	this.add(btn12);
	this.add(btn13);
	this.add(btn14);
	this.add(btn15);
	this.add(btn16);
	
	
	setVisible(true);
	*/
	
	}
	
	
	/*public void actionPerformed(ActionEvent evt){
	object ob = evt.getSource();
	} */
	
	
	public static void main(String args[]){
	//Scanner ob = new Scanner(System.in);
	new  PuzzleGame();
	}
	}