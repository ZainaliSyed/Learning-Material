
import javax.swing.JOptionPane;
public class Holidays2{
	public static void main(String args[]){
	
	
		String ageText = JOptionPane.showInputDialog(null, "Please enter your age:");
		int age = Integer.parseInt(ageText);
			if(age<18 && age>30) {
				System.out.println("You are not eligible for the holiday");
			} else {
				System.out.println("You are eligible for the holiday");
			}

		
	}//end of main
}