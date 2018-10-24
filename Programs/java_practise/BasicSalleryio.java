import java.io.*;
class BasicSalleryio{
	public static void main(String args[]) throws Exception{	
	File f = new File("mytextFile.txt");
	FileOutputStream fout = new FileOutputStream(f);
	PrintStream out = new PrintStream(fout);

	String a = JOptionPane.showMessageDialog("Enter Basic pay :");
	int amount = Integer.parseInt(a);
	out.println("Basic pay : "+amount);
	
	int house = (amount/100) *45;
	out.println("House rent  45%:"+house);	
	int medi = (amount/100)*15;
	out.println(" Medical Allowance 15% :"+medi);
	int bounus =(amount/100)*8;
	out.println(" Bounus 8%:"+bounus);

	int grosspay=house+medi+bounus;
	out.println("");
	out.println("");
	out.println("Gross Pay :"+grosspay);

	int income = (amount/100)*5;
	out.println("Income Tax 5% :"+income);
	int zakat = (amount/100)*3;
	out.println("Zakat :"+zakat);
	int vehicle = (amount/100)*8;
	out.println("Convince  Allowance 8%:"+vehicle);
	
	int net = grosspay-income-zakat-vehicle;
	out.print("Net Income :"+net);
	
	}
}