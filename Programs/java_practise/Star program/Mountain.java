import java.util.*;
class Mountain{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
		
		
		System.out.print("Enter a Number : ");
		int num = ob.nextInt();
		
		
		for(int i=1; i<=num; i++){
			
			for(int j=num-i; j>=1; j--){
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++){
				System.out.print("* ");
			}
			
			System.out.println();
			
		}//main for
	
	
	}//end of main 
}