import java.util.*;
	class RowCol{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please  Enter The No Column : ");
	int col = ob.nextInt();
	
	System.out.print("Please  Enter The No Row : ");
	int row = ob.nextInt();
		
		int r,c;
		for(r=1; r<=row; r++){
		
			for(c=1; c<=col; c++){
			System.out.print("* ");
			}
			
			System.out.println();
		}
	
	
	}
	}