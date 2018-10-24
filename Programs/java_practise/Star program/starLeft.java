import java.util.*;
class starLeft{
	
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("enter Number : ");
		int num = ob.nextInt();
		
			for(int i=1; i<=num; i++){
				for(int j=num; j>=i; j--){
					System.out.print("*");
				}//inner 
				
				System.out.println("");
				
			}//outter 
		
		
	}
	

}