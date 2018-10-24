import java.util.*;
class NameTri{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = ob.nextLine();
		
		int size =name.length();
		
		for(int i=1; i<=size; i++){
			
			for(int j=1; j<=i; j++){
				
				System.out.print(name.charAt(j-1) );
			}
			
			System.out.println();
		}//
	}
	
}