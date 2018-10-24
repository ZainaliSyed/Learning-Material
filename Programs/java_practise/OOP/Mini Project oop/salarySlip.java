import java.util.*;
class salarySlip{
	Scanner ob = new Scanner(System.in);
	void salary(){
				System.out.print("Please Enter Your Basic Pay :");
				int amount = ob.nextInt();
		
		System.out.println("");
		System.out.println(" \t ********** Increment Portion *********** ");
		System.out.println("");
		
		int house = (amount/100)*3;
		System.out.println("House Rent 3% :"+house);
		
		int medical = (amount/100)*15;
		System.out.println("Medical Allowance  15% :"+medical);
		
		int bonus = (amount/100)*5;
		System.out.println("Bonus  5% :"+bonus);
		
		int grossSallery = house+medical+bonus;
		System.out.print("Your Gross Sallery is :"+grossSallery);
		System.out.println("\n");
		
		System.out.println("\t ********** Detection Portion ***********");
		System.out.println("");
		
		int tax= (amount/100)*5;
		System.out.println(" Income Tax 5% : "+tax);
		
		float zakat =(amount/100)*2.5f;
		System.out.println("Zakat 2.5% : "+zakat);
		
		int vehcle = (amount/100)*8;
		System.out.println(" Convince Allowance 8% : "+vehcle);
		
		float net = grossSallery-tax-zakat-vehcle;
		
		System.out.println("");
		System.out.print(" \t YOUR  NET SALAERY IS :"+net);
	}//end of method 
}