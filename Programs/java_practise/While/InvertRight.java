import java.util.*;
class InvertRight{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter A Number : ");
		int num =ob.nextInt();
			
			int i=0;
			while(i<num){
				
				int k=1;
				while(k<=i){
					System.out.print(" ");
					k++;
				}
				
				int j=num-i;
				while(j>=1){
					System.out.print(j);
					j--;
				}
				
				System.out.println();
				i++;
			}//end of while
	}
}