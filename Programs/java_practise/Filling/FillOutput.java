import java.io.*;
import java.util.*;
import javax.swing.*;

class FillOutput{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		try{
			
			System.out.print("Enter Number : ");
			int num =ob.nextInt();
			
			System.out.print("Enter Name Here : ");
			
			String path = JOptionPane.showInputDialog(null,"Enter path : ");
			File f = new File(path);
			FileOutputStream fout = new FileOutputStream(f);
			PrintStream out = new PrintStream(fout);
			
			out.print("Enter Number  :"+num);
			
			
			
		}catch (Exception e){}
		
		
	}//end of main method 
}