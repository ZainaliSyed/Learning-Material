import java.util.*;
class Atmtest{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please enter Rupues : ");
	int rupes = ob.nextInt();
	
	int fiveThousand =rupes/5000;
	System.out.println("5000 : "+fiveThousand); 
	
	int remFivethousand = rupes%5000;
	int oneThousand =remFivethousand/1000;
	System.out.println("1000  :"+oneThousand);
	
	int remOnethousand = remFivethousand%1000;
	int fiveHundred = remOnethousand/500;
	System.out.println("500   :"+fiveHundred);
	
	int remFivehundred = remOnethousand%500;
	int oneHundred = remFivehundred/100;
	System.out.println("100   :"+oneHundred);
	
	int remOnehundred = remFivehundred%100;
	int fifty = remOnehundred/50;
	System.out.println("50    :"+fifty);
	
	int remFifty = remOnehundred%50;
	int twenty = remFifty/20;
	System.out.println("20    :"+twenty);
	
	int remTwenty = remFifty%20;
	int ten = remTwenty/10;
	System.out.println("10    :"+ten);
	
	int remTen = remTwenty%10;
	int five = remTen/5;
	System.out.println("5     :"+five);
	
	int remFive = remTen%5;
	int two = remFive/2;
	System.out.println("2    : "+two);
	
	int remTwo = remFive%2;
	int one = remTwo/1;
	System.out.println("1     :"+one);
	
	
	}//end of main method 
}