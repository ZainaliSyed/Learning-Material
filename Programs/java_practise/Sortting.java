import java.util.*;
	class Sortting{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter The Size of Array  : ");
	int size = ob.nextInt();
	
	int arr [] = new int[size];
	
	System.out.println("Please Enter "+size+" Elements ");
	
	int i;
	int j;
	int temp ;
	
	int src =0; 
	int dest = 1;
	
	for(i=0; i<arr.length; i++){
	System.out.print("["+i+"] = ");
	arr[i] = ob.nextInt();
	
		
	}
	
	System.out.println("\n \t The Sorted Element are :");
	
	for(j=0; j<arr.length; j++){
		
		temp =arr[0];
		arr[0] =arr[1];
		arr[1]=temp;
		
		System.out.println(arr[j]);
	} 
	
	
	
	
	}
}