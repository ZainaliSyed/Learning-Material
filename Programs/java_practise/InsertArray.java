import java.util.*;
	public class InsertArray{
	public static void main(String args[]){
	
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter the Array : ");
	int size = ob.nextInt();
	int [] arr = new int[size];
		
		int i;
		for(i=0; i<arr.length; i++){
		System.out.print("["+i+"] = ");
		arr[i] = ob.nextInt();
		
		}
		
		System.out.print("Enter The Item : ");
		int item = ob.nextInt();
		
		System.out.print(" Enter The Location : ");
		int loc = ob.nextInt();	
		
		int insert;
		System.out.println("  \t The inserted Element are .");
		
		int j,move,fowMove;
		for(j=loc; j<arr.length; j++){
		if(insert==loc){
		move=arr[loc];
		fowMove=arr[loc+1];
		arr[insert]=move;
		}
		
		}//end of loop
		for(insert=0; insert<arr.length; insert++){
		
			if(insert==loc){
			arr[insert]=item;
			
			
		
		
		}// end of if
		
		
		System.out.println("["+insert+"] = "+arr[insert]);
			}
		 
		
		
		
	}
	}