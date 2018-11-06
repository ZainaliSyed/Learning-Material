import java.io.*;
class FileDemo{
	public static void main(String args[]) throws Exception{
	File f = new File("mytextFile.txt");
	FileOutputStream fout = new FileOutputStream(f);
	PrintStream out =new PrintSream(fout);
	out.print("Hello ");
	
	}
}