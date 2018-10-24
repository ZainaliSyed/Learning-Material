import javax.swing.*;
import java.awt.event.*;
class TestKeyListener implements KeyListener{
	JFrame frm=new JFrame("new Frame");
	ImageIcon ic=new ImageIcon("1.gif");
	JLabel lb=new JLabel(ic);

	TestKeyListener(){
		frm.setLayout(null);
		frm.setBounds(0,0,500,500);
		frm.addKeyListener(this);
		
		lb.setBounds(40,50,100,100);
		frm.add(lb);
		
		frm.show();
	}//end of const
	public static void main(String arg[]){
		new TestKeyListener();
		
	}//end of main
	public void keyPressed(KeyEvent ev){
		System.out.println("key pressed cod="+ev.getKeyCode());
		
	}
	public void keyClicked(KeyEvent ev){
		System.out.println("key clicked code="+ev.getKeyCode());
	}
	public void keyReleased(KeyEvent ev){
		System.out.println("key released code="+ev.getKeyCode());
	}
	public void keyTyped(KeyEvent ev){
		System.out.println("key typed code ="+ev.getKeyCode());
	}

}