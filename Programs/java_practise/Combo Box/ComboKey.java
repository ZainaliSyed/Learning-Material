import javax.swing.*;
import java.awt.event.*;
class ComboKey implements KeyListener{
		JFrame f = new JFrame("Combo Box Series ");
		
		JComboBox com = new JComboBox();
		JButton evenbtn =new  JButton("Even ");
		JButton oddbtn = new JButton("Odd ");
		JButton facbtn = new JButton("Factorial ");
		JButton fibtn =  new JButton("Fi bionic  ");
		JButton sqbtn  = new JButton("Square  ");
		JButton  clrbtn= new JButton("Clear ");
		JButton extbtn = new JButton("Exit ");
		ComboKey(){
			
			f.setLayout(null);
			f.setBounds(0,0,600,600);
			
			com.setBounds(50,50,200,50);
			f.add(com);

			evenbtn.setBounds(50,200,80,30);
			f.add(evenbtn);
			
			
			oddbtn.setBounds(130,200,80,30);
			f.add(oddbtn);
			
			
			facbtn.setBounds(220,200,120,30);
			f.add(facbtn);
						
			
			fibtn.setBounds(50,300,120,30);
			f.add(fibtn);
			
			
			sqbtn.setBounds(150,300,100,30);
			f.add(sqbtn);
			
				
			clrbtn.setBounds(50,400,100,30);
			f.add(clrbtn);
			
			
			extbtn.setBounds(150,400,100,30);
			f.add(extbtn);
			
			f.addKeyListener(this);
			
			f.show();
		}
	public static void main(String args[]){
		new ComboKey();
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

}//end of class