import java.util.*;
class CalulationDemo{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	
	System.out.println("   +");
	String plus = "+";
	System.out.println("   -");
	
	System.out.println("   *");
	System.out.println("   /");
	
	System.out.print("Please enter the 1st value : ");
	int val1 = ob.nextInt();
	System.out.print("Please enter the 2nd value :");
	int val2 = ob.nextInt();
	System.out.print(" Please enter the  Operator :");
	String op = ob.next();
	
	if(op.equals("+")){
		System.out.println("Addition  = "+(val1+val2));
		}
		
		if(op.equals("-")){
		System.out.println("SUBTRACTION  = "+(val1-val2));
		}
		
		if(op.equals("*")){
		System.out.println("MULTIPLICATION = "+(val1*val2));
		}
		
		if(op.equals("/")){
		System.out.println("DIVISION   = "+(val1/val2));
		}
	
	}
}
