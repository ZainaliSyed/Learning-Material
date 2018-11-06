import java.io.*;
public class ReadEx{
	
	public static void main(String args[]){
		
		try{
			
			FileInputStream fis = new FileInputStream("zain.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			
			
			PersonalInfo pRead = (PersonalInfo)in.readObject();
			
			pRead.printPersonalInfo();
			
			in.close();
			fis.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
}