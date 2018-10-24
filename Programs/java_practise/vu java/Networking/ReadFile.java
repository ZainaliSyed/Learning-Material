import java.io.*;
public class ReadFile implements Runnable{
	
	String fileName ;
	
	public ReadFile(String fn){
		fileName = fn;
	}
	
	public void run(){
		
		try{
			FileReader  fr  = new FileReader(fileName);
			BufferedReader br  = new BufferedReader(fr);
			String line  ="";
			line  = br.readLine();
				while(line!=null){
					System.out.println(line);
					line = br.readLine();
				}
				
			fr.close();
			br.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}