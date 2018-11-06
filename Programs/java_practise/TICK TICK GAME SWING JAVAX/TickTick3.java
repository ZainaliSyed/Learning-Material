import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TickTick3 extends JFrame implements ActionListener{
		boolean x=true;
		boolean y=false;
		JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();
		JLabel lb1=new JLabel("First Player Name");
		JLabel lb2=new JLabel("Second Player Name");
		JButton bb1=new JButton("");
		JButton bb2=new JButton("");
		JButton bb3=new JButton("");
		JButton bb4=new JButton("");
		JButton bb5=new JButton("");
		JButton bb6=new JButton("");
		JButton bb7=new JButton("");
		JButton bb8=new JButton("");
		JButton bb9=new JButton("");
		JButton bb10=new JButton("NEW");
		JButton bb11=new JButton("ABOUT");
		JButton bb12=new JButton("HELP");
		JButton bb13=new JButton("EXIT");
	 TickTick3(){
        setTitle("TIK TIK GAME");
		setLayout(null);
		setBounds(0,0,800,500);
		lb1.setBounds(500,50,200,30);
		add(lb1);
		tf1.setBounds(500,90,200,30);
		add(tf1);
		lb2.setBounds(500,130,200,30);
		add(lb2);
		tf2.setBounds(500,170,200,30);
		add(tf2);
		bb1.setBounds(30,40,130,100);
		add(bb1);
		bb2.setBounds(160,40,130,100);
		add(bb2);
		bb3.setBounds(290,40,130,100);
		add(bb3);
		bb4.setBounds(30,140,130,100);
		add(bb4);
		bb5.setBounds(160,140,130,100);
		add(bb5);
		bb6.setBounds(290,140,130,100);
		add(bb6);
		bb7.setBounds(30,240,130,100);
		add(bb7);
		bb8.setBounds(160,240,130,100);
		add(bb8);
		bb9.setBounds(290,240,130,100);
		add(bb9);
		bb10.setBounds(30,360,70,50);
		add(bb10);
		bb11.setBounds(120,360,70,50);
		add(bb11);
		bb12.setBounds(210,360,70,50);
		add(bb12);
		bb13.setBounds(300,360,70,50);
		add(bb13);
		bb11.addActionListener(this);
		bb13.addActionListener(this);
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		bb3.addActionListener(this);
		bb4.addActionListener(this);	
		bb5.addActionListener(this);
		bb6.addActionListener(this);
		bb7.addActionListener(this);
		bb8.addActionListener(this);
		bb9.addActionListener(this);
		bb10.addActionListener(this);
		show();
		}

		
		
		
	public void actionPerformed(ActionEvent evt){
		if(bb11==evt.getSource())
		{

			JOptionPane.showMessageDialog(null,"MR: PAWAN KUMAR\n2k14 SWE 68\nMy dep: is SOFTWARE ENGNERRING\nMy java teacher is MR: SANTOSH KUMAR");
		}

		if(bb13==evt.getSource()){
	    System.exit(0);
	}
	if(bb1==evt.getSource()){  //bb1
		if(bb1.getText().equals("")){
			if(x==true){
				bb1.setText("X");
				x=false;
				y=true;
			}
			else
				if(y==true){
					bb1.setText("Y");
					y=false;
					x=true;
		   }
		
		if(bb1.getText().equals("X") && bb2.getText().equals("X") && bb3.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		    if   (bb1.getText().equals("X") && bb4.getText().equals("X") && bb7.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH'X' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		   
		    if(bb1.getText().equals("X") && bb5.getText().equals("X") && bb9.getText().equals("X")){
		    JOptionPane.showMessageDialog(null,"YOU WON THE MATCH'X' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
		else if(bb1.getText().equals("Y") && bb2.getText().equals("Y") && bb3.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		    else if(bb1.getText().equals("Y") && bb4.getText().equals("Y") && bb7.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH'Y' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		   
		    else if(bb1.getText().equals("Y") && bb5.getText().equals("Y") && bb9.getText().equals("Y")){
		    JOptionPane.showMessageDialog(null,"YOU WON THE MATCH'Y' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
		



		}//set	
			
	}//end bb1
	if(bb2==evt.getSource()){
		
		if(bb2.getText().equals("")){    
			if(x==true){
				bb2.setText("X");
				x=false;
				y=true;
			}
		 else
		   if(y==true){
				bb2.setText("Y");
				y=false;
				x=true;
		   }
		if(bb1.getText().equals("X") && bb2.getText().equals("X") && bb3.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		if(bb2.getText().equals("X") && bb5.getText().equals("X") && bb8.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			
			}
		else if(bb1.getText().equals("Y") && bb2.getText().equals("Y") && bb3.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			
			}
			else if(bb2.getText().equals("Y") && bb5.getText().equals("Y") && bb8.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		
		
		}//outer if
	}//end bb2
	if(bb3==evt.getSource()){
		if(bb3.getText().equals("")){
			if(x==true){
				bb3.setText("X");
				x=false;
				y=true;
			}
		else
		    if(y==true){
				bb3.setText("Y");
				y=false;
				x=true;
			}
		 
		if(bb1.getText().equals("X") && bb2.getText().equals("X") && bb3.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		if(bb3.getText().equals("X") && bb6.getText().equals("X") && bb9.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
        if(bb3.getText().equals("X") && bb5.getText().equals("X") && bb7.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
		else if(bb1.getText().equals("Y") && bb2.getText().equals("Y") && bb3.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' HORIZENTAL");
			
			setVisible(false);
			new TickTick3();
			}
		else if(bb3.getText().equals("Y") && bb6.getText().equals("Y") && bb9.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		
        else if(bb3.getText().equals("Y") && bb5.getText().equals("Y") && bb7.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' CUTOFF");
			setVisible(false);
			new TickTick3();
			}



			
	}//outer if
     }//end bb3
	if(bb4==evt.getSource()){  //bb4
		
		if(bb4.getText().equals("")){
		

			if(x==true){
				bb4.setText("X");
				x=false;
				y=true;
			}
		 	else
		   	if(y==true){
				bb4.setText("Y");
				y=false;
				x=true;
		   	}
		
        if(bb4.getText().equals("X") && bb5.getText().equals("X") && bb6.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			} 
		
        if(bb1.getText().equals("X") && bb4.getText().equals("X") && bb7.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		
        else if(bb4.getText().equals("Y") && bb5.getText().equals("Y") && bb6.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		
        else if(bb1.getText().equals("Y") && bb4.getText().equals("Y") && bb7.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		}//outer if
	}//end bb4	
	if(bb5==evt.getSource()){
		if(bb5.getText().equals("")){
		
		if(x==true){
			bb5.setText("X");
			x=false;
			y=true;
		       }
		else
		if(y==true){
			bb5.setText("Y");
			y=false;
			x=true;
		  }
	   
        if(bb4.getText().equals("X") && bb5.getText().equals("X") && bb6.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
	   
        if(bb2.getText().equals("X") && bb5.getText().equals("X") && bb8.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
	   
        if(bb1.getText().equals("X") && bb5.getText().equals("X") && bb9.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
	   
        if(bb3.getText().equals("X") && bb5.getText().equals("X") && bb7.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
	   else if(bb4.getText().equals("Y") && bb5.getText().equals("Y") && bb6.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
	   
        else if(bb2.getText().equals("Y") && bb5.getText().equals("Y") && bb8.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
	   
        else if(bb1.getText().equals("Y") && bb5.getText().equals("Y") && bb9.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
	   
        else if(bb3.getText().equals("Y") && bb5.getText().equals("Y") && bb7.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
	   
	   
	   }//outer if body
        }//bb5 off


	if(bb6==evt.getSource()){
		if(bb6.getText().equals("")){
		if(x==true){
			bb6.setText("X");
			x=false;
			y=true;
			}
		else
		  if(y==true){
			bb6.setText("Y");
			y=false;
			x=true;
		 }
		
			
        if(bb3.getText().equals("X") && bb6.getText().equals("X") && bb9.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		if(bb4.getText().equals("X") && bb5.getText().equals("X") && bb6.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		
        else if(bb3.getText().equals("Y") && bb6.getText().equals("Y") && bb9.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		
        else if(bb4.getText().equals("Y") && bb5.getText().equals("Y") && bb6.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}

	}//outer if
	}//bb6 0ff
		
	if(bb7==evt.getSource()){
		if(bb7.getText().equals("")){
		if(x==true){
			bb7.setText("X");
			x=false;
			y=true;
			}
		else
		  if(y==true){
			bb7.setText("Y");
			y=false;
			x=true;
		 }
		  
        if(bb1.getText().equals("X") && bb4.getText().equals("X") && bb7.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		
        if(bb7.getText().equals("X") && bb5.getText().equals("X") && bb3.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
		
        if(bb7.getText().equals("X") && bb8.getText().equals("X") && bb9.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
	    else if(bb1.getText().equals("Y") && bb4.getText().equals("Y") && bb7.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		
        else if(bb7.getText().equals("Y") && bb5.getText().equals("Y") && bb3.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
		
        if(bb7.getText().equals("Y") && bb8.getText().equals("Y") && bb9.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
		
		
		
		}//outer if
	}//bb7 0ff
		
	if(bb8==evt.getSource()){
		if(bb8.getText().equals("")){
		if(x==true){
			bb8.setText("X");
			x=false;
			y=true;
			}
		else
		  if(y==true){
			bb8.setText("Y");
			y=false;
			x=true;
		 }
		
		
        if(bb2.getText().equals("X") && bb5.getText().equals("X") && bb8.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		
        if(bb7.getText().equals("X") && bb8.getText().equals("X") && bb9.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		
        else if(bb2.getText().equals("Y") && bb5.getText().equals("Y") && bb8.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		
        else if(bb7.getText().equals("Y") && bb8.getText().equals("Y") && bb9.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
	    }//outer if
	}//bb8 0ff
	
	if(bb9==evt.getSource()){
		if(bb9.getText().equals("")){
		if(x==true){
			bb9.setText("X");
			x=false;
			y=true;
			}
		else
		  if(y==true){
			bb9.setText("Y");
			y=false;
			x=true;
		 }
		if(bb1.getText().equals("X") && bb5.getText().equals("X") && bb9.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' CUTOFF");
			setVisible(false);
			new TickTick3();
			}
		if(bb3.getText().equals("X") && bb6.getText().equals("X") && bb9.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' VERTICAL");
			}
		if(bb7.getText().equals("X") && bb8.getText().equals("X") && bb9.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'X' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		
		else if(bb1.getText().equals("Y") && bb5.getText().equals("Y") && bb9.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' CUT OFF");
			setVisible(false);
			new TickTick3();
			}
		
		else if(bb3.getText().equals("Y") && bb6.getText().equals("Y") && bb9.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' VERTICAL");
			setVisible(false);
			new TickTick3();
			}
		
		else if(bb7.getText().equals("Y") && bb8.getText().equals("Y") && bb9.getText().equals("Y")){
				JOptionPane.showMessageDialog(null,"YOU WON THE MATCH 'Y' HORIZENTAL");
			setVisible(false);
			new TickTick3();
			}
		
		} //outer if
	}//bb9 0ff
	if(bb10==evt.getSource()){
		System.out.println("New");
		setVisible(false);
		new TickTick3();
	}//bb10

  

   }//"end of the body public void actionPerformed"
	
	public static void main(String arg[]){
		new TickTick3();
	}
}//end of class




