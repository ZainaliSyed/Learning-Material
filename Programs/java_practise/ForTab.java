import java.util.*;
class ForTab{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print(" Enter Table Number : ");
		int tab = ob.nextInt();
		
		System.out.print("Enter Number for till : ");
		int upperLimit = ob.nextInt();
		
		int i;
		for(i=1; i<=upperLimit; i++){
			System.out.println(tab+"x"+i+"= "+tab*i);
		}// end of for 
		
	}
	
}