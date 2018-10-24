import java.util.*;
class Wapda{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int unit,five,currentBill;
	
	System.out.print("please enter your bill unit :");
	unit = ob.nextInt();
	
	if(unit>=1 || unit<100){
		
		five=unit*5;
		System.out.println("your bill is :"+five);
		}
	if(unit>100 || unit<=200){
				 
		int modFive = unit%5;
		int multiSev = modFive*7;
		
		int remfive = unit-modFive;   		//here the modFive variable will mines  the remaining value eg 103 remain value is 3 
		five = remfive*5;
		System.out.println("your unit per 5 is :"+five);
		
		System.out.println("the unit per 7 are  :"+multiSev);
		
		currentBill = five+multiSev;
		System.out.println("your current bill is :"+currentBill);
		}
		
		
	if(unit>200 || unit<=300){
		
		int modNine = unit%10;
		int multiNine = modNine*9;
		
		currentBill= bill+mulSev+mulNine;
		System.out.println("your unit per 5 is :"+bill);
		System.out.println("the unit per 7 are  :"+mulSev);
		System.out.println("the unit per 9 are  :"+mulNine);
		
		System.out.println("your current bill is :"+currentBill);
		
		} 	
		
	
	}
}