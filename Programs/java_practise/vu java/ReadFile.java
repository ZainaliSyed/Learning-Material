import java.io.*;
class ReadFile{
	
	public static void main(String args[]){
		
		

		try{
				
			FileReader fr = new FileReader("Students.java");
			BufferedReader br  = new BufferedReader(fr);
		
			String s  = br.readLine();
			while(s!=null){
				System.out.println(s);
				s = br.readLine();
			}
			
			
		}catch(Exception e){}
		
	}//end of main

}