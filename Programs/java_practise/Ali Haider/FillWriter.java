import java.io.*;
import java.util.*;
class FillWriter{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = ob.next();
		try{
			File file  = new File("ali.txt");
			FileOutputStream fout = new FileOutputStream(file);
			PrintStream out = new PrintStream(fout);
			
			out.println("Your name is : "+name);
			
		}catch(Exception e){
			System.out.println("File Not Find ");
		}
		  
		
	}//end of main
}