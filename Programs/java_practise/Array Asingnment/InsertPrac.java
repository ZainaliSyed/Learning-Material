import java.util.*;

class InsertPrac{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Enter The Size of Array :");
	int size = ob.nextInt();
	
	int arr [] = new int [size];
	int i;
	for(i=0; i<arr.length; i++){
	
	System.out.print("["+i+"] ");
	arr[i] = ob.nextInt();
	
	}
	
	
	System.out.print("Enter The Location  :");
	int loc = ob.nextInt();
	
	System.out.print("Enter The Item:");
	int item = ob.nextInt();
	
	int j,temp; 
	for(j=loc; j<arr.length-1; j++){
	//temp = arr[];
	arr[j+1] = arr[j];
	}
	
	arr[loc] =item;
	int k;
	for(k=0; k<arr.length; k++){
	System.out.println("["+k+"] "+arr[k]);
	}
 	
	}
}