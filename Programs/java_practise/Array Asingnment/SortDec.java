import java.util.*;

class SortDec{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int arr[] = {10,50,20,60,30,90,40,80};
	int i,temp;
	
	
	System.out.println("Array in decending Order \n");
	
	for(i=0; i<=arr.length-1; i++){
	
		if(arr[i]<arr[i+1]){
		
		temp = arr[i+1];
		arr[i+1] = arr[i];
		arr[i] =temp;
		}
		System.out.println((i+1)+") "+arr[i]);
	}
	
	
	
	}
}