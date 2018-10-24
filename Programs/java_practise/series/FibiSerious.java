import java.util.*;
class FibiSerious{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = ob.nextInt();
			
			
			
			int fst =0;
			int sec =0;
			int sum =1;
			
			for(int i=1; i<num; i++){
				
				System.out.print(sum+",");
				fst=sec;
				sec=sum;
				sum = fst+sec;
			}
		//1,1,2,3,5,8,13,21

		
		
		
	}//end of main 
}
