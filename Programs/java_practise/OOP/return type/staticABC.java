import java.util.*;
class staticABC{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		
		while(true){
				
			System.out.print("Enter Any Character : ");
			char ch = ob.nextLine().charAt(0);
		
			staticSentence.Sentence(ch);
			if(ch=='0'){
				System.exit(0);
			}
			
		}
		 
	}//end of main
}