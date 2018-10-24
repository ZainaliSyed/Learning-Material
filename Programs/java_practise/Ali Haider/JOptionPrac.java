import javax.swing.*;
class JOptionPrac{
	
	public static void main(String args[]){
		
		
		String  number1  = JOptionPane.showInputDialog("Enter number : ");
		String  number2  = JOptionPane.showInputDialog("Enter number : ");
		
		int num1  = Integer.parseInt(number1);
		int num2  = Integer.parseInt(number2);
		
		JOptionPane.showMessageDialog(null, "Your Result  "+(num1+num2));
		
		
	}
}