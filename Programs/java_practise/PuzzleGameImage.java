import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

	class PuzzleGameImage /*extends JFrame */ implements ActionListener{
	
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
	JButton btn16 = new JButton("");
	
	PuzzleGameImage(){
	
	//this.setLayout(new GridLayout(4,4)); 
	
		
	frame.setLayout(new GridLayout(4,4));
	
	//this.setBounds(0,0,400,400);
	
	frame.add(btn1);
	btn1.addActionListener(this);
	frame.add(btn2);
	btn2.addActionListener(this);
	frame.add(btn3);
	btn3.addActionListener(this);
	frame.add(btn4);
	btn4.addActionListener(this);
	frame.add(btn5);
	btn5.addActionListener(this);
	frame.add(btn6);
	btn6.addActionListener(this);
	frame.add(btn7);
	btn7.addActionListener(this);
	frame.add(btn8);
	btn8.addActionListener(this);
	frame.add(btn9);
	btn9.addActionListener(this);
	frame.add(btn10);
	btn10.addActionListener(this);
	frame.add(btn11);
	btn11.addActionListener(this);
	frame.add(btn12);
	btn12.addActionListener(this);
	frame.add(btn13);
	btn13.addActionListener(this);
	frame.add(btn14);
	btn14.addActionListener(this);
	
	btn15.addActionListener(this);
	frame.add(btn16);
	btn16.addActionListener(this);
	frame.add(btn15);
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
	
	
	setVisible(true); */

	
	}
		
		
		
	public void actionPerformed(ActionEvent evt){
	Object ob = evt.getSource();
	
		
				// Button 1 Two Posiblity 
		if(ob==btn1 && btn2.getText().equals("")){
		btn2.setText(btn1.getText());
		btn1.setText("");
		}
		if(ob==btn1 && btn5.getText().equals("")){
		btn5.setText(btn1.getText());
		btn1.setText("");
		}
				// Button 2 Three Posiblity 
		if(ob==btn2 && btn1.getText().equals("")){
		btn1.setText(btn2.getText());
		btn2.setText("");
		}
		if(ob==btn2 && btn3.getText().equals("")){
		btn3.setText(btn2.getText());
		btn2.setText("");
		}
		if(ob==btn2 && btn6.getText().equals("")){
		btn6.setText(btn2.getText());
		btn2.setText("");
		}
		
				// Button 3 Three Posiblity 
				
		if(ob==btn3 && btn2.getText().equals("")){
		btn2.setText(btn3.getText());
		btn3.setText("");
		}
		if(ob==btn3 && btn4.getText().equals("")){
		btn4.setText(btn3.getText());
		btn3.setText("");
		}
		if(ob==btn3 && btn7.getText().equals("")){
		btn7.setText(btn3.getText());
		btn3.setText("");
		}
		
				// Button 4 Two Posiblity
				
		if(ob==btn4 && btn3.getText().equals("")){
		btn3.setText(btn4.getText());
		btn4.setText("");
		}
		if(ob==btn4 && btn8.getText().equals("")){
		btn8.setText(btn4.getText());
		btn4.setText("");
		}
		
		
				// Button 5 Two Posiblity 2 ROW
		
		if(ob==btn5 && btn1.getText().equals("")){
		btn1.setText(btn5.getText());
		btn5.setText("");
		}
		if(ob==btn5 && btn9.getText().equals("")){
		btn9.setText(btn5.getText());
		btn5.setText("");
		}
		if(ob==btn5 && btn6.getText().equals("")){
		btn6.setText(btn5.getText());
		btn5.setText("");
		}
		
				// Button 6 Four Posiblity 2 ROW
				
		if(ob==btn6 && btn2.getText().equals("")){
		btn2.setText(btn6.getText());
		btn6.setText("");
		}
		if(ob==btn6 && btn5.getText().equals("")){
		btn5.setText(btn6.getText());
		btn6.setText("");
		}
		if(ob==btn6 && btn10.getText().equals("")){
		btn10.setText(btn6.getText());
		btn6.setText("");
		}
		if(ob==btn6 && btn7.getText().equals("")){
		btn7.setText(btn6.getText());
		btn6.setText("");
		}
					
			// Button 7 Four Posiblity 2 ROW	
		if(ob==btn7 && btn3.getText().equals("")){
		btn3.setText(btn7.getText());
		btn7.setText("");
		}	
		if(ob==btn7 && btn6.getText().equals("")){
		btn6.setText(btn7.getText());
		btn7.setText("");
		}
		if(ob==btn7 && btn11.getText().equals("")){
		btn11.setText(btn7.getText());
		btn7.setText("");
		}
		if(ob==btn7 && btn8.getText().equals("")){
		btn8.setText(btn7.getText());
		btn7.setText("");
		}			
		
			// Button 8 Three Posiblity 2 ROW	
			
		if(ob==btn8 && btn4.getText().equals("")){
		btn4.setText(btn8.getText());
		btn8.setText("");
		}
		if(ob==btn8 && btn7.getText().equals("")){
		btn7.setText(btn8.getText());
		btn8.setText("");
		}
		if(ob==btn8 && btn12.getText().equals("")){
		btn12.setText(btn8.getText());
		btn8.setText("");
		}			
		
		
			// Button 9 Three Posiblity 3 ROW
			
		if(ob==btn9 && btn5.getText().equals("")){
		btn5.setText(btn9.getText());
		btn9.setText("");
		}	
		if(ob==btn9 && btn10.getText().equals("")){
		btn10.setText(btn9.getText());
		btn9.setText("");
		}
		if(ob==btn9 && btn13.getText().equals("")){
		btn13.setText(btn9.getText());
		btn9.setText("");
		}			
		
			// Button 10 Four Posiblity 3 ROW
		
		if(ob==btn10 && btn6.getText().equals("")){
		btn6.setText(btn10.getText());
		btn10.setText("");
		}			
		if(ob==btn10 && btn9.getText().equals("")){
		btn9.setText(btn10.getText());
		btn10.setText("");
		}
		if(ob==btn10 && btn14.getText().equals("")){
		btn14.setText(btn10.getText());
		btn10.setText("");
		}
		if(ob==btn10 && btn11.getText().equals("")){
		btn11.setText(btn10.getText());
		btn10.setText("");
		}					
		
					// Button 11 Four Posiblity 3 ROW
		
		if(ob==btn11 && btn7.getText().equals("")){
		btn7.setText(btn11.getText());
		btn11.setText("");
		}			
		if(ob==btn11 && btn10.getText().equals("")){
		btn10.setText(btn11.getText());
		btn11.setText("");
		}
		if(ob==btn11 && btn15.getText().equals("")){
		btn15.setText(btn11.getText());
		btn11.setText("");
		}
		if(ob==btn11 && btn12.getText().equals("")){
		btn12.setText(btn11.getText());
		btn11.setText("");
		}					
		
		
			// Button 12 Four Posiblity 3 ROW
		
		if(ob==btn12 && btn11.getText().equals("")){
		btn7.setText(btn12.getText());
		btn12.setText("");
		}			
		if(ob==btn12 && btn8.getText().equals("")){
		btn8.setText(btn12.getText());
		btn12.setText("");
		}
		if(ob==btn12 && btn16.getText().equals("")){
		btn16.setText(btn12.getText());
		btn12.setText("");
		}					
		
			// Button 13 Four Posiblity 4 ROW
			
		if(ob==btn13 && btn9.getText().equals("")){
		btn9.setText(btn13.getText());
		btn13.setText("");
		}			
		if(ob==btn13 && btn14.getText().equals("")){
		btn14.setText(btn13.getText());
		btn13.setText("");
		}				
		
			// Button 14 Four Posiblity 4 ROW
			
		if(ob==btn14 && btn10.getText().equals("")){
		btn10.setText(btn14.getText());
		btn14.setText("");
		}						
		if(ob==btn14 && btn15.getText().equals("")){
		btn15.setText(btn14.getText());
		btn14.setText("");
		}				
		
		if(ob==btn14 && btn13.getText().equals("")){
		btn13.setText(btn14.getText());
		btn14.setText("");
		}				
		
					// Button 15 Three Posiblity 4 ROW
		
		
		if(ob == btn15 && btn16.getText().equals("")){
		btn16.setText( btn15.getText());
		btn15.setText("");
		}
		
		if(ob==btn15 && btn14.getText().equals("")){
		btn14.setText(btn15.getText());
		btn15.setText("");
		}
		if(ob== btn15 && btn11.getText().equals("")){
		btn11.setText(btn15.getText());
		btn15.setText("");
		}
		
					// Button 16 Two Posiblity 4 ROW
		if(ob== btn16 && btn12.getText().equals("")){
		btn12.setText(btn16.getText());
		btn16.setText("");
		}		
		if(ob== btn16 && btn15.getText().equals("")){
		btn15.setText(btn15.getText());
		btn16.setText("");
		}		
	
	} 
	
	
		
	public static void main(String args[]){
	
	new  PuzzleGameImage();
	}	


	
	

	
	} 	// end of class 
	
	
	
	
	
	