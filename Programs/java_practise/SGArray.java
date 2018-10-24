import java.util.*;
class SGArray {
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	
	System.out.print("Please Enter The Size of Array : ");
	int size = ob.nextInt();
	
	int [] arr = new int[size];
		
		System.out.println("Please Enter  "+size+" Element ");
		int i;
		for( i=0; i<arr.length; i++){
		System.out.print("["+i+"] = ");
		arr[i] = ob.nextInt();
		
		}
		
		System.out.print("Please Enter The No You Like :  ");
		int no = ob.nextInt();
		
		int loc =0;
		int j;
		
		for( j=0; j<arr.length; j++){
		   if(arr[j]==no){
		     loc = j;
			 System.out.println(no+"is Found and it's loc"+j);
		   }
		}
		
		if(arr[loc]!=no){
		System.out.println("The "+no+" Does not exist ..!!! ");
		}
			
	}
}