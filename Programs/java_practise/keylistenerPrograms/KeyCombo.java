import javax.swing.*;
import java.awt.event.*;
class KeyCombo implements KeyListener{
	
	
	JFrame f =new JFrame("Combox Key Listener ");
	JComboBox com = new JComboBox();
	
	JButton evnbtn = new JButton("Even ");
	KeyCombo(){
		
		f.setBounds(0,0,700,700);
		f.setLayout(null);
		f.addKeyListener(this);
		
		com.setBounds(50,50,200,50);
		f.add(com);
		
		evnbtn.setBounds(50,200,100,30);
		f.add(evnbtn);
		
		
		
		
		f.show();
	}
	
		public void keyTyped(KeyEvent evt){
			
			System.out.println("Key Tyed "+evt.getKeyCode());
			
		}
		
		public void keyPressed(KeyEvent evt){
			System.out.println("Key Tyed "+evt.getKeyCode());

		}
		
		public void keyReleased(KeyEvent evt){
			System.out.println("Key Tyed "+evt.getKeyCode());

		}
		
		public void keyClicked(KeyEvent evt){
			System.out.println("Key Tyed "+evt.getKeyCode());

		}
	
	public static void main(String args[]){
		new KeyCombo();
	}
}
