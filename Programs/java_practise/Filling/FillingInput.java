import java.util.*;
import java.io.*;
import javax.swing.*;
class FillingInput{
	public static void main(String args[]){
		
		try{
			
		String path = JOptionPane.showInputDialog(null,"Enter Path ");
		
		File f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		
		String data="";
		Scanner ob = new Scanner(fin);
		
			while(ob.hasNextLine()){
				data =data+""+ob.nextLine()+"\n";
				
			}//end of while 
			System.out.println(data);
		}catch (Exception e){System.out.println("File dosent match");}
		

 		
	}
	
}