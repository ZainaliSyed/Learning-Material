import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BtnLabelAction implements ActionListener{
	
	JFrame f = new JFrame("Button ");
	
	
	JLabel l1 = new JLabel();
	ImageIcon img1 = new ImageIcon("1.gif");
	ImageIcon img2 = new ImageIcon("2.gif");
	ImageIcon img3 = new ImageIcon("java.gif");
	
	
	JButton pre = new JButton("Previous");
	JButton next = new JButton("Next");
	int counter = 0;
	
	
	BtnLabelAction(){
	f.show();
	f.setSize(700,700);
	f.setLayout(null);
	
	l1.setBounds(50,50,400,400);
	f.add(l1);
	//l1.addMouseListener(this);
	//l1.addActionListener(this);
	
	pre.setBounds(50,500,100,100);
	f.add(pre);
	pre.addActionListener(this);
	
	next.setBounds(200,500,100,100);
	f.add(next);
	next.addActionListener(this);
	
	}
	
		public void actionPerformed(ActionEvent e){
	
	
		if(e.getSource()==next){
		
				
			
			if(counter==1){
			l1.setIcon(img1);
			System.out.println("1 click");
			
			}
			
			if(counter==2){
			l1.setIcon(img2);
			System.out.println("2 click");
			}
			
			if(counter==3){
			l1.setIcon(img3 );
			System.out.println("3 click");
			}

			counter++;	
		}
		
		if(e.getSource()==pre){
		
		
			if(counter==3){
			l1.setIcon(img2);
			}
			
			if(counter==2){
			l1.setIcon(img1);
			}
		counter --;
		}
			
	}
	public static void main(String args[]){
	new BtnLabelAction();
	
	}
}