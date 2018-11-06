import java.util.*;
	public class ForPrime{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter The UpperLimit :");
	int upper =ob.nextInt();
	
		for(int i=1; i<=upper; i++){
				boolean a= true;
			for(int j=2; j<=i; j++){
			
			if(i%j==0){
			a= false;
			break;
			}
			
			}
		
		if(a){
		System.out.print(""+i+",");
		}
		
		}
	
		
	
	
	}
	}