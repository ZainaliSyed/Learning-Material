import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;

public class FrameColor  implements MouseListener{
    JFrame f  = new JFrame("BackGround Color ");
    JButton b1 = new JButton("Change Color ");
    JButton b2 = new JButton("Get Color ");
    FrameColor(){
        f.setSize(500,600);
        f.setVisible(true);
        f.addMouseListener(this);
        f.setLayout(null);
        
        f.add(b1);
        b1.setBounds(100, 50, 200, 200);
        b1.addMouseListener(this);
        
        f.add(b2);
        b2.setBounds(100, 250, 200, 200);
        b2.addMouseListener(this);
        
    }
	
	int counter =0;
	int pressCounter =0;
	
	int exitcounter = 0;
    
    public void mouseClicked (MouseEvent evt){
	
    	
    }
    public void mousePressed (MouseEvent evt){
		if(evt.getSource()==b1){
			counter++;
		if(counter==1){
		b1.setBackground(Color.red);
		
		}
		if(counter==2){
		b1.setBackground(Color.yellow);
		}
		if(counter==3){
		b1.setBackground(Color.blue);
		}
		if(counter==4){
		b1.setBackground(Color.pink);
		counter=0;
		}
		
		}
		
		
		// b2 press 
		
		if(evt.getSource()==b2){
		b2.setBackground(b1.getBackground());
		}
		
		
		
		
	
    }
	
    public void mouseReleased (MouseEvent evt){
    
    }
    public void mouseEntered (MouseEvent evt){
		if(evt.getSource()==f){
		
		int mouseEnter =0;
		mouseEnter++;
		
		if(mouseEnter==1){
		f.getContentPane().setBackground(Color.red);
		}
		if(mouseEnter==2){
		f.getContentPane().setBackground(Color.blue);
		mouseEnter=0;
		}
		
		}
	}
    
    public void mouseExited (MouseEvent evt){
		if(evt.getSource()==f){
			
    exitcounter++;
		if(exitcounter==1){
		f.getContentPane().setBackground(Color.yellow);
		}
		if(exitcounter==2){
		f.getContentPane().setBackground(Color.black);
		exitcounter=0;
		}
		
		}
	
	
	
	
    }
    
    
    
    public static void main(String args[]){
        new FrameColor();
    }
    
}
