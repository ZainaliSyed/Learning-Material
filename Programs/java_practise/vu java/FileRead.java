import java.io.*;
class FileRead{
	public static void main(String args[]){
		
		try{
		FileReader r = new FileReader("Students.java");
		BufferedReader br = new BufferedReader(r);
		
		String line  = br.readLine();
		System.out.println(line);
		//System.out.println(br.readLine());
		
		
		
		}catch(IOException e){
			System.out.println(e);
		}finally{
			System.out.println("Finall Alway Exceute ... ");
		}
		
	}//end of main
}