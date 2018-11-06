
// MARKSHEET WITHOUT THE && OPERATOR 
import java.util.*;
class MarksheetPercent{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please enter your Percentage :");
	int per = ob.nextInt();
	
	if(per>=90){
		if(per<=100){
		System.out.print("Congratulation you got A1");
		}	
	}//end of A1
	
	if(per>=80){
		if(per<90){
		System.out.print("Your grade is A");
		}
	}//end of A
	
	if(per>=70){
		if(per<80){
		System.out.print("your grade is B");
		}
	}// end of b
	
	if(per>=60){
		if(per<70){
			System.out.print("your grade is C");
		}
	}// end of c
	
	if(per>=50){
		if(per<60){
			System.out.print("your grade is D");
		}
	}// end of d
	
	if(per>=40){
		if(per<50){
			System.out.print("your grade is E");
		}
	}// end of e
	
	if(per<50){
	System.out.print("Sorry you are fail ");
	}
	
	if(per>100){
	System.out.print("ILLegal Selection Percentage  should be  less  than 100");
	}
	
	}
}