import java.util.*;

class SortAss{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int arr [] = {10,50,20,60,30,90,40,80} ;
	
	System.out.println(" \t The sorted Elements are : ");
	
	int i,j,temp;
	
	
	for(i=0; i<arr.length-1; i++){
	
	
		for(int k=i; k<arr.length-1; k++){
			if(arr[i]>arr[k+1]){
				temp= arr[k+1];
				arr[k+1] =arr[i];
				arr[i] = temp;
		
			}
		}
		
		System.out.println((i+1)+") "+arr[i]);
	
	}//end of outer
	
	
	
	}
}