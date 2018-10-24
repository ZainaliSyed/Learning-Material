import java.util.*;
class MiniSwitchmenu{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
	
		System.out.println("1) Calculator  ");
		System.out.println("2) Season ");
		System.out.println("3) Grade ");
		System.out.println("4) About");
		System.out.println("5) Exit \n \n");
	
		System.out.print("Please Enter your Selection  :");
		int select = ob.nextInt();
	
		switch(select){
			case 1:
				System.out.print("Enter 1st number :");
				int num1 = ob.nextInt();
		
				System.out.print("Enter 2nd Number :");
				int num2 = ob .nextInt();
		
				int result = num1+num2;
				System.out.println("Your Result is :"+result);
				break;
		
			case 2: 
				System.out.print("Enter The Month  : ");
				int month =ob.nextInt();
	
				if(month==1 || month==2 || month==12){
					System.out.println("Winter Month ");
				}
				   else 
					if(month==3 || month==4 || month==5){
						System.out.println("Summer seaSon");
					}
					 else
					   if(month==6 || month==7 || month==8){
						System.out.println("Autumn Season");
					   }
		else if (month==9 || month==10 || month==11){
		System.out.println("Spring Season");
		}
		break;
		
		case 3:
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
		}
		break;
		
		case 4:
		
		System.out.println(" \t Hello My name is zain .. \n \t I am from Sindh University ");
		break;
		
		case 5:
		System.exit(0);
		
	}// main switch 
	
	
	
	
	
	
	}
}