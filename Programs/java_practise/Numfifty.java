import java.util.*;
class Numfifty{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter number till 50 : ");
	int num = ob.nextInt();
	
	if(num>=10 && num<=20){
		System.out.println(" Have Chocolate ");
	}
	else if(num>=21 && num<=30){
		System.out.println("go to Picnic ");
	}
	else if(num>=31 && num<=40){
		System.out.println("Have cold Drink ");
	}
	else if(num>=41 && num<=50){
		System.out.println("Enjoyment ");
		
	}
	else if(num>50){
		System.out.println("invalid select less than 50 .. !! ");
	}
	
	}// end of main 
}