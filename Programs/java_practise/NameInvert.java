import java.util.*;
class NameInvert{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Your Number : ");
		String name = ob.nextLine();
		int size = name.length()-1;
		
		for(int i=size; i>=0; i-- ){
			//System.out.print(i);
			System.out.print(name.charAt(i));
		}
		
	}// end of main 
}