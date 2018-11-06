import java.util.*;
	class Intertion{
		public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
			System.out.print("Enter Number of Array : ");
			int num = ob.nextInt();
			
			int arr[] = new int[num];
			
			for(int i=0; i<arr.length; i++){
				System.out.print("["+i+"] = ");
				arr[i] =ob.nextInt();
			}
			
			System.out.print("Insert The Location : ");
			int loc =ob.nextInt();
			
			System.out.print("Insert The Item : ");
			int item =ob.nextInt();
			
			//int temp =arr[item];
				for(int j=num-1; j>loc; j--){
					//int temp =arr[j+1];
					arr[j]=arr[j-1];
					
				}
				arr[loc]=item;
				for(int k=0; k<arr.length; k++){
					System.out.println("["+k+"] = "+arr[k]);
				}
			
		}
	}