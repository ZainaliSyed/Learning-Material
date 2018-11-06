import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BtnLabel implements MouseListener{
	
	JFrame f = new JFrame("Button ");
	
	JLabel l1 = new JLabel();
	ImageIcon img1 = new ImageIcon("1.gif");
	ImageIcon img2 = new ImageIcon("2.gif");
	ImageIcon img3 = new ImageIcon("3.gif");
	
	
	JButton pre = new JButton("Previous");
	JButton next = new JButton("Next");
	BtnLabel(){
	f.show();
	f.setSize(700,700);
	f.setLayout(null);
	
	l1.setBounds(50,50,400,400);
	f.add(l1);
	l1.addMouseListener(this);
	
	pre.setBounds(50,500,100,100);
	f.add(pre);
	pre.addMouseListener(this);
	
	next.setBounds(200,500,100,100);
	f.add(next);
	next.addMouseListener(this);
	
	}
	
	public void mousePressed(MouseEvent e){
		
		int counter = 0;
		
		if(e.getSource()==next){
			
			counter = counter+1;	
		
			if(counter==1){
			l1.setIcon(img1);
			}	
			
			if(counter==2){
			//l1.setIcon(new ImageIcon("2.gif") );
			l1.setIcon(img2);
			}
			
			if(counter==3){
			//l1.setIcon(new ImageIcon("brickwall.jpg") );
			l1.setIcon(img3);
			}
			
			
			
		}
		
		
		if(e.getSource()==pre){
			counter -- ;
			
			/*if(counter==0){
			l1.setIcon(new ImageIcon("1.gif") );
			//pre.setEditable(false);
			} */
		}
		
	}
	
	public void mouseReleased(MouseEvent e){
	}
	
	public void mouseClicked(MouseEvent e){
	}
	public void mouseEntered (MouseEvent e){
	}
	public void mouseExited (MouseEvent e){
	}
	
	
	
	public static void main(String args[]){
	new BtnLabel();
	
	}
}