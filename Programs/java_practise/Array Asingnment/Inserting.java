import java.util.*;

class Inserting{
	public static void main(String args[]){
	Scanner ob  =new Scanner(System.in);
	
	System.out.print("Please Enter  Size");
	int size = ob.nextInt();
	
	int arr [] = new int[size];
	int i;
	for(i=0;i<arr.length; i++){
	System.out.print("["+i+"] = ");
	arr[i] =ob.nextInt();
	}
	
	System.out.print("Please Enter  location : ");
	int loc = ob.nextInt();
	
	System.out.print("Please Enter  Item : ");
	int item = ob.nextInt();
		
		
		
		int j;
		for(j=arr.length-1; j>loc; j--){
		
		arr[j] =arr[j-1];
		
		}
		arr[loc] =item;
				
		int k;
		for(k=0; k<arr.length; k++){
		System.out.println(" ["+k+"] = "+arr[k]);
		}
		
	}
	
}