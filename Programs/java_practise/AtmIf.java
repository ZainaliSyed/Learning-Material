import java.util.*;
class AtmIf{
	public static void main (String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print(" Please Enter Rupees : ");
	int rupes = ob.nextInt();
	
		
		
		int fiveThousand =rupes/5000;
			if (fiveThousand!=0){
			System.out.println("5000 : "+fiveThousand);
			}
		 	
		int remFivethousand = rupes%5000;
		int oneThousand =remFivethousand/1000;
		if(oneThousand!=0){
		System.out.println("1000  :"+oneThousand);
		}
	
		int remOnethousand = remFivethousand%1000;
		int fiveHundred = remOnethousand/500;
		if(fiveHundred!=0){
		System.out.println("500   :"+fiveHundred);	
		}
	
	
		int remFivehundred = remOnethousand%500;
		int oneHundred = remFivehundred/100;
		if(oneHundred!=0){
		System.out.println("100   :"+oneHundred);	
		}
	
	
		int remOnehundred = remFivehundred%100;
		int fifty = remOnehundred/50;
		if(fifty!=0){
		System.out.println("50    :"+fifty);	
		}
	
	
		int remFifty = remOnehundred%50;
		int twenty = remFifty/20;
		if(twenty!=0){
		System.out.println("20    :"+twenty);	
		}
	
	
		int remTwenty = remFifty%20;
		int ten = remTwenty/10;
		if(ten!=0){
		System.out.println("10    :"+ten);	
		}
	
	
		int remTen = remTwenty%10;
		int five = remTen/5;
		if(five!=0){
		System.out.println("5     :"+five);	
		}
	
	
		int remFive = remTen%5;
		int two = remFive/2;
		if(two!=0){
		System.out.println("2    : "+two);	
		}
	
	
		int remTwo = remFive%2;
		int one = remTwo/1;
		if(one!=0){
		System.out.println("1     :"+one);	
		}
	
			
				
		
	}// end of main 
}// end of class 