import java.util.*;
class PrizeNum{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		int sum =0;
		for(int i=1; ; i++){
			
		System.out.print("Enter "+i+" Prize Till zero : ");
		int no = ob.nextInt();
			
			if(no==0){
				break;
			}
			sum =sum+no;
			
		}//end of for
		
		System.out.print("The sum is :"+sum);
		
	}//end of main

}