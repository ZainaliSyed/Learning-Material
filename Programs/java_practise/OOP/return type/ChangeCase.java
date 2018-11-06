import java.util.*;
class ChangeCase{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter z to exit ");
			System.out.print("Enter A Character : ");
			char  ch = ob.next().charAt(0);
		
			ChangeCaseClass obj = new ChangeCaseClass();
			char c = obj.Character(ch);
			System.out.println(c);
			
			if(ch=='z' || ch=='Z'){
				System.exit(0);
			}
		
			
		}
		
		
	}//end of main method 
}