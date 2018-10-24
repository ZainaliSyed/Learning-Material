import java.io.*;
public class WriteEx{
	
	public static void main(String args[]){
		
		PersonalInfo prWrite = new PersonalInfo("Zain","Jail road","03139460776");
		
		try{
			
			FileOutputStream fos = new FileOutputStream("zain.txt");
			ObjectOutputStream  out = new ObjectOutputStream(fos);
			
			out.writeObject(prWrite);
			
			out.close();
			fos.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}//end of main
}