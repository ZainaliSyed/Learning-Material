import java.util.*;
class NumSquare{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("enter Number ");
		int num = ob.nextInt();
		
		
		
		System.out.print("odd");
		System.out.print("\t Even");
		
		System.out.print("\t \t Sq odd");
		System.out.println("\t \t Sq even ");
		
		
		for(int odd=1; odd<num; odd= odd+2){
			int tem=odd+1;
			int sqOdd=0;
			int sqEven=0;
			int even=0;
			
			sqOdd= odd*odd;
			
			even = even+2;
			sqEven= even*even;
			System.out.println(odd+"\t"+tem+"\t \t "+sqOdd+"\t \t\t "+(tem*tem));
		}
		

	}// end of main 
}