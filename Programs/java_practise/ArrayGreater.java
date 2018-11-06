import java.util.*;
	public class ArrayGreater{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter The Size of Array :");
	int a = ob.nextInt();
	int [] arr = new int [a];
	int i,small=0,index=1,last = 0, indexLast = 1;
	
	for (i=0; i<arr.length; i++){
		 System.out.print("Please Enter The "+(i+1)+" Element : ");
		 arr[i] = ob.nextInt();
		}
		
		int k;
		int s ;
		for (s=0; s<arr.length; s++){
			for(k=0; k<arr.length; k++){
				if(arr[s]<arr[k]){
					small =arr[s];
					index =s;
				} 
			}
		}
		
		
		int l;
		last = arr.length;
		for (g=0; g<arr.length; g++){
			for(l=0; l<arr.length; l++){
		
		 if(arr[g]>arr[l]){
		 
		 last =arr[g];
		 indexLast =g;
		 
			} 
			}
		} 
		
		
		
		System.out.println(" The  smaller no is  "+small+ " at position :"+(index+1));
		System.out.println(" The  greater no is  "+last);		
	
	
	
	}
	}