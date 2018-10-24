import javax.swing.*;
import java.io.*;
public class BasicPayClass {
    public static void main(String args[]) throws Exception{
        
        try{
            
            
            String s1 = JOptionPane.showInputDialog(null,"Please Enter Amount ");
            int salary = Integer.parseInt(s1);
            
             String s2 = JOptionPane.showInputDialog(null,"Please Enter Your path here ");
            int path = Integer.parseInt(s2);
            
            File f =new File(s2);
            FileOutputStream fout = new FileOutputStream(f);
            PrintStream out =new PrintStream(fout);
            
            System.out.println("\t \t \t**Allowance Portion**** ");
		int houserent = (salary/100)*45;
		out.println("House Rent 45% :"+houserent);
		
		int medical = (salary/100)*15;
		out.println("Medical Allowance  15% :"+ medical);

		int bonus = (salary/100)*20;
		out.println("Bonus 20% :"+bonus);		
		
		int grossPay = salary+houserent+bonus;
		out.println("Gross Pay : "+grossPay);
		
		System.out.println("");
		out.println(" \t \t \t *** Detection Portion **** ");

		int incomeTax = (salary/100)*5;
		out.println("Income tax 5% :"+incomeTax);

		int zakat = (salary/100)*3;
		out.println("Zakat  5% :"+zakat);
		
		int vehicle = (salary/100)*8;
		out.println("Connivance Allowance  5% :"+vehicle);
		
		
		int netPay = grossPay-incomeTax-zakat-vehicle;
		out.println(" Your Net Pay  is :"+netPay);
		
            
            
            
        }catch (Exception e){}
        
    }
    
}
