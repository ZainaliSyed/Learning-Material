import java.io.*;
class Trollyio{
	public static void main(String args[]) throws Exception{
	File f = new File("Trollyio.txt");
	FileOutputStream fout =  new FileOutputStream(f);
	PrintStream out = new PrintStream(fout);
	
	out.println("Enter the  Load : 2");
	out.println("Enter the Amount :5000 ");
	
	int total = 2*5000;
	out.println("Total :"+total);
	int maintaince = (10000/100)*3;
	out.println("Maintance : "+maintaince);
	int driver = (10000/100)*10;
	out.println("Driver 10% :"+driver);
	int deisel = (10000/100)*50;
	out.println("Disel : "+deisel);
	
	int net = total-maintaince-driver-deisel;
	out.print("Net Profit : "+net);

	
	
	}
}