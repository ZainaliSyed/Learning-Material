import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class Puzzle extends JFrame implements ActionListener{

 
 JButton btn1=new JButton("2");
 JButton btn2=new JButton("3");
 JButton btn3=new JButton("1");
 JButton btn4=new JButton("5");
 JButton btn5=new JButton("4");
 JButton btn6=new JButton("11");
 JButton btn7=new JButton("10");
 JButton btn8=new JButton("12");
 JButton btn9=new JButton("14");
 JButton btn10=new JButton("6");
 JButton btn11=new JButton("7");
 JButton btn12=new JButton("8");
 JButton btn13=new JButton("15");
 JButton btn14=new JButton("13");
 JButton btn15=new JButton("9");
 JButton btn16=new JButton("16");

 Puzzle(){
 setLayout(new GridLayout(4,4));
 add(btn1);
 add(btn2);
 add(btn3);
 add(btn4);
 add(btn5);
 add(btn6);
 add(btn7);
 add(btn8); 
 add(btn9);
 add(btn10);
 add(btn11);
 add(btn12);
 add(btn13);
 add(btn14);
 add(btn15);
 
 
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);
btn5.addActionListener(this);
btn6.addActionListener(this);
btn7.addActionListener(this);
btn8.addActionListener(this);  
btn9.addActionListener(this);
btn10.addActionListener(this);
btn11.addActionListener(this);
btn12.addActionListener(this);
btn13.addActionListener(this);
btn14.addActionListener(this);
btn15.addActionListener(this);
btn16.addActionListener(this);
 setSize(500,500);
 setVisible(true);
	}

     public void actionPerformed(ActionEvent e){
           if(e.getSource()==btn15 && btn16.getText().equals("")){
              btn16.setText(btn15.getText());
              btn15.setText("");         
                   
           }
   
     }

 public static void main(String args[]){
 new Puzzle();
 }
 }
