import java.util.*;
class InvertLeft{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter A Number : ");
		int num =ob.nextInt();
		
			int i=1;
			while(i<=num){
				
				int j=num-i;
				while(j>=1){
					System.out.print(" ");
					j--;
				}//end of space 
				
				int k=1;
				while(k<=i){
					System.out.print(k);
					k++;
				}
				System.out.println();
				i++;
			}//end of main
	}
}