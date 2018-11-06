import java.util.*;
	public class FactorialFor{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int i,fac,multi,result;
	
	System.out.print("Please Enter Any Factorial : ");
	fac = ob.nextInt();
	
		multi=fac;
		for(i=fac; i>1; i--){
		
		fac =fac-1;
		multi = multi*fac;
		System.out.print(""+i+"x");
		
		}
		System.out.println("1  = "+multi);
	
	
	}
	}
