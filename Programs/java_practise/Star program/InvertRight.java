import java.util.*;
class InvertRight{
	
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = ob.nextInt();
	

		for(int i=1; i<=num; i++ ){
			for(int k=1; k<=num-i; k++){
				System.out.print(" ");
			}//3rd for
			
			for(int j=1; j<=i; j++){
				System.out.print("o");
			}//2nd for
			
			
			
			
			System.out.println();
		}//1st for	
	

			
	}// end of main
	
}

