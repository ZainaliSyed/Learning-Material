import java.io.*;
class Marksheetio{
	public static void main(String args[]) throws Exception{
	File f = new File("Marksheetio.txt");
	FileOutputStream outf = new FileOutputStream(f);
	
	PrintStream out = new PrintStream(outf);
	out.println("Maths : 80");
	out.println("Science :60");
	out.println("English :50");
	out.println("Computer :70");
	out.println("Urdu :60");
	int percent = (80+60+50+70+60/500)*100;
	out.print("Percentage :"+percent);
	
	
	}
}