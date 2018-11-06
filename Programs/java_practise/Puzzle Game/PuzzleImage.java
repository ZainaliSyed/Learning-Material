import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
	class PuzzleImage implements ActionListener{
		
		JFrame f = new JFrame();

		
		JButton b1 = new JButton(new ImageIcon("1.gif"));
		JButton b2 = new JButton(new ImageIcon("2.gif"));
		JButton b3 = new JButton(new ImageIcon("3.gif"));
		JButton b4 = new JButton(new ImageIcon("4.gif"));
		JButton b5 = new JButton(new ImageIcon("5.gif"));
		JButton b6 = new JButton(new ImageIcon("6.gif"));
		JButton b7 = new JButton(new ImageIcon("7.gif"));
		JButton b8 = new JButton(new ImageIcon("8.gif"));
		JButton b9 = new JButton(new ImageIcon("9.gif"));
		JButton b10 = new JButton(new ImageIcon("10.gif"));
		JButton b11= new JButton(new ImageIcon("11.gif"));
		JButton b12 = new JButton(new ImageIcon("12.gif"));
		JButton b13 = new JButton(new ImageIcon("13.gif"));
		JButton b14 = new JButton(new ImageIcon("14.gif"));
		JButton b15 = new JButton(new ImageIcon("15.gif"));
		JButton b16 = new JButton("");
		
		
		
		
		
		PuzzleImage(){
		f.setLayout(new GridLayout(4,4));
		f.setSize(750,650);
		f.setVisible(true);
		
		f.add(b1);
		b1.addActionListener(this);
		f.add(b2);
		b2.addActionListener(this);
		f.add(b3);
		b3.addActionListener(this);
		f.add(b4);
		b4.addActionListener(this);
		f.add(b5);
		b5.addActionListener(this);
		f.add(b6);
		b6.addActionListener(this);
		f.add(b7);
		b7.addActionListener(this);
		f.add(b8);
		b8.addActionListener(this);
		f.add(b9);
		b9.addActionListener(this);
		f.add(b10);
		b10.addActionListener(this);
		f.add(b11);
		b11.addActionListener(this);
		f.add(b12);
		b12.addActionListener(this);
		f.add(b13);
		b13.addActionListener(this);
		f.add(b14);
		b14.addActionListener(this);
		f.add(b15);
		b15.addActionListener(this);
		f.add(b16);
		b16.addActionListener(this);
		
		
		}
		
		
				public void actionPerformed(ActionEvent evt ){
				Object ob = evt.getSource();
					
					//Random rand = new Random();
					//rand = ImageIcon("1.gif"+6);		
			
			
				//BUTTON 1 TWO POSIBILTY 1 ROW
			if(ob==b1 && b2.getIcon()==null){
			b2.setIcon(b1.getIcon());
			b1.setIcon(null);
			}	
			if(ob==b1 && b5.getIcon()==null){
			b5.setIcon(b1.getIcon());
			b1.setIcon(null);
			}	
				
				//BUTTON 2 THREE POSIBILTY 1 ROW
				
			if(ob==b2 && b1.getIcon()==null){
			b1.setIcon(b2.getIcon());
			b2.setIcon(null);
			}

			if(ob==b2 && b6.getIcon()==null){
			b6.setIcon(b2.getIcon());
			b2.setIcon(null);
			}
			if(ob==b2 && b3.getIcon()==null){
			b3.setIcon(b2.getIcon());
			b2.setIcon(null);
			}

				//BUTTON 3 THREE POSIBILTY 1 ROW
			

			if(ob==b3 && b2.getIcon()==null){
			b2.setIcon(b3.getIcon());
			b3.setIcon(null);
			}
			if(ob==b3 && b7.getIcon()==null){
			b7.setIcon(b3.getIcon());
			b3.setIcon(null);
			}
			if(ob==b3 && b4.getIcon()==null){
			b4.setIcon(b3.getIcon());
			b3.setIcon(null);
			}
			
				//BUTTON 4 THREE POSIBILTY 1 ROW	
			if(ob==b4 && b3.getIcon()==null){
			b3.setIcon(b4.getIcon());
			b4.setIcon(null);
			}
			if(ob==b4 && b8.getIcon()==null){
			b8.setIcon(b4.getIcon());
			b4.setIcon(null);
			}

				//BUTTON 5 THREE POSIBILTY 2 ROW

			if(ob==b5 && b1.getIcon()==null){
			b1.setIcon(b5.getIcon());
			b5.setIcon(null);
			}
			if(ob==b5 && b9.getIcon()==null){
			b9.setIcon(b5.getIcon());
			b5.setIcon(null);
			}			
			if(ob==b5 && b6.getIcon()==null){
			b6.setIcon(b5.getIcon());
			b5.setIcon(null);
			}

				//BUTTON 6 FOUR POSIBILTY 2 ROW
			if(ob==b6 && b2.getIcon()==null){
			b2.setIcon(b6.getIcon());
			b6.setIcon(null);
			}
			if(ob==b6 && b5.getIcon()==null){
			b5.setIcon(b6.getIcon());
			b6.setIcon(null);
			}
			if(ob==b6 && b10.getIcon()==null){
			b10.setIcon(b6.getIcon());
			b6.setIcon(null);
			}				
			if(ob==b6 && b7.getIcon()==null){
			b7.setIcon(b6.getIcon());
			b6.setIcon(null);
			}	

				//BUTTON 7 FOUR POSIBILTY 2 ROW
			if(ob==b7 && b3.getIcon()==null){
			b3.setIcon(b7.getIcon());
			b7.setIcon(null);
			}
			if(ob==b7 && b6.getIcon()==null){
			b6.setIcon(b7.getIcon());
			b7.setIcon(null);
			}			
			if(ob==b7 && b11.getIcon()==null){
			b11.setIcon(b7.getIcon());
			b7.setIcon(null);
			}
			if(ob==b7 && b8.getIcon()==null){
			b8.setIcon(b7.getIcon());
			b7.setIcon(null);
			}			
				
				
				//BUTTON 8 Three POSIBILTY 2 ROW
			if(ob==b8 && b4.getIcon()==null){
			b4.setIcon(b8.getIcon());
			b8.setIcon(null);
			}
			if(ob==b8 && b7.getIcon()==null){
			b7.setIcon(b8.getIcon());
			b8.setIcon(null);
			}
			if(ob==b8 && b12.getIcon()==null){
			b12.setIcon(b8.getIcon());
			b8.setIcon(null);
			}
				
				
			//BUTTON 9 Three POSIBILTY 3 ROW	
				
			if(ob==b9 && b5.getIcon()==null){
			b5.setIcon(b9.getIcon());
			b9.setIcon(null);
			}
			if(ob==b9 && b13.getIcon()==null){
			b13.setIcon(b9.getIcon());
			b9.setIcon(null);
			}
			if(ob==b9 && b10.getIcon()==null){
			b10.setIcon(b9.getIcon());
			b9.setIcon(null);
			}
			
			//BUTTON 10 FOUR POSIBILTY 3 ROW	
			
			if(ob==b10 && b6.getIcon()==null){
			b6.setIcon(b10.getIcon());
			b10.setIcon(null);
			}
			if(ob==b10 && b9.getIcon()==null){
			b9.setIcon(b10.getIcon());
			b10.setIcon(null);
			}
			if(ob==b10 && b14.getIcon()==null){
			b14.setIcon(b10.getIcon());
			b10.setIcon(null);
			}
			if(ob==b10 && b11.getIcon()==null){
			b11.setIcon(b10.getIcon());
			b10.setIcon(null);
			}
			
			//BUTTON 11 FOUR POSIBILTY 3 ROW	
			if(ob==b11 && b7.getIcon()==null){
			b7.setIcon(b11.getIcon());
			b11.setIcon(null);
			}
			if(ob==b11 && b10.getIcon()==null){
			b10.setIcon(b11.getIcon());
			b11.setIcon(null);
			}			
			if(ob==b11 && b15.getIcon()==null){
			b15.setIcon(b11.getIcon());
			b11.setIcon(null);
			}			
			
			if(ob==b11 && b12.getIcon()==null){
			b12.setIcon(b11.getIcon());
			b11.setIcon(null);
			}	

			//BUTTON 12 Three POSIBILTY 3 ROW
			if(ob==b12 && b11.getIcon()==null){
			b11.setIcon(b12.getIcon());
			b12.setIcon(null);
			}
			if(ob==b12 && b8.getIcon()==null){
			b8.setIcon(b12.getIcon());
			b12.setIcon(null);
			}
			if(ob==b12 && b16.getIcon()==null){
			b16.setIcon(b12.getIcon());
			b12.setIcon(null);
			}
					//BUTTON 13 TWO POSIBILTY 4 ROW

			if(ob==b13 && b9.getIcon()==null){
			b9.setIcon(b13.getIcon());
			b13.setIcon(null);
			}
			if(ob==b13 && b14.getIcon()==null){
			b14.setIcon(b13.getIcon());
			b13.setIcon(null);
			}	
				
				//BUTTON 14 THREE POSIBILTY 4 ROW
			if(ob==b14 && b13.getIcon()==null){
			b13.setIcon(b14.getIcon());
			b14.setIcon(null);
			}
			if(ob==b14 && b10.getIcon()==null){
			b10.setIcon(b14.getIcon());
			b14.setIcon(null);
			}	
			if(ob==b14 && b15.getIcon()==null){
			b15.setIcon(b14.getIcon());
			b14.setIcon(null);
			}	
				
				
					//BUTTON 15 THREE POSIBILTY 4 ROW
			if(ob==b15 && b16.getIcon()==null){
			b16.setIcon(b15.getIcon());
			b15.setIcon(null);
			}
			if(ob==b15 && b14.getIcon()==null){
			b14.setIcon(b15.getIcon());
			b15.setIcon(null);
			}
			if(ob==b15 && b11.getIcon()==null){
			b11.setIcon(b15.getIcon());
			b15.setIcon(null);
			}
			
			
			//BUTTON 16 THREE POSIBILTY 4 ROW
			
			if(ob==b16 && b12.getIcon()==null){
			b12.setIcon(b16.getIcon());
			b16.setIcon(null);
			}
			
			if(ob==b16 && b15.getIcon()==null){
			b15.setIcon(b16.getIcon());
			b16.setIcon(null);
			}
						
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} // End of action 
	
		
		public static void main(String args[]){
		new  PuzzleImage();
		}
		
		
		
	}