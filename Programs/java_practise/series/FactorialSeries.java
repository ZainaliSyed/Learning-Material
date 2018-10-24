import java.util.*;
class FactorialSeries{ 
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Please Enter A Number : ");
		int num = ob.nextInt();
		
		int fac =1; 
		
		
		for(int i=1; i<=num; i++){
			
			for(int j=1; j<=i; j++){
				
				System.out.print(j);
				System.out.print("x");
				
			}
			fac = fac*i;
			System.out.print(" = " +fac);
			System.out.println();
			
		}//end of main for
		
	}
}