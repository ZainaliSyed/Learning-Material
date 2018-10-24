import java.util.*;
class ComnaArray{
	public static void main(String args[]){
	Scanner ob  = new Scanner(System.in);
	
	
	System.out.print("Please Enter The  No :");
	int no = ob.nextInt();
	int arr []  = new int[no];
	int i;
	//System.out.print("0");
	
		for(i=1; i<=no; i= i+1){
		System.out.print(i);
		
			if(i==no){
			break;
			}
		System.out.print(",");
			
		}
	
	
	}
}