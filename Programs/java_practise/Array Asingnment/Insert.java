import java.util.*;

class Insert{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Enter Array Size");
	int size = ob.nextInt();
	
	int arr [] = new int[size];
		
		int i;
		
		for(i=0; i<arr.length; i++){
		System.out.print("["+i+"] =" );
		arr[i] = ob.nextInt();
		
		}
	
		System.out.print("Enter Location :");
		int loc = ob.nextInt();
		
		System.out.print("Enter Item :");
		int item = ob.nextInt();
		
		
		
		for(int j=arr.length-1; j>loc; j--){
		
		arr[j] = arr[j-1];
		}
		arr[loc] = item;
		for(int r=0;r<arr.length;r++){
		
			System.out.println("["+r+"]="+arr[r] );
		
		}
	}

}