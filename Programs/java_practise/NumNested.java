import java.util.*;
class NumNested{
	public static void main (String args[]){
	Scanner ob = new Scanner(System.in);
		
	System.out.print("Please Enter a Number  : ");
	int num =ob.nextInt();
	
	if(num>=10){
		if(num<=20){
			System.out.println("Have chocolate");
		}
	}// end of 20
	
	if(num>=21){
		if(num<=30){
			System.out.println("have enjoyment");
		}
		
	}
	
	if(num>=31){
		if(num<=40){
			System.out.println("Have cold Drink ");
		}
		
	}
	
	if(num>=41){
		if(num<=50){
			System.out.println("Hello Zain here ");
			
		}
	}
		
	if(num>50){
		System.out.println("number should be less than 50 ..");
		}	
	}// end of main  
}