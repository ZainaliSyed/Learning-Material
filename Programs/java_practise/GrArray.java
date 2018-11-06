import java.util.*;
class GrArray{

	public static void main(String args[]){
	Scanner ob = new Scanner (System.in);
	
	System.out.print("Please Enter The Size Of Array : ");
	int size = ob.nextInt();
	
	int [] arr = new int[size];
	int i;
	for(i=0; i<arr.length; i++){
	System.out.print("["+i+"]  =  ");
	arr[i] = ob.nextInt();
	
	}
	
	System.out.println(" \t Your Array Elements  are \n");
	int j;
	int largest = arr[0];
	int smallest = 0;
	for(j=0; j<arr.length; j++){
	System.out.println(arr[j]);
	
		if(arr[j]>largest){
		largest = arr[j];
		}
		
		if(arr[j]<arr[0]){
		smallest = arr[j];
		}
	 
	}
	
	System.out.println("The Largest no is : "+largest);
	System.out.println("The Smallest no is : "+smallest);
	
	
	
	}
}