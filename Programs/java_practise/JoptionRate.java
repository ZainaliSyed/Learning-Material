import javax.swing.*;
class JoptionRate{
	public static void main(String args[]){
	
		int sum = 0;
		
		for(int i=1; ; i++){
			
		String val = JOptionPane.showInputDialog("Enter "+i+" Rate ");
		int rate = Integer.parseInt(val);
		
		
		sum = sum+rate;
		
			if(rate==0){
				break;
			}
		
		
		}
		JOptionPane.showMessageDialog(null,"The Sum is "+sum);
		
		
	}
}