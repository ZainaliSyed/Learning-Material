import java.util.*;
	
	class	EvenOddProg{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please enter a  number :");
	int no = ob.nextInt();
	
	if(no%2==0){
	System.out.print("");
	System.out.print("The you Entered is  Even number ");
	}
	else{
	System.out.print("");
	System.out.print("The number You entered is odd number ");
	}
	
	}
}