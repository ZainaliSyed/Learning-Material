import java.util.*;
class NestedTAb{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Table No : ");
		int tab = ob.nextInt();
		
		System.out.println("Enter number for count:");
		int till=ob.nextInt();
		
		for(int i=1; i<=tab; i++){
			
			for(int j=1; j<=till; j++){
				
				System.out.println(i+"x"+j+" = "+(i*j));
			}//inner 
			System.out.println("");
			
		}//outter 
		
		
	}
	
}