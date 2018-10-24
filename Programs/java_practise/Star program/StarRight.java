import java.util.*;
class StarRight{
	
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter A Number : ");
		int num = ob.nextInt();
			
			for(int i=1; i<=num; i++){
				
				for(int j=1; j<=i; j++){
					System.out.print("*");
				}
				
				System.out.println();
			}//end of outter 
			
		
	}
	
}