import java.util.*;
class MaxNum{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		int arr[] = new int[5]; 
		int large =arr[0];
		for(int i=0; i<5; i++){
			System.out.print("Enter "+(i+1)+" value : ");
			arr[i]=ob.nextInt();
		}
		
			for(int j=0; j<5; j++){
				
				if(large<arr[j]){
					large=arr[j];
				}
			}
		
		System.out.print("The large  no : "+large);
		
	}//end  of main
}