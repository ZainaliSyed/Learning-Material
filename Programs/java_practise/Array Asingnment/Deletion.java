import java.util.*;
class Deletion{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter length of array  : ");
		int num = ob.nextInt();
		
		int arr[] = new int [num];
		
			for(int i=0; i<num; i++){
				System.out.print("["+i+"] = ");
				arr[i] =ob.nextInt();
			}
			
			System.out.print("Enter The Location You Want to Delete : ");
			int loc =ob.nextInt();
							
				
				for(int j=loc; j<arr.length-1; j++){
				arr[j] =arr[j+1];
				}	
				arr[arr.length-1]=0;
				
				for(int k=0; k<arr.length; k++){
					System.out.println("["+k+"] = "+arr[k]);
				}
				
				
			
	}
}