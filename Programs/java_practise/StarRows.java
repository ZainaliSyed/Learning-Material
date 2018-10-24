import java.util.*;
class StarRows{
	public static void main(String args[]){
		Scanner o = new Scanner(System.in);
		
		
		System.out.print("Enter Number of Rows : ");
		int rows = o.nextInt();
		
		System.out.print("Enter Number of Column : ");
		int column = o.nextInt();
		
		for(int i=1; i<=rows; i++){
			
			for(int j=1; j<=column; j++){
			System.out.print("*");
			}
			
			System.out.println();
		}// outter 
		
		
	}
		
	
	
}