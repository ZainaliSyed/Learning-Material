import java.io.*;
public class ThrowsDemo{
	
	public static void method2() throws IOException{
		FileReader f = new FileReader("Students.java");
		BufferedReader b = new BufferedReader(f);
		
		String s  = b.readLine();
		System.out.println(s);
		
	}
	
	public static void method1() throws IOException{
		//try{
			
			method2();
			
		//}catch(IOException ex){
			//System.out.println("File Not Found ..");
		//ex.printStackTrace(); }
		
	}
	
	

	public static void main(String args[]){
		try{
			method1();
		}catch(IOException ex){
			System.out.println("File Not Found ..");
		}finally{
			System.out.println(" ****** Will Excute In Every Condition .. ");
		}
		
		
	}//end of main
}