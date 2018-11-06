import java.util.*;
class SelectOperatorOr{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("please enter the 1st value :");
		float val1 = ob.nextFloat();
		System.out.print("please enter the 2nd value :");
		float val2 = ob.nextFloat();
		
		System.out.print("please enter the operator :");
		String op =ob.next();
		
		if(op.equals("x") || op.equals("X") || op.equals("*")){
			System.out.println("Multiplication is : "+(val1*val2));	
			}
		else if(op.equals("+")){
			System.out.println("Addition is : "+(val1+val2));
		}
		else if( op.equals("-")){
			System.out.println("Subtraction is :"+(val1-val2));
		}
		else if( op.equals("/") || op.equals("\\")){
			System.out.println("Division is :"+(val1/val2));
		}
		else if(op.equals("%")){
			System.out.println("Remainder  is :"+(val1%val2));
		}
		else 
		System.out.println(" Invalid Operator Selection  ");
		
	}
	
	
}