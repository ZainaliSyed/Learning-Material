import java.util.*;
class StaticCharaMain{
	
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		while(true){
		
			System.out.print("Enter Any Character : ");
			char ch = ob.nextLine().charAt(0);
			System.out.println("");
		
			StaticChara.Character(ch);		
			if(ch=='0'){
				System.exit(0);
			}
		}
		 
		
	}//end main 
	
}//end of class 