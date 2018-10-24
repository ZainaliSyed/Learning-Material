import java.io.*;
class FillReading{
	public static void main(String args[]){
		
		try{
			
			FileReader file  = new FileReader("zain.txt");
			BufferedReader br = new BufferedReader(file); //bit
			
			String line = br.readLine();
			while(line!=null){
				System.out.println(line);
				line = br.readLine();
			}
			
		}catch(Exception e){
			System.out.println("File Not Find ");
		}
		finally{
			//file.close();
			System.out.println("Finally Block ");
		} 
		
	}//end of main
}