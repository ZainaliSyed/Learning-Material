import java.io.*;
public class ReadFile implements Runnable{
	
	String fileName ;
	String sentence ;
	public ReadFile(String fn){
		fileName = fn;
	}
	public void run(){
		
		try{
			if(fileName.equals("first.txt")){
				
				sentence = "Read Message From first File : ";
			}
			else{
				sentence = "Read Message From Second File : ";
			}
			FileReader  fr  = new FileReader(fileName);
			BufferedReader br  = new BufferedReader(fr);
			String line  ="";
			line  = br.readLine();
			
				while(line!=null){
					
					System.out.println(sentence+line);
					line = br.readLine();
					
				}
			
			fr.close();
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}