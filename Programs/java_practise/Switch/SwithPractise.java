import java.util.*;
class SwithPractise{
	public static void main(String args[]){
			
		Scanner ob = new Scanner(System.in);	
		System.out.println("Enter Number Here : ");
		int num = ob.nextInt();
		
		switch(num){
			case 1 :
			System.out.println("1 is Pressed ");
			break;
			
			case 2:
			System.out.println("2 is Pressed ");
			break;
			
			default :
			System.out.println("INvaild Key  ");
			break;
			
		}
		
	}//end of main
}