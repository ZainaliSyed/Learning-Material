import java.util.*;
 class EvenOdd{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		int arr[] =new int [5];
			for(int i=0; i<5; i++){
				System.out.print("Enter "+(i+1)+" value : ");
				arr[i]=ob.nextInt();
			
			}
			int even =0;
			int counter=0;
			for(int j=0; j<5; j++ ){
				if(arr[j]%2==0){
					//even=arr[j];
					counter=counter+1;
				}
				
			}
			System.out.println("Even Values are : "+counter);
			
			int odd=0,counterOdd=0;
			for(int k=0; k<5; k++){
				
				if(arr[k]%2!=0){
					//odd=arr[k];
					counterOdd= counterOdd+1;
				}
			}
			System.out.print("Odd Number are :"+counterOdd);
	}
 }