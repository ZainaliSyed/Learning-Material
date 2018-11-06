import javax.swing.*;
import java.awt.event.*;
class MouseListenerDemo implements MouseListener{
	JFrame frame=new JFrame("MOUSE LISTENER DEMO");
		
		MouseListenerDemo(){
			frame.setVisible(true);
			frame.setSize(500,500);
			frame.addMouseListener(this);
		}
		public void mouseClicked(MouseEvent evt){
			System.out.println("MOUSE CLICKED");
		}
		public void mousePressed(MouseEvent evt){
			System.out.println("MOUSE Pressed");
			frame.getContentPane().setBackground(java.awt.Color.green);
		}
		public void mouseReleased(MouseEvent evt){
			System.out.println("MOUSE Released");
			frame.getContentPane().setBackground(java.awt.Color.pink);
		}
		public void mouseEntered(MouseEvent evt){
			frame.getContentPane().setBackground(java.awt.Color.red);
		}
		public void mouseExited(MouseEvent evt){
			System.out.println("MOUSE EXITED");
			frame.getContentPane().setBackground(java.awt.Color.blue);
		}
			public static void main(String arg[]){
				new MouseListenerDemo();
			}

}//end of class 