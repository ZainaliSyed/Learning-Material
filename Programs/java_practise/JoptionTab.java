import javax.swing.*;
	class JoptionTab{
		public static void main(String args[]){
		
		String  s1 = JOptionPane.showInputDialog(null, "Please Enter Table You Want :");
		int tab = Integer.parseInt(s1);
		
		String s2 = JOptionPane.showInputDialog(null," Please Enter The counter :");
		int count = Integer.parseInt(s2);
		String s ="";
		int store=0;
			for(int i=1; i<=count; ++i){	
				
				store = i*tab;
				s=s+tab+"x"+i+"="+store+"\n";	
				
			}	// end of for
			JOptionPane.showMessageDialog(null,s);
			
			
			
		}
	}