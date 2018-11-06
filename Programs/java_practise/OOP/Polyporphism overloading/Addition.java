import java.util.*;
class Addition{
	
	Scanner ob = new Scanner(System.in);
	
	void add(int a,int b){
	
//		System.out.print("Enter 1st No : ");
//		a= ob.nextInt();
	
//		System.out.print("Enter 2nd no : ");
//		b = ob.nextInt(); 
		System.out.println("int int  Enter Addition Result 1 : "+(a+b));
		
	}
	
	void add(int a, double b){
//		System.out.print("Enter 1st No : ");
//		a= ob.nextInt();
	
//		System.out.print("Enter 2nd no : ");
//		b = ob.nextInt(); 
		System.out.println("int double  Enter Addition Result 2 : "+(a+b));
	}
	void add(double a, int b){
		System.out.print("Enter 1st No : ");
		a= ob.nextInt();
	
		System.out.print("Enter 2nd no : ");
		b = ob.nextInt(); 
		System.out.println("Enter Addition Result 3 : "+(a+b));
	}
	
	void add(double a, double b){
		System.out.print("Enter 1st No : ");
		a= ob.nextInt();
	
		System.out.print("Enter 2nd no : ");
		b = ob.nextInt(); 
		
		System.out.println("Enter Addition Result 4 : "+(a+b));
	}
	
}//end of class 