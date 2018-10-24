import java.io.*;
class FileOutput{
	
	public static void main(String args[]){
		
		try{
			
			FileWriter fw  = new FileWriter("output.java");
			PrintWriter pw  = new PrintWriter(fw);
			
			String s1 = "Hello Zain";
			String s2  = "Web ";
			
			pw.println(s1);
			pw.println(s2);
			
			pw.flush();
			fw.close();
			pw.close();
		}catch(Exception e){}
		
	}//end 
}