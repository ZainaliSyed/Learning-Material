import javax.swing.*;
import java.awt.event.*;


class ComboKeylistener implements KeyListener{
		
		JFrame f = new JFrame("Combo Box Series ");
		
		JComboBox com = new JComboBox();
		JButton evenbtn =new  JButton("Even ");
		JButton oddbtn = new JButton("Odd ");
		JButton facbtn = new JButton("Factorial ");
		JButton fibtn =  new JButton("Fi bionic  ");
		JButton sqbtn  = new JButton("Square  ");
		JButton  clrbtn= new JButton("Clear ");
		JButton extbtn = new JButton("Exit ");
		
		ComboKeylistener(){
			
			f.setBounds(0,0,600,600);
			f.setLayout(null);
			f.addKeyListener(this);
			
			com.setBounds(50,50,200,50);
			f.add(com);
			
			evenbtn.setBounds(50,200,80,30);
			f.add(evenbtn);
			//evenbtn.addActionListener(this);
			
			oddbtn.setBounds(130,200,80,30);
			f.add(oddbtn);
			//oddbtn.addActionListener(this);
			
			facbtn.setBounds(220,200,120,30);
			f.add(facbtn);
			//facbtn.addActionListener(this);
			
			
			fibtn.setBounds(50,300,120,30);
			f.add(fibtn);
			//fibtn.addActionListener(this);
			
			sqbtn.setBounds(150,300,100,30);
			f.add(sqbtn);
			//sqbtn.addActionListener(this);
				
			clrbtn.setBounds(50,400,100,30);
			f.add(clrbtn);
			//clrbtn.addActionListener(this);
			
			extbtn.setBounds(150,400,100,30);
			f.add(extbtn);
			//extbtn.addActionListener(this);
			
			f.show();
		}
			
	/*public void actionPerformed(ActionEvent evt){
		Object ob = evt.getSource();
		
			if(ob==evenbtn){
				
				com.removeAllItems();
				
				for(int i=0; i<=20; i=i+2){
					
					com.addItem(i);
				}
			}
			
			else if(ob==oddbtn){
				com.removeAllItems();
				for(int i=1; i<=20; i= i+2){
					com.addItem(i);
				}
				
			}
			
			else if(ob==facbtn){
				com.removeAllItems();
				int fac =1;
				
					for(int i=1; i<=10; i++){
						String str="";
						for(int j=1; j<=i; j++){
							str=str+j+"* ";
							//com.addItem(j+"x ");
							
						}
						
						str=str+"="+(fac*i);
						//fac =fac*i;
						com.addItem(str);
						
					}//main for 		
			}
			
			else if(ob==fibtn){
				
				
				com.removeAllItems();
				int fst =0;
				int sec =0;
				int sum = 1;
				
				for(int i=1;i<=20; i++){
				fst=sec;
				sec=sum;
				sum =fst+sec;
				
				com.addItem(sum);
				}
			}
			
			else if(ob==sqbtn){
				
				com.removeAllItems();
				for(int i=1; i<=10; i++){
					
					int result = i*i;
					com.addItem(result);
				}
			}
			
			else if(ob==clrbtn){
				com.removeAllItems();
			}
			else if(ob==extbtn){
				System.exit(0);
			}
		
	} */  		//end of actionPerformed	
				
	public static void main(String args[]){
		
		new ComboKeylistener();
	}//end of main
	
	
	public void KeyPressed(KeyEvent evt){

		
		if(evt.getKeyCode()==101){
			
			com.removeAllItems();
				
				for(int i=0; i<=20; i=i+2){
					
					com.addItem(i);
				}
			
		}
	}
	
	public void KeyClicked(KeyEvent evt){
		
	}
	
	public void KeyReleased(KeyEvent evt){
		
	}
	
	public void KeyTyped(KeyEvent evt){
		
	}
	
	
	
}