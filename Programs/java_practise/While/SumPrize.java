import java.util.*;
class SumPrize{
	public static void main(String argss[]){
		Scanner ob = new Scanner(System.in);
		
		int restart =0;
		
			while(restart==0){
				
				
			int i=1,sum=0;
			while(true){
				
				System.out.print("Enter "+i+" Prize  : ");
				int num =ob.nextInt();
				if(num==0){
					break;
				}
				sum =sum+num;
				i++;	
			}
			
			System.out.println("the Sum is : "+sum);
			
			System.out.print("Press 0 to continue : ");
			restart =ob.nextInt();
			
			if(restart!=0){
				System.exit(0);
			}
				
			}//main While
			
	}//end of main 
}