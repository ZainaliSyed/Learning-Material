import java.util.*;
	public class PrimeSeries{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int i;
	
	System.out.print("Please Enter The Upper Limit  : ");
	int upper = ob.nextInt();
	
	
	
	for(i=2; i<=upper ; i++){
		int j;
			for(j=2; j<=i; j++){
				
			int n =i%j;
				if(n==0){
				break;
				}	
			}//end of inner for 
			
		if(i==j){
		System.out.println(""+i);
		
		}
		
	}//end of for 
	
		
		
	
	}
	}
