import java.util.*;
class InvertLeft{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	int num = ob.nextInt();
	
		for(int i=0; i<num; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			
			for(int k=1; k<=num-i; k++){
				System.out.print(k);
			}
			
			
			System.out.println();
			
		}// for
		
	}// end class 
}