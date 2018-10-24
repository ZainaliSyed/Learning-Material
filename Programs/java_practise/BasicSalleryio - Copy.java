import java.io.*;
class BasicSalleryio{
	public static void main(String args[]) throws Exception{	
	File f = new File("mytextFile.txt");
	FileOutputStream fout = new FileOutputStream(f);
	PrintStream out = new PrintStream(fout);
	out.println("Basic pay :1000 ");
	
	int house = (1000/100) *45;
	out.println("House rent  45%:"+house);	
	int medi = (1000/100)*15;
	out.println(" Medical Allowance 15% :"+medi);
	int bounus =(1000/100)*8;
	out.println(" Bounus 8%:"+bounus);

	int grosspay=house+medi+bounus;
	out.println("");
	out.println("");
	out.println("Gross Pay :"+grosspay);

	int income = (1000/100)*5;
	out.println("Income Tax 5% :"+income);
	int zakat = (1000/100)*3;
	out.println("Zakat :"+zakat);
	int vehicle = (1000/100)*8;
	out.println("Convince  Allowance 8%:"+vehicle);
	
	int net = grosspay-income-zakat-vehicle;
	out.print("Net Income :"+net);
	
	}
}