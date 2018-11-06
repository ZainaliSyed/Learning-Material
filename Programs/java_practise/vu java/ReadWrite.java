import java.io.*;
class ReadWrite{
	public static void main(String args[]){
		
		
		try{
			
			FileReader fr  = new FileReader(FileDescriptor.in);
			BufferedReader br  = new BufferedReader(fr);
			
			
			FileWriter fw  = new FileWriter("output1.java");
			PrintWriter pw  = new PrintWriter(fw);
			
			int lineCount  = 1;
			String inputLine, outputLine;
			do{
				inputLine = br.readLine();
				if(inputLine.equals(""))
					break;
				
				outputLine = lineCount+") "+inputLine;
				pw.println(outputLine);
				lineCount++;	
			}while(true);
			
			fr.close();
			br.close();
			fw.close();
			pw.close();
		}catch(Exception e){}
		
		
	}
}