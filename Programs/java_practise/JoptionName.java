import javax.swing.*;
class JoptionName{
	public static void main(String args[]){
		
		String name = JOptionPane.showInputDialog("Please Enter A Name :");
		
		String s = "";
		int size =name.length();
		for(int i=1; i<=size; i++){
			
			for(int j=1; j<=i; j++){
				
				s =s+ name.charAt(j-1)+""; 
				
			}
			
			
			s = s+"\n";
			
		}//end of main for
		
		JOptionPane.showMessageDialog(null,s);
		
	}
}