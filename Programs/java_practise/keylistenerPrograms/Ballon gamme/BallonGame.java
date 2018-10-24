import javax.swing.*;
import java.awt.event.*;

class BallonGame implements KeyListener{
	
	JFrame f =new JFrame("Ballon Game ");
	
	ImageIcon img1= new ImageIcon("A.jpg");
	JLabel l1 =new JLabel(img1);
	
	ImageIcon img2 = new ImageIcon("B.jpg");
	JLabel l2= new JLabel(img2);
	
	ImageIcon img3 =new ImageIcon("C.jpg");
	JLabel l3 = new JLabel(img3);
	
	ImageIcon img4 =new ImageIcon("D.jpg");
	JLabel l4 =new JLabel(img4);
	
	JLabel l5 = new JLabel(new ImageIcon("E.jpg"));
	
	JLabel l6=new JLabel(new ImageIcon("8.jpg"));
	
	JLabel l7=new JLabel(new ImageIcon("G.jpg"));
	
	JLabel l8 =new JLabel(new ImageIcon("I.jpg"));
	
	JLabel l9 =new JLabel(new ImageIcon("J.jpg"));
	
	JLabel l10 =new JLabel(new ImageIcon("K.jpg"));
	
	JLabel l11=new JLabel(new ImageIcon("L.jpg"));
	
	JLabel l12=new JLabel(new ImageIcon("M.jpg"));
	
	JLabel l13=new JLabel(new ImageIcon("N.jpg"));
	
	JLabel l14=new JLabel(new ImageIcon("O.jpg"));
	
	JLabel l15=new JLabel(new ImageIcon("P.jpg"));
	
	JLabel l16=new JLabel(new ImageIcon("Q.jpg"));
	
	JLabel l17=new JLabel(new ImageIcon("R.jpg"));
	
	JLabel l18=new JLabel(new ImageIcon("S.jpg"));
	
	JLabel l19=new JLabel(new ImageIcon("T.jpg"));
	
	JLabel l20=new JLabel(new ImageIcon("U.jpg"));
	
	JLabel l21=new JLabel(new ImageIcon("V.jpg"));
	JLabel l22=new JLabel(new ImageIcon("W.jpg"));
	JLabel l23=new JLabel(new ImageIcon("X.jpg"));
	JLabel l24=new JLabel(new ImageIcon("Y.jpg"));
	JLabel l25=new JLabel(new ImageIcon("Z.jpg"));
	
	
	BallonGame(){
	
	f.setBounds(0,0,900,900);
	f.setLayout(null);
	f.addKeyListener(this);
	
	
	l1.setBounds(10,20,100,100);
	f.add(l1);
	
	l2.setBounds(100,20,100,100);
	f.add(l2);
	
	l3.setBounds(200,50,100,100);
	f.add(l3);
	
	l4.setBounds(300,50,100,100);
	f.add(l4);
	
	l5.setBounds(400,30,100,100);
	f.add(l5);
	
	l6.setBounds(500,40,100,100);
	f.add(l6);
	
	l7.setBounds(600,40,100,100);
	f.add(l7);
	
	l8.setBounds(700,40,100,100);
	f.add(l8);
	
	l9.setBounds(800,40,100,100);
	f.add(l9);
	
	l10.setBounds(10,150,100,100);
	f.add(l10);
	
	l11.setBounds(100,150,100,100);
	f.add(l11);
	
	l12.setBounds(200,150,100,100);
	f.add(l12);
	
	l13.setBounds(300,150,100,100);
	f.add(l13);
	
	l14.setBounds(400,150,100,100);
	f.add(l14);
	
	l15.setBounds(500,150,100,100);
	f.add(l15);
	
	l16.setBounds(600,150,100,100);
	f.add(l16);
	
	l17.setBounds(700,150,100,100);
	f.add(l17);
	
	l18.setBounds(800,150,100,100);
	f.add(l18);
	
	l19.setBounds(20,250,100,100);
	f.add(l19);
	
	l20.setBounds(100,250,100,100);
	f.add(l20);
	
	l21.setBounds(200,250,100,100);
	f.add(l21);
	
	l22.setBounds(300,250,100,100);
	f.add(l22);
	
	l23.setBounds(400,250,100,100);
	f.add(l23);

	l24.setBounds(500,250,100,100);
	f.add(l24);
	
	l25.setBounds(600,250,100,100);
	f.add(l25);
		
		
	
	f.setVisible(true);
	
	
	}
       public void keyPressed(KeyEvent ev){
	}
	
	
	public void keyReleased(KeyEvent ev){	
	}
	
	public void keyTyped(KeyEvent ev){
		char ch=ev.getKeyChar();
		System.out.println(ch);
		if(ch=='A'||ch=='a'){
		l1.setVisible(false);
		
		}
		
		else if(ch=='B'|| ch=='b'){
			
			l2.setVisible(false);
		}
		
		else if(ch=='C'|| ch=='c'){
			l3.setVisible(false);
		}
		
		else if(ch=='D'|| ch=='d'){
			l4.setVisible(false);
		}
		
		else if(ch=='E'|| ch=='e'){
			l5.setVisible(false);
			
		}
		
		else if(ch=='F'|| ch=='f'){
			l6.setVisible(false);
		}
		
		else if(ch=='G'|| ch=='g'){
			l7.setVisible(false);
		}
		
		else if(ch=='I'|| ch=='i'){
			l8.setVisible(false);
		}
		
		else if(ch=='J'|| ch=='j'){
			l9.setVisible(false);
		}
		
		else if(ch=='K'|| ch=='k'){
			l10.setVisible(false);
		}
		
		else if(ch=='l'|| ch=='L'){
			l11.setVisible(false);
		}
		
		else if(ch=='M'|| ch=='m'){
			l12.setVisible(false);
		}


		else if(ch=='N'|| ch=='n'){
			l13.setVisible(false);
		}

		else if(ch=='O'|| ch=='o'){
			l14.setVisible(false);
		}		

		
		else if(ch=='P'|| ch=='p'){
			l15.setVisible(false);
		}		
		
		else if(ch=='Q'|| ch=='q'){
			l16.setVisible(false);
		}		
		
		else if(ch=='R'|| ch=='r'){
			l17.setVisible(false);
		}		
		
		else if(ch=='S'|| ch=='s'){
			l18.setVisible(false);
		}
		
		else if(ch=='T'|| ch=='t'){
			l19.setVisible(false);
		}
		
		else if(ch=='U'|| ch=='u'){
			l20.setVisible(false);
		}
		
		else if(ch=='v'|| ch=='V'){
			l21.setVisible(false);
		}		
		
		else if(ch=='w'|| ch=='W'){
			l22.setVisible(false);
		}		

		else if(ch=='x'|| ch=='X'){
			l23.setVisible(false);
		}
		
		else if(ch=='y'|| ch=='Y'){
			l24.setVisible(false);
		}		

		else if(ch=='z'|| ch=='Z'){
			l25.setVisible(false);
		}		
		
		
	}//end of typed 
	

	
	
	
	public static void main (String args[]){
	
	new BallonGame();
	}// end of main 
	


}//end of class 