import java.util.*;
class GradeShow{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Your here : ");
		int grade = ob.nextInt();
		
		String per = ob.next();
			
			
		
		if(grade<50){
			System.out.println("Sorry you are Fail ..!! ");
		}
		
		else if(grade>=51 && grade<=60){
			System.out.println(" You have Got D Grade .");
		}
		else if(grade>=61 && grade<=70){
			System.out.println("you have C Grade ..");
		}
		else if(grade>=71 && grade<=80){
			
			System.out.println("You have B grade ");
		}
		else if(grade>=81 && grade<=90){
			System.out.println("You have Got A grade ");
		}
		
		else if(grade>=91 && grade<=100){
			System.out.println("you Have Got A+");
		}
		
		else if(grade>100){
			System.out.println("Invalid num should be less than 100 ..");
		}// end of main if 
		
	}// end of main 
}