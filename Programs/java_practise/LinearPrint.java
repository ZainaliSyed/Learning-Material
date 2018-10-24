import java.util.*;
class LinearPrint{
	
		public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		int number;
		
		System.out.print("please enter the Digits  :");
		number = ob.nextInt();
		
		int digit1 = number%10;
		
		int remdigit3 = number/10;
		int digit2 = remdigit3%10;
		
		int remdigit2 = remdigit3/10;
		int digit3 = remdigit2%10;
		
		int remdigit1 = remdigit2/10;
		int digit4 = remdigit1%10;
		
		System.out.print(digit4+","+digit3+","+digit2+","+digit1);
		}
}