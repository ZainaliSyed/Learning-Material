import java.util.*;
class WhileFactorail{
	public static void main(String args[]){
		Scanner ob =new Scanner(System.in);
		
		System.out.print("Enter A Number : ");
		int num =ob.nextInt();
		
		int fac=1;
		int i=1;	
		
		while(i<=num){
			
			int j=1;
			while(j<=i){
				System.out.print(j+"x");
				j++;
			}
				fac= fac*i;
				System.out.println("= "+fac);
				i++;	
				
		}//end of while 
		
		
			/*System.out.print("For Continue program Press 0 ");
			int restart = ob.nextInt(); */

		
	}
}