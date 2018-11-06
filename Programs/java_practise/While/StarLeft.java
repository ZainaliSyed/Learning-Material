import java.util.*;
class StarLeft{
	public static void main(String args[]){
			
		Scanner ob = new Scanner(System.in);
			
		System.out.print("Enetr a Number : ");
		int num =ob.nextInt();
		
		int i=1;
		
		while(i<=num){
			int j=1;
			while(j<=i){
				System.out.print(j+" ");
				j++;
			}
			
			System.out.println();
			i++;
			
		}//end of while 
			
			
	}
}