import java.util.*;

class Delete{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Enter Size Of Array : ");
	int size = ob.nextInt();
	int arr [] = new int [size];
	
	int i; 
	for(i=0; i<arr.length; i++){
	System.out.print("["+i+"] =");
	arr[i] =ob.nextInt();
	}
	System.out.print("Enter the Item you want to delete  ");
	int loc = ob.nextInt();
	
	int j;
	for(j=loc; j<arr.length-1; j++){
	arr[j] = arr[j+1];	
	}
	
	arr[arr.length-1] =0;
	
	int k;
	for(k=0; k<arr.length; k++){
	System.out.println("["+k+"] = "+arr[k]);
	}
	
	}
}