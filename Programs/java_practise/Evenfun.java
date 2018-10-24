import java.util.*;
class Evenfun{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	
	System.out.print("please enter any no : ");
	int number = ob.nextInt();
	
	if( 2*(number/2)==number){
	System.out.println("the Number is  Even no : ");
	}
	else {
	System.out.print("The  number is  odd  number :");
	}
	   }
}