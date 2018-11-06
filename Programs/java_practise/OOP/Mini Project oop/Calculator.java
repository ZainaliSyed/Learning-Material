import java.util.*;
class Calculator{
	Scanner ob = new Scanner(System.in);
	int fst,sec,result=0;
	void menuCal(){
		
		System.out.println("");
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division ");
		System.out.println("5) Remainder ");
		System.out.println("");
		
			System.out.print("Enter Menu Choice : ");
			int menuChoice = ob.nextInt();
			
				if(menuChoice==1){
					
					System.out.print("Enter 1st Number : ");
					fst=ob.nextInt();
					
					System.out.print("Enter 2nd Number : ");
					sec = ob.nextInt();
					
					System.out.println("Addition result is : "+(fst+sec));
					System.out.println("");
					
				}
				
				else if(menuChoice==2){
					System.out.print("Enter 1st Number :");
					fst=ob.nextInt();
					
					System.out.print("Enter 2nd Number :");
					sec =ob.nextInt();
					
					System.out.println("Subtraction Result : "+(fst-sec));
					System.out.println("");
				}
				
				else if(menuChoice==3){
					System.out.print("Enter 1st Number :");
					fst=ob.nextInt();
					
					System.out.print("Enter 2nd Number :");
					sec =ob.nextInt();
					
					System.out.println("Multiplication Result : "+(fst*sec));
					System.out.println("");
				}
				
				else if(menuChoice==4){
					System.out.print("Enter 1st Number :");
					fst=ob.nextInt();
					
					System.out.print("Enter 2nd Number :");
					sec =ob.nextInt();
					
					System.out.println("Division Result : "+(fst/sec));
					System.out.println("");
				}
				
				else if(menuChoice==5){
					System.out.print("Enter 1st Number :");
					fst=ob.nextInt();
					
					System.out.print("Enter 2nd Number :");
					sec =ob.nextInt();
					
					System.out.println("Remainder Result : "+(fst%sec));
					System.out.println("");
				}
				else if(menuChoice>5 || menuChoice<1){
					System.out.println("Invalid Selection .. ! ");
					System.out.println("");
				}
				
		
	}//end of menuCal
	
		
		void operatorCal(){
			
			System.out.print("Enter 1st Number : ");
			fst = ob.nextInt();
			
			System.out.print("Enter 2nd Number ");
			sec= ob.nextInt();
			
			System.out.print("Enter operator : ");
			String op =ob.next();
			
				if(op.equals("+")){
					System.out.println("Addition Result : "+(fst+sec));
				}
				
				else if(op.equals("-")|| op.equals("_")){
					System.out.println("Subtraction Result : "+(fst-sec));
				}
				
				else if(op.equals("*")|| op.equals("x")){
					System.out.println("Multiplication Result : "+(fst*sec));
				}
				
				else if(op.equals("/")|| op.equals("\\")){
					System.out.println("Division Result : "+(fst/sec));	
				}
				
				else{
					System.out.println("Invalid opeerator .. ! ");
				}
				
			
		}//end of operator method 
	
	
}//end of class 